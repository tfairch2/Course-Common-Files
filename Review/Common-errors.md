# Common programming errors

## Variables

### Backwards assignment

Let's say we have two variables: number, and newNumber. We want to assign the variable number, the value from newNumber.

A common mistake is this:

        newNumber = number;
               
This actually does the *opposite* - it assigns the variable newNumber the value of the variable number.

The correct way is this:

        number = newNumber;
        
The LHS (Left-hand side) of the = sign should be the *variable having its value changed*.

The RHS (right-hand side) of the = sign is the *value* being assigned.

--- 

## If statements

### Else is a catch-all

An if statement is of this form:

        if ( conditionA )
        {
                // ...
        }
        else if ( condition B )
        {
                // ...
        }
        else
        {
                // ...
        }

The **else** statement is a catch-all, when the if statement and none of the else-if statements are triggered. **else does not have parenthesis or a condition.**

### Bad semi-colons

If statements, while loops, as in general any line of code that **contains other code** does not end with a semi-colon.

When I say contains other code, I mean uses curly braces { } to denote code within it.

        if ( a )
        {
                // I'm inside the if statement!
        }
        
        while ( b )
        {
                // I'm inside the while loop!
        }
        
        void Blob()
        {
                // I'm inside the Blob function!
        }
        
These statements **do not end with semicolons.**

If you put a semi-colon at the end, your program might build, but its logic will not be right.  

When you write this:

        if ( age < 18 ) ; // bad semi-colon
                System.out.println( "No voting" );
               
what your code roughly translates to is this:

        if ( age < 18 )
        {
                ;
        }
        
        System.out.println( "No voting" );
        
Meaning that, no matter what the value of *age* is, the "No voting" message will be displayed no matter what - because if *age* is less than 18, then it only executes that semi-colon.

### When you're comparing if two items are equal, your equal sign needs a sequel

Wrong:

        if ( a = b )
        {
                // stuff
        }

Right:

        if ( a == b )
        {
                // stuff
        }
        
A single equal sign is *only* used for *assignment statements* (in C++ and Java).

Double-equal sign is the operator that compares if two items are equivalent.

### It can't be both...

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


---

## Functions

### Same name, different functions

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

### Not saving a return value

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

---

## Classes

### Redeclaring a class' member variable within a class

**Example:**

Another common error along the same lines is to declare a private member variable within a class,
and then turn around and declare the *same variable* inside of one of the methods:

        class Building
        {
                Room[] rooms;
                
                void Setup()
                {
                        Room[] rooms = new Room[10]; // ERROR!
                        for ( int i = 0; i < rooms.length; i++ )
                        {
                                rooms[i] = new Room();
                        }
                }
                
                Room GetRoom( int index )
                {
                        return rooms[i];
                }
        };
        
The problem with this code is that the Building's **rooms** variable is *never initialized!*. 
Within the Setup() function,
a *different* **rooms** variable is declared and initialized.
This does not carry over to the **rooms** variable declared just beneath **class Building**.

In other words: There are two totally different variables named *rooms*.
One is *local to the Building object*, and one is *local to the Setup function*.

The correct way to initialize this code would be:

        class Building
        {
                Room[] rooms;
                
                void Setup()
                {
                        rooms = new Room[10]; // NOT REDECLARING!!
                        for ( int i = 0; i < rooms.length; i++ )
                        {
                                rooms[i] = new Room();
                        }
                }
                
                Room GetRoom( int index )
                {
                        return rooms[i];
                }
        };

So that the Setup() function now *actually initializes the Building's room array*,
not some random local variable.

---

## Arrays

### Going outside the bounds of an array

If you have an array of size 5...

        int myNumbers[5];
        
then the valid indices are 0, 1, 2, 3, and 4. **5 is not a valid index in C++ / Java**.

Your array has 5 items, so you still have 5 items between 0 and 4, and the item at index 5 would actually be the *6th* item.

In general terms, *if your array is of size n, then the valid indices for the array are [0] through [n-1].*

It is common to go outside the bounds of an array, especially when trying to iterate over everything in a for loop:

        for ( int i = 0; i <= arrSize; i++ )
        {
                // This is going to crash when i = arrSize!
                cout << arr[ i ] << endl;
        }
        
Make sure you're never accessing that *nth* element!

---

## Specifications

### Outputting when you should be returning

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

