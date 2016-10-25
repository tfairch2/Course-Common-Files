import java.util.Scanner;

public class Math_PerimeterCalculator
{
    public static void main( String args[] )
    {
        Scanner scanner = new Scanner( System.in );
        double width, length;
        
        System.out.println( "PERIMETER CALCULATOR" );
        System.out.print( "Enter the width and length: " );
        width = scanner.nextDouble();
        length = scanner.nextDouble();
        
        // Order of operations
        double area = 2 * width + 2 * length;
        
        System.out.println( "Area: " + area );
    }
}
