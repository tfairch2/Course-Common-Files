# Variables - Example Programs

Programs that display text to the screen and use variables.

---

## Cookie Recipe Version 2

### C++

    #include <iostream>
    using namespace std;

    int main()
    {
        // Store amount for each
        float cupsOfButter = 1.0;
        float cupsOfWhiteSugar = 1.0;
        float cupsOfBrownSugar = 1.0;
        float cupsOfFlour = 3.0;
        float cupsOfWalnuts = 1.0;
        float cupsOfChocolateChips = 2.0;
        float eggs = 2.0;
        float teaspoonsOfVanilla = 2.0;
        float teaspoonsOfBakingSoda = 1.0;
        float teaspoonsOfWater = 2.0;
        float teaspoonsOfSalt = 0.5;

        // Output recipe information 
        cout << "Chocolate Chip Cookies" << endl;
        cout << cupsOfButter << " cups butter, softened " << endl;
        cout << cupsOfWhiteSugar << " cups white sugar" << endl;
        cout << cupsOfBrownSugar << " cups packed brown sugar" << endl;
        cout << eggs << " eggs" << endl;
        cout << teaspoonsOfVanilla << " teaspoons vanilla extract" << endl;
        cout << cupsOfFlour << " cups all-purpose flour" << endl;
        cout << teaspoonsOfBakingSoda << " teaspoon baking soda" << endl;
        cout << teaspoonsOfWater << " teaspoons hot water" << endl;
        cout << teaspoonsOfSalt << " teaspoons salt" << endl;
        cout << cupsOfChocolateChips << " cups semisweet chocolate chips" << endl;
        cout << cupsOfWalnuts << " cups chopped walnuts" << endl;

        return 0;
    }

### Java

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

### Python

    cupsOfButter = 1.0
    cupsOfWhiteSugar = 1.0
    cupsOfBrownSugar = 1.0
    cupsOfFlour = 3.0
    cupsOfWalnuts = 1.0
    cupsOfChocolateChips = 2.0
    eggs = 2.0
    teaspoonsOfVanilla = 2.0
    teaspoonsOfBakingSoda = 1.0
    teaspoonsOfWater = 2.0
    teaspoonsOfSalt = 0.5

    print( "Chocolate Chip Cookies" )
    print( str( cupsOfButter ) + " cup butter, softened" )
    print( str( cupsOfWhiteSugar ) + " cup white sugar" )
    print( str( cupsOfBrownSugar ) + " cup packed brown sugar" )
    print( str( eggs ) + " eggs" )
    print( str( teaspoonsOfVanilla ) + " teaspoons vanilla extract" )
    print( str( cupsOfFlour ) + " cups all-purpose flour" )
    print( str( teaspoonsOfBakingSoda ) + " teaspoon baking soda" )
    print( str( teaspoonsOfWater ) + " teaspoons hot water" )
    print( str( teaspoonsOfSalt ) + " teaspoons salt" )
    print( str( cupsOfChocolateChips ) + " cups semisweet chocolate chips" )
    print( str( cupsOfWalnuts ) + " cup chopped walnuts" )

