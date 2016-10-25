import java.util.Scanner;
import java.io.*;

public class CsvProgram
{
    Scanner input;
    FileOutputter output;
    
    public CsvProgram()
    {
        input = new Scanner( System.in );
        main();
    }
    
    public void main()
    {
        output = new FileOutputter( "schedule.csv" );
        output.println( "TIME,EVENT" );
        
        boolean done = false;
        while ( !done )
        {
            System.out.print( "\n(a)dd new schedule item, or (q)uit? " );
            String choice = input.nextLine();
            
            if ( choice.equals( "a" ) )
            {
                addItem();
            }
            else if ( choice.equals( "q" ) )
            {
                done = true;
            }
        }
    }
    
    public void addItem()
    {
        System.out.print( "Enter an event name: " );
        String event = input.nextLine();
        System.out.print( "Enter the event time: " );
        String time = input.nextLine();
        
        output.println( time + "," + event );
    }
}
