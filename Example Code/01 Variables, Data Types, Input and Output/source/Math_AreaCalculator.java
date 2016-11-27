import java.util.Scanner;

public class Math_AreaCalculator
{
    public static void main( String args[] )
    {
        Scanner scanner = new Scanner( System.in );
        double width, length;
        
        System.out.println( "AREA CALCULATOR" );
        System.out.print( "Enter the width and length: " );
        width = scanner.nextDouble();
        length = scanner.nextDouble();
        
        double area = width * length;
        
        System.out.println( "Area: " + area );
    }
}
