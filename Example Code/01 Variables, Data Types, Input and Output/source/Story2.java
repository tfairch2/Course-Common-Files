import java.util.Scanner;

public class Story2
{
	public static void main( String args[] )
	{
        // Using input and concatenation
        Scanner scanner = new Scanner( System.in );
        
        System.out.print( "Enter a job or role: " );
        String job1 = scanner.nextLine();
        System.out.print( "Enter another job or role: " );
        String job2 = scanner.nextLine();
        System.out.print( "Enter an adjective: " );
        String adjective = scanner.nextLine();
        
        System.out.println( "\n" );
        System.out.println( "Once upon a time there was a " + job1 + " who wanted to marry a " + job2 + "; but she would have to be a " + adjective + " " + job2 + "." );
        System.out.println( "He travelled all over the world to find one, but nowhere could he get what he wanted." );
        System.out.println( "There were " + job2 + "s enough, but it was difficult to find out whether they were " + adjective + " ones." );
        System.out.println( "There was always something about them that was not as it should be." );
        System.out.println( "So he came home again and was sad, for he would have liked very much to have a " + adjective + " " + job2 + ". " );
    }
}
