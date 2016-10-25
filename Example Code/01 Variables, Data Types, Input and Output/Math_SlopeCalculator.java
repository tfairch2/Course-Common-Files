import java.util.Scanner;

public class Math_SlopeCalculator
{
    public static void main(String args[])
    {
        // Casting and division of integers,
        // ask why we should make the coordinate pairs doubles instead of ints.
        Scanner scanner = new Scanner( System.in );
        int x1, y1, x2, y2;
        
        System.out.println( "SLOPE CALCULATOR" );
        System.out.print( "Enter the first coordinate pair x, y: " );
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        
        System.out.print( "Enter the second coordinate pair x, y: " );
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        
        int slopeNumerator = y2 - y1;
        int slopeDenominator = x2 - x1;
        
        // Rise / Run
        double slope = (double)slopeNumerator / (double)slopeDenominator;
        
        System.out.println( "The slope is " + slope 
            + " \t (" + slopeNumerator + "/" + slopeDenominator + ")" );
    }
}
