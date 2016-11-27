import java.util.Scanner;

public class SongLyrics2
{
	public static void main( String args[] )
	{
        // Using input and concatenation
        Scanner scanner = new Scanner( System.in );
        
        System.out.print( "Enter an activity: " );
        String activity = scanner.nextLine();
        System.out.print( "Enter an inter-personal relationship: " );
        String relationship = scanner.nextLine();
        
        System.out.println( "\n\nSAFETY " + activity.toUpperCase() + " - MEN WITHOUT HATS" );
        System.out.println( "We can " + activity + " if we want to." );
        System.out.println( "We can leave your " + relationship + "s behind." );
        System.out.println( "'Cuz your " + relationship + "s don't " + activity + "," );
        System.out.println( "and if they don't " + activity + "," );
        System.out.println( "well they're no " + relationship + "s of mine." );
    }
}
