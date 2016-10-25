import java.util.Scanner;

// Chocolate Chip cookie ingredients from:
// http://allrecipes.com/recipe/10813/best-chocolate-chip-cookies/

public class CookieRecipe2
{
	public static void main( String args[] )
	{
        // Adding variables - store the quantities in variables, concatenate to the strings
        double cupsOfButter = 1.0, cupsOfWhiteSugar = 1.0,
            cupsOfBrownSugar = 1.0, cupsOfFlour = 3.0,
            cupsOfWalnuts = 1.0, cupsOfChocolateChips = 2.0, eggs = 2.0,
            teaspoonsOfVanilla = 2.0, teaspoonsOfBakingSoda = 1.0,
            teaspoonsOfWater = 2.0, teaspoonsOfSalt = 0.5;
        
        System.out.println( "Chocolate Chip Cookies" );
        System.out.println( cupsOfButter + " cups butter, softened " );
        System.out.println( cupsOfWhiteSugar + " cups white sugar" );
        System.out.println( cupsOfBrownSugar + " cups packed brown sugar" );
        System.out.println( eggs + " eggs" );
        System.out.println( teaspoonsOfVanilla + " teaspoons vanilla extract" );
        System.out.println( cupsOfFlour + " cups all-purpose flour" );
        System.out.println( teaspoonsOfBakingSoda + " teaspoon baking soda" );
        System.out.println( teaspoonsOfWater + " teaspoons hot water" );
        System.out.println( teaspoonsOfSalt + " teaspoons salt" );
        System.out.println( cupsOfChocolateChips + " cups semisweet chocolate chips" );
        System.out.println( cupsOfWalnuts + " cups chopped walnuts" );
    }
}
