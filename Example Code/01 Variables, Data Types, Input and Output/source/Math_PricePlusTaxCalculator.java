import java.util.Scanner;

public class Math_PricePlusTaxCalculator
{    
    public static void main( String args[] )
    {
        Scanner scanner = new Scanner( System.in );
        
        System.out.println( "PRICE PLUS TAX CALCULATOR" );
        
        System.out.print( "Enter the price: " );
        double price = scanner.nextDouble();
        
        System.out.print( "Enter the tax rate: " );
        double tax = scanner.nextDouble();
        
        double pricePlusTax = price + price * tax;
        
        System.out.println( "Price plus tax: " + pricePlusTax );
    }
}
