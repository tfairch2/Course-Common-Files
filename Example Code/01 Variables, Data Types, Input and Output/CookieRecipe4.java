import java.util.Scanner;

// Chocolate Chip cookie ingredients from:
// http://allrecipes.com/recipe/10813/best-chocolate-chip-cookies/

public class CookieRecipe4
{
	public static void main( String args[] )
	{
        // Methods, If Statements (extra) - Check to see if ingredients should say "cup" or "cups", etc.
        Scanner scanner = new Scanner( System.in );
        double cupsOfButter = 1.0, cupsOfWhiteSugar = 1.0,
            cupsOfBrownSugar = 1.0, cupsOfFlour = 3.0,
            cupsOfWalnuts = 1.0, cupsOfChocolateChips = 2.0, eggs = 2.0,
            teaspoonsOfVanilla = 2.0, teaspoonsOfBakingSoda = 1.0,
            teaspoonsOfWater = 2.0, teaspoonsOfSalt = 0.5;
            
        System.out.println( "How many servings do you want to make?" );
        System.out.print( "Enter a ratio, can have decimal: " );
        double ratio = scanner.nextDouble();
        
        example4_formatIngredients( cupsOfButter * ratio, "cup", "butter, softened " );
        example4_formatIngredients( cupsOfWhiteSugar * ratio, "cup", "white sugar" );
        example4_formatIngredients( cupsOfBrownSugar * ratio, "cup", "packed brown sugar" );
        example4_formatIngredients( eggs * ratio, "egg", "" ); // need another method for this?
        example4_formatIngredients( teaspoonsOfVanilla * ratio, "teaspoon", "vanilla extract" );
        example4_formatIngredients( cupsOfFlour * ratio, "cup", "all-purpose flour" );
        example4_formatIngredients( teaspoonsOfBakingSoda * ratio, "teaspoon", "baking soda" );
        example4_formatIngredients( teaspoonsOfWater * ratio, "teaspoon", "hot water" );
        example4_formatIngredients( teaspoonsOfSalt * ratio, "teaspoon", "salt" );
        example4_formatIngredients( cupsOfChocolateChips * ratio, "cup", "semisweet chocolate chips" );
        example4_formatIngredients( cupsOfWalnuts * ratio, "cup", "chopped walnuts" );
    }
    
    public static void example4_formatIngredients( double amount, String measurement, String ingredient )
    {
        if ( amount == 1.0 )
        {
            System.out.printf( "%.2f %-10s %-40s \n", amount, measurement, ingredient );
        }
        else
        {
            System.out.printf( "%.2f %-10s %-30s \n", amount, measurement + "s", ingredient );
        }
    }
}
