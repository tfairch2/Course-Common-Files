import java.io.*;

public class SaveTextFile
{
    public static void main()
    {
        String filename = "alice.txt";
        
        try
        {
            FileReader fr = new FileReader( filename );
            BufferedReader br = new BufferedReader( fr );
            
            String line = null;
            int lineCount = 0;
            while ( true )
            {
                line = br.readLine();
                if ( line == null ) { break; }
                
                System.out.println( lineCount + "\t" + line );
                lineCount++;
            }
            
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
