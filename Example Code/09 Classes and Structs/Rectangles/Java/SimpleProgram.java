import java.util.Scanner;

public class SimpleProgram
{
    static Scanner scanner = new Scanner( System.in );
    
    public static void main()
    {
        Rectangle myRect = new Rectangle();
        
        System.out.print( "New rectangle width: " );
        int tempWidth = scanner.nextInt();
        
        System.out.print( "New rectangle height: " );
        int tempHeight = scanner.nextInt();
        
        myRect.Setup( tempWidth, tempHeight );
        
        System.out.print( "Area: " );
        System.out.println( myRect.GetArea() );
        System.out.print( "Perimeter: " );
        System.out.println( myRect.GetPerimeter() );
        System.out.print( "Square? " );
        System.out.println( myRect.IsSquare() );
    }
}