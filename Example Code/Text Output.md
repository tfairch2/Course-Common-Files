# Text Output - Example Programs

## Cookie Recipe Version 1

This program only displays contents of a recipe to the screen.

### C++

    #include <iostream>
    using namespace std;

    int main()
    {
        // Output recipe information 
        cout << "Chocolate Chip Cookies" << endl;
        cout << "1 cup butter, softened " << endl;
        cout << "1 cup white sugar" << endl;
        cout << "1 cup packed brown sugar" << endl;
        cout << "2 eggs" << endl;
        cout << "2 teaspoons vanilla extract" << endl;
        cout << "3 cups all-purpose flour" << endl;
        cout << "1 teaspoon baking soda" << endl;
        cout << "2 teaspoons hot water" << endl;
        cout << "0.5 teaspoons salt" << endl;
        cout << "2 cups semisweet chocolate chips" << endl;
        cout << "1 cup chopped walnuts" << endl;

        return 0;
    }

### Java

    import java.util.Scanner;

    // Chocolate Chip cookie ingredients from:
    // http://allrecipes.com/recipe/10813/best-chocolate-chip-cookies/

    public class CookieRecipe1
    {
      public static void main( String args[] )
      {
            // Just outputting - Display a recipe
            System.out.println( "Chocolate Chip Cookies" );
            System.out.println( "1 cup butter, softened " );
            System.out.println( "1 cup white sugar" );
            System.out.println( "1 cup packed brown sugar" );
            System.out.println( "2 eggs" );
            System.out.println( "2 teaspoons vanilla extract" );
            System.out.println( "3 cups all-purpose flour" );
            System.out.println( "1 teaspoon baking soda" );
            System.out.println( "2 teaspoons hot water" );
            System.out.println( "0.5 teaspoons salt" );
            System.out.println( "2 cups semisweet chocolate chips" );
            System.out.println( "1 cup chopped walnuts" );
        }
    }

### Python

    print( "Chocolate Chip Cookies" )
    print( "1 cup butter, softened" )
    print( "1 cup white sugar" )
    print( "1 cup packed brown sugar" )
    print( "2 eggs" )
    print( "2 teaspoons vanilla extract" )
    print( "3 cups all-purpose flour" )
    print( "1 teaspoon baking soda" )
    print( "2 teaspoons hot water" )
    print( "0.5 teaspoons salt" )
    print( "2 cups semisweet chocolate chips" )
    print( "1 cup chopped walnuts" )

---

## Song Lyrics - Version 1

This program just displays song lyrics to the screen

### C++

    #include <iostream>
    using namespace std;

    int main()
    {
        // Just display song lyrics
        cout << "SAFETY DANCE - MEN WITHOUT HATS" << endl;
        cout << "We can dance if we want to."  << endl;
        cout << "We can leave your friends behind."  << endl;
        cout << "'Cuz your friends don't dance,"  << endl;
        cout << "and if they don't dance,"  << endl;
        cout << "well they're no friends of mine."  << endl;

        return 0;
    }
 
### Java

    import java.util.Scanner;

    public class SongLyrics1
    {
        public static void main( String args[] )
        {
            // Output - Just outputting the text
            System.out.println( "SAFETY DANCE - MEN WITHOUT HATS" );
            System.out.println( "We can dance if we want to." );
            System.out.println( "We can leave your friends behind." );
            System.out.println( "'Cuz your friends don't dance," );
            System.out.println( "and if they don't dance," );
            System.out.println( "well they're no friends of mine." );
        }
    }

### Python

    print( "SAFETY DANCE - MEN WITHOUT HATS" )
    print( "We can dance if we want to."  )
    print( "We can leave your friends behind."  )
    print( "'Cuz your friends don't dance,"  )
    print( "and if they don't dance,"  )
    print( "well they're no friends of mine." )

---

## Story - Version 1

This program just displays a story to the screen

### C++

        #include <iostream>
        #include <string>
        using namespace std;

        int main()
        {    
            // Just story
            cout << "THE PRINCESS AND THE PEA by Hans Christian Andersen" << endl;
            cout << "Once upon a time there was a prince who wanted to marry a princess; but she would have to be a real princess." << endl;
            cout << "He travelled all over the world to find one, but nowhere could he get what he wanted." << endl;
            cout << "There were princesses enough, but it was difficult to find out whether they were real ones." << endl;
            cout << "There was always something about them that was not as it should be." << endl;
            cout << "So he came home again and was sad, for he would have liked very much to have a real princess. " << endl;

            return 0;
        }

### Java

    import java.util.Scanner;

    public class Story1
    {
        public static void main( String args[] )
        {
            // Output - Just outputting the text
            // Who is this guy to judge what's a "real princess" anyway??
            System.out.println( "THE PRINCESS AND THE PEA by Hans Christian Andersen" );
            System.out.println( "Once upon a time there was a prince who wanted to marry a princess; but she would have to be a real princess." );
            System.out.println( "He travelled all over the world to find one, but nowhere could he get what he wanted." );
            System.out.println( "There were princesses enough, but it was difficult to find out whether they were real ones." );
            System.out.println( "There was always something about them that was not as it should be." );
            System.out.println( "So he came home again and was sad, for he would have liked very much to have a real princess. " );
        }
    }

### Python

    print( "THE PRINCESS AND THE PEA by Hans Christian Andersen" )
    print( "Once upon a time there was a prince who wanted to marry a princess; but she would have to be a real princess." )
    print( "He travelled all over the world to find one, but nowhere could he get what he wanted." )
    print( "There were princesses enough, but it was difficult to find out whether they were real ones." )
    print( "There was always something about them that was not as it should be." )
    print( "So he came home again and was sad, for he would have liked very much to have a real princess. " )
