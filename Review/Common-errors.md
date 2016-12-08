# Common programming errors

## It can't be both...

When using an if statement with multiple sub-expressions, it can be easy to mix up when to use && and when to use ||.

**Example:**

        if ( choice != "y" || choice != "n" )
        {
            cout << "Invalid choice!" << endl;
        }
        
What's wrong with the code above?

Let's look at the sub-expressions...:

<table>
    <tr>
    <th>Value of choice</th>
    <th>choice != "y"?</th>
    <th>choice != "n"?</th>
    </tr>
    
    <tr>
    <td>y</td>
    <td>false</td>
    <td>true</td>
    </tr>
    
    <tr>
    <td>n</td>
    <td>true</td>
    <td>false</td>
    </tr>
    
    <tr>
    <td>abcd</td>
    <td>true</td>
    <td>true</td>
    </tr>
</table>

In this case, using an **OR** operator says that, if at least one of the sub-expressions is true,
then execute the internal code.

If the user selects "y", then the user has NOT selected "n", so it still displays *"Invalid choice!"*.

The proper way to check would be:

        if ( choice != "y" && choice != "n" )
        {
            // It is neither "y" nor "n".
            cout << "Invalid choice!" << endl;
        }
        
or:

        if ( ! ( choice == "y" || choice == "n" ) )
        {
            // It is neither "y" nor "n".
            cout << "Invalid choice!" << endl;
        }


## Not understanding scope

A common error is to assume that two variables are the same as long as their name is the same. 
This is not the case! Names can be reused across the program.

A variable declared **within a method** only exists within that method.
Other methods will not have access to that variable.

**Example:**

    int AddTwo( int a, int b )
    {
      int sum = a + b;
      return sum;
    }

    void main()
    {
      int a = 5, b = 10;
      int sum;

      // Invalid! sum has not been assigned a value.
      System.out.println( "Sum: " + sum );
    }

In this case, there is a method called AddTwo that assigns a value to a variable named **sum**. 
However, this is not the same variable as the main() function's **sum**. They are totally separate!
So in this case, the program won't build (in Java) because main()'s sum was never assigned a value,
but we're trying to output its value with System.out.println.

## Not saving a return value

Functions that have a return type will return data. This data needs to go somewhere.

It is a common error to call such a function, but not assign its return value to any variables.

**Example:**

    int AddTwo( int a, int b )
    {
      int sum = a + b;
      return sum;
    }

    void main()
    {
      int a = 5, b = 10;
      int sum;
      AddTwo( a, b ); // Problem! Not storing the return value

      // Invalid! sum has not been assigned a value.
      System.out.println( "Sum: " + sum );
    }

In this case, AddTwo is being called. It is going to add 5 and 10 together, and return 15.
However, 15 is not being stored anywhere once the function returns to main().

Again, AddTwo's **sum** and main's **sum** are totally different variables, so the value of 15
is not being assigned to main's **sum**, either. In order to do that, our code would have to look like:

    // Pass in a and b as input, and store the output in sum
    int sum = AddTwo( a, b );

If you do not assign the function to a variable, then its return value will be lost forever.

## Outputting when you should be returning

Sometimes, the requirements ask you to **return** some data from a function. A common error is to actually just output that data, rather than returning it. Make sure you understand the instructions!

**Example:**

Create a function that sums together three values and returns the result. It works with doubles.

**Yes:**

    double Sum( double a, double b, double c )
    {
      double sum = a + b + c;
      return sum;
    }


**No:**

    double Sum( double a, double b, double c )
    {
      double sum = a + b + c;
      System.out.println( sum );
    }

