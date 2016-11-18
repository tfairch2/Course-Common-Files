import java.util.Scanner;

public class Math_QuadraticFormula
{    
    public static void main( String args[] )
    {
        Scanner scanner = new Scanner( System.in );
        double a, b, c;
        
        System.out.println( "QUADRATIC EQUATION" );
        System.out.println( "ax^2 + bx + c" );
        System.out.print( "Enter a, b, and c: " );
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        
        double x1, x2;
        
        x1 = ( -b + Math.sqrt( b*b - 4*a*c ) ) / 2 * a;
        x2 = ( -b - Math.sqrt( b*b - 4*a*c ) ) / 2 * a;
        
        System.out.println( "X1: " + x1 );
        System.out.println( "X2: " + x2 );
    }
}
