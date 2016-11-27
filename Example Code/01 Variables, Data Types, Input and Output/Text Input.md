# Text Input - Example Programs

Programs that utilize text input and output for simple programs.

---

## Cookie Recipe Version 3

Allows use to specify how many batches that they are going to make
and adjusts the ingredients quantities.

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

    ratio = input( "How many batches do you want to make? (1 for normal, or other ratio): " )

    print( "Chocolate Chip Cookies" )
    print( str( cupsOfButter * ratio ) + " cup butter, softened" )
    print( str( cupsOfWhiteSugar * ratio ) + " cup white sugar" )
    print( str( cupsOfBrownSugar * ratio ) + " cup packed brown sugar" )
    print( str( eggs * ratio ) + " eggs" )
    print( str( teaspoonsOfVanilla * ratio ) + " teaspoons vanilla extract" )
    print( str( cupsOfFlour * ratio ) + " cups all-purpose flour" )
    print( str( teaspoonsOfBakingSoda * ratio ) + " teaspoon baking soda" )
    print( str( teaspoonsOfWater * ratio ) + " teaspoons hot water" )
    print( str( teaspoonsOfSalt * ratio ) + " teaspoons salt" )
    print( str( cupsOfChocolateChips * ratio ) + " cups semisweet chocolate chips" )
    print( str( cupsOfWalnuts * ratio ) + " cup chopped walnuts" )

---

## Song Lyrics Version 2

### C++

    #include <iostream>
    #include <string>
    using namespace std;

    int main()
    {
        // Get new lyrics
        cout << "Enter an activity: ";
        string activity;
        cin >> activity;

        cout << "Enter an inter-personal relationship: ";
        string relationship;
        cin >> relationship;

        // Just display song lyrics
        cout << "SAFETY " << activity << " - MEN WITHOUT HATS" << endl;
        cout << "We can " << activity << " if we want to."  << endl;
        cout << "We can leave your " << relationship << "s behind."  << endl;
        cout << "'Cuz your " << relationship << "s don't " << activity << ","  << endl;
        cout << "and if they don't " << activity << ","  << endl;
        cout << "well they're no " << relationship << "s of mine."  << endl;

        return 0;
    }

### Java

    import java.util.Scanner;

    public class SongLyrics2
    {
      public static void main( String args[] )
      {
            // Using input and concatenation
            Scanner scanner = new Scanner( System.in );

            System.out.print( "Enter an activity: " );
            String activity = scanner.nextLine();
            System.out.print( "Enter an inter-personal relationship: " );
            String relationship = scanner.nextLine();

            System.out.println( "\n\nSAFETY " + activity.toUpperCase() + " - MEN WITHOUT HATS" );
            System.out.println( "We can " + activity + " if we want to." );
            System.out.println( "We can leave your " + relationship + "s behind." );
            System.out.println( "'Cuz your " + relationship + "s don't " + activity + "," );
            System.out.println( "and if they don't " + activity + "," );
            System.out.println( "well they're no " + relationship + "s of mine." );
        }
    }

### Python

    activity = raw_input( "Enter an activity: " )
    relationship = raw_input( "Enter an inter-personal relationship: " )

    print( "" )
    print( "SAFETY " + activity + " - MEN WITHOUT HATS" )
    print( "We can " + activity + " if we want to."  )
    print( "We can leave your " + relationship + " behind."  )
    print( "'Cuz your " + relationship + " don't " + activity + ","  )
    print( "and if they don't " + activity + ","  )
    print( "well they're no " + relationship + " of mine." )


---

## Story Version 2

Asks the user to enter some words for the story, then plugs those words into the story.

### C++

    #include <iostream>
    #include <string>
    using namespace std;

    int main()
    {    
        cout << "Enter a job or role: ";
        string job1;
        cin >> job1;

        cout << "Enter another job or role: ";
        string job2;
        cin >> job2;

        cout << "Enter an adjective: ";
        string adjective;
        cin >> adjective;

        cout << "THE PRINCESS AND THE PEA by Hans Christian Andersen" << endl;
        cout << "Once upon a time there was a " << job1 << " who wanted to marry a " << job2 << "; but she would have to be a " << adjective << " " << job2 << "." << endl;
        cout << "He travelled all over the world to find one, but nowhere could he get what he wanted." << endl;
        cout << "There were " << job2 << "s enough, but it was difficult to find out whether they were " << adjective << " ones." << endl;
        cout << "There was always something about them that was not as it should be." << endl;
        cout << "So he came home again and was sad, for he would have liked very much to have a " << adjective << " " << job2 << ". " << endl;

        return 0;
    }

### Java

    import java.util.Scanner;

    public class Story2
    {
      public static void main( String args[] )
      {
            // Using input and concatenation
            Scanner scanner = new Scanner( System.in );

            System.out.print( "Enter a job or role: " );
            String job1 = scanner.nextLine();
            System.out.print( "Enter another job or role: " );
            String job2 = scanner.nextLine();
            System.out.print( "Enter an adjective: " );
            String adjective = scanner.nextLine();

            System.out.println( "\n" );
            System.out.println( "Once upon a time there was a " + job1 + " who wanted to marry a " + job2 + "; but she would have to be a " + adjective + " " + job2 + "." );
            System.out.println( "He travelled all over the world to find one, but nowhere could he get what he wanted." );
            System.out.println( "There were " + job2 + "s enough, but it was difficult to find out whether they were " + adjective + " ones." );
            System.out.println( "There was always something about them that was not as it should be." );
            System.out.println( "So he came home again and was sad, for he would have liked very much to have a " + adjective + " " + job2 + ". " );
        }
    }

