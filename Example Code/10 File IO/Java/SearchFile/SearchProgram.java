import java.io.*;
import java.util.Scanner;

public class SearchProgram
{
    Scanner input;
    
    public SearchProgram()
    {
        input = new Scanner( System.in );
        main();
    }
    
    public void main()
    {
        boolean done = false;
        while ( !done )
        {
            System.out.print( "\n Enter search term or QUIT to quit: " );
            String choice = input.nextLine();
            
            if ( choice.equals( "QUIT" ) )
            {
                done = true;
            }
            else
            {
                search( choice );
            }
        }
    }
    
    public void search( String searchTerm )
    {
        String filename = "alice.txt";
        
        try
        {
            FileReader fr = new FileReader( filename );
            BufferedReader br = new BufferedReader( fr );
            
            String line = null;
            int lineCount = 0;
            int matchCount = 0;
            
            // Search for the searchTerm
            while ( true )
            {
                line = br.readLine();
                if ( line == null ) { break; }
                
                if ( line.contains( searchTerm ) )
                {
                    matchCount++;
                    System.out.println( " (" + matchCount + ") Match found on line " + lineCount + ": " + line );
                }
                
                lineCount++;
            }
            System.out.println( "\n Total matches: " + matchCount );
            
            br.close();
        }        
        catch( FileNotFoundException ex ) {
            System.out.println( "Error opening file " + filename );           
        }
        catch( IOException ex ) {
            System.out.println( "Error reading file " + filename );
        }
    }
}






