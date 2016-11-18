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