### Python

    job1 = raw_input( "Enter a job or role: " )
    job2 = raw_input( "Enter another job or role: " )
    adjective = raw_input( "Enter an adjective: " )

    print( "THE PRINCESS AND THE PEA by Hans Christian Andersen" )
    print( "Once upon a time there was a " + job1 + " who wanted to marry a " + job2 + "; but she would have to be a " + adjective + " " + job2 + "." )
    print( "He travelled all over the world to find one, but nowhere could he get what he wanted." )
    print( "There were " + job2 + "s enough, but it was difficult to find out whether they were " + adjective + " ones." )
    print( "There was always something about them that was not as it should be." )
    print( "So he came home again and was sad, for he would have liked very much to have a " + adjective + " " + job2 + ". " )

---

## Area Calculator

### C++

    #include <iostream>
    using namespace std;

    int main()
    {
        float width, length;
        cout << "AREA CALCULATOR" << endl;

        cout << "Enter width: ";
        cin >> width;

        cout << "Enter length: ";
        cin >> length;

        float area = width * length;

        cout << "Area: " << area << endl;    

        return 0;
    }

### Java

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

### Python

    print( "AREA CALCULATOR" )

    width = input( "Enter width: " )
    length = input( "Enter length: " )

    area = width * length;

    print( "Area: " + str( area ) )

---

## Perimeter Calculator

### C++

    #include <iostream>
    using namespace std;

    int main()
    {
        float width, length;
        cout << "PERIMETER CALCULATOR" << endl;

        cout << "Enter width: ";
        cin >> width;

        cout << "Enter length: ";
        cin >> length;

        float perimeter = 2 * width + 2 * length;

        cout << "Perimeter: " << perimeter << endl;    

        return 0;
    }

### Java

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

### Python

    print( "PERIMETER CALCULATOR" )

    width = input( "Enter width: " )
    length = input( "Enter length: " )

    perimeter = 2 * width + 2 * length;

    print( "Perimeter: " + str( perimeter ) )

---

## Fraction Multiplier

### C++

    #include <iostream>
    using namespace std;

    int main()
    {
        cout << "FRACTION MULTIPLIER" << endl;

        int num1, denom1, num2, denom2;

        // Get user input
        cout << "Enter first fraction numerator and denominator: ";
        cin >> num1 >> denom1;

        cout << "Enter second fraction numerator and denominator: ";
        cin >> num2 >> denom2;

        // Calculate result
        int prodNum, prodDenom;
        prodNum = num1 * num2;
        prodDenom = denom1 * denom2;

        // Print result
        cout << endl;  
        cout << num1 << "/" << denom1 << " x "
            << num2 << "/" << denom2 << " = "
            << prodNum << "/" << prodDenom << endl;

        return 0;
    }

### Java

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

### Python

    print( "PERIMETER CALCULATOR" )

    width = input( "Enter width: " )
    length = input( "Enter length: " )

    perimeter = 2 * width + 2 * length;

    print( "Perimeter: " + str( perimeter ) )

---

## Quadratic Formula

### C++

    #include <iostream>
    #include <cmath>
    using namespace std;

    int main()
    {
        float a, b, c;
        cout << "QUADRATIC FORMULA" << endl;

        cout << "Format: ax^2 + bx + c" << endl;
        cout << "Enter a, b, and c: ";
        cin >> a >> b >> c;

        float x1, x2;

        x1 = ( -b + sqrt( b*b - 4*a*c ) ) / 2 * a;
        x2 = ( -b - sqrt( b*b - 4*a*c ) ) / 2 * a;

        cout << "x1 = " << x1 << ", x2 = " << x2 << endl;

        return 0;
    }

### Java

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

### Python

    import math

    print( "QUADRATIC FORMULA" )

    print( "Format: ax^2 + bx + c" )
    a = input( "Enter a: " )
    b = input( "Enter b: " )
    c = input( "Enter c: " )

    x1 = ( -b + math.sqrt( b*b - 4*a*c ) ) / 2 * a
    x2 = ( -b - math.sqrt( b*b - 4*a*c ) ) / 2 * a

    # Test with a = 1, b = 2, c = -15

    print( "x1 = " + str( x1 ) + ", x2 = " + str( x2 ) )

---

## Slope Calculator

### C++

    #include <iostream>
    using namespace std;

    int main()
    {
        float x1, y1, x2, y2;
        cout << "SLOPE CALCULATOR" << endl;

        cout << "Enter first coordinate pair x, y: ";
        cin >> x1 >> y1;

        cout << "Enter second coordinate pair x, y: ";
        cin >> x2 >> y2;

        float slopeNumerator = y2 - y1;
        float slopeDenominator = x2 - x1;

        float slope = slopeNumerator / slopeDenominator;

        cout << "The slope is: " << slope
            << " or " << slopeNumerator << "/" << slopeDenominator
            << endl;

        return 0;
    }

### Java

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

### Python

    print( "SLOPE CALCULATOR" )

    x1 = input( "FIRST coordinate pair, enter x: " )
    y1 = input( "FIRST coordinate pair, enter y: " )

    x2 = input( "SECOND coordinate pair, enter x: " )
    y2 = input( "SECOND coordinate pair, enter y: " )

    slopeNumerator = y2 - y1;
    slopeDenominator = x2 - x1;

    slope = slopeNumerator / slopeDenominator

    print( "The slope is: " + str( slope ) + ", or " + str( slopeNumerator ) + "/" + str( slopeDenominator ) )
