import java.util.Scanner;

public class Math_Fractions
{    
    public static void main( String args[] )
    {
        Scanner scanner = new Scanner( System.in );
        int num1, denom1, num2, denom2;
        
        System.out.println( "PRODUCT CALCULATOR" );
        System.out.print( "Enter the first fraction numerator & denominator: " );
        num1 = scanner.nextInt();
        denom1 = scanner.nextInt();
        
        System.out.print( "Enter the second fraction numerator & denominator: " );
        num2 = scanner.nextInt();
        denom2 = scanner.nextInt();
        
        int productNum = num1 * num2;
        int productDenom = denom1 * denom2;
        
        System.out.println( "Product: \n" + productNum + "\n---\n" + productDenom );
    }
}
