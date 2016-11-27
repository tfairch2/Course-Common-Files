import java.util.Scanner;

// Chocolate Chip cookie ingredients from:
// http://allrecipes.com/recipe/10813/best-chocolate-chip-cookies/

public class CookieRecipe3
{
	public static void main( String args[] )
	{
        // Math - allow user to input a ratio. Adjust the ingredient list quantities.
        Scanner scanner = new Scanner( System.in );
        double cupsOfButter = 1.0, cupsOfWhiteSugar = 1.0,
            cupsOfBrownSugar = 1.0, cupsOfFlour = 3.0,
            cupsOfWalnuts = 1.0, cupsOfChocolateChips = 2.0, eggs = 2.0,
            teaspoonsOfVanilla = 2.0, teaspoonsOfBakingSoda = 1.0,
            teaspoonsOfWater = 2.0, teaspoonsOfSalt = 0.5;
            
        System.out.println( "How many servings do you want to make?" );
        System.out.print( "Enter a ratio, can have decimal: " );
        double ratio = scanner.nextDouble();
        
        System.out.println( "Chocolate Chip Cookies" );
        System.out.println( cupsOfButter * ratio + " cups butter, softened " );
        System.out.println( cupsOfWhiteSugar * ratio + " cups white sugar" );
        System.out.println( cupsOfBrownSugar * ratio + " cups packed brown sugar" );
        System.out.println( eggs * ratio + " eggs" );
        System.out.println( teaspoonsOfVanilla * ratio + " teaspoons vanilla extract" );
        System.out.println( cupsOfFlour * ratio + " cups all-purpose flour" );
        System.out.println( teaspoonsOfBakingSoda * ratio + " teaspoon baking soda" );
        System.out.println( teaspoonsOfWater * ratio + " teaspoons hot water" );
        System.out.println( teaspoonsOfSalt * ratio + " teaspoons salt" );
        System.out.println( cupsOfChocolateChips * ratio + " cups semisweet chocolate chips" );
        System.out.println( cupsOfWalnuts * ratio + " cups chopped walnuts" );
    }
}
