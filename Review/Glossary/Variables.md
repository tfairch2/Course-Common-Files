# Variables

## Data Type

A keyword that specifies what type of data will be stored in a variable, or returned from a method.

Data Types include integers, doubles, booleans, Strings, Scanner, Random, (etc.) as well as any class that is user-defined. Anything that a variable can be declared as a type of.

When the term "a variable **of type** ..." is used, "of type" refers to the data-type.

    // integer data-type when declaring this variable:
    int count = 0;
    
    // double data-type as the return-type of this method:
    double getPrice();
    
## Variables

In programming, you can created variables who have names, which can store some type of information. This information can change over the course of the program.

Declaring a variable requires you to specify its data-type and the name of the variable.

    string name; // declaring a variable of type "string", called "name".

## Types of Variables

### Local variable

A local variable is a variable declared within a code-block.

A local variable only "exists" within the code block it is declared within. 
It can be used in code-blocks **within** its code-block, but not **outside** of its code-block.

#### Example 1 (Java)

    if ( choice == 1 )
    {
        System.out.println( "Enter the first number: " );

        // Local variable to this if statement
        int num1 = input.nextInt();

        System.out.println( "Enter the second number: " );

        // Local variable to this if statement
        int num2 = input.nextInt();

        mathProblem( num1, num2 );
    } 

#### Example 2 (Java)

    while( done == false )
    {
        // Local variable to this while lo
        int choice = input.nextInt(); 

        if ( choice == 2 )
        {
            // the choice variable can be used within
            // code-blocks that are INSIDE the while block.
            System.out.println( choice );
        }
    }
    
#### Example 3 (Java)

    public static void mathProblem( int num1, int num2 ) 
    {
        // answer is a local variable for this mathProblem method.
        int answer; 
                
        System.out.println( "What is " + num1 + " plus " + num2 );

        answer = input.nextInt(); 
                
        if ( answer == num1 + num2 ) 
        {
             System.out.println( "Correct" ); 
        }
                
        else
        {
            System.out.println( "Incorrect" ); 
        }
    }

### Method Parameter

A method parameter is a variable that is defined within a method's **parameter list**. These variables can be used anywhere within the method itself, but not outside of the method.

    // Method parameters are n and d.
    public void set( int n, int d )
    {
        numerator = n;
        denominator = d;
        display();
    }
    
### Instance (aka member) variable

A variable that is declared as part of a **class** is known as an instance variable. These variables are declared within a class code-block, but outside of all method code-blocks.

When we create a variable whose data-type is the class, we create an **instance** of that class. Each instance has its own values for those instance variables.

In other words, for the Fraction class below, we can declare multiple variables of-type Fraction. For each of these Fraction instances, they each have their own numerators and denominators - these values aren't shared between all the Fractions.

    public class Fraction
    {
        private int numerator; // instance variable
        private int denominator; // instance variable

        public String getFormattedFraction()
        {
            return numerator + "/" + denominator;
        }

        // etc...
    }

### Class (aka Static) variable

A static variable is also a member variable of a class. 
However, it adds the keyword **static** to the declaration.

When a variable is declared as static, each **instance** of the class shares this same variable, rather than each instance having its own "copy" of the variable.

In the example above, each Fraction variable declared has its own numerator and denominator, independent from all other Fraction variables.

Below, we can declare multiple Student variables, and each student gets its own name. However, with the static school variable, all Students share the same variable - so if school changes for any of them, it changes for all of them.

    public class Student
    {
        String name; // Instance variable
        static String school; // Class variable
    }

## Scope

Scope refers to the availability of a variable. Depending on the kind of variable and location of the variable, it is only accessible in certain portions of the code. Generally you can tell what the scope of a variable is by what code-block it is declared within.

* A class (static) variable and an instance (member) variable are accessible from anywhere within the class it is declared.
* A method parameter is only available within the method it belongs to.
* A local variable is only available within the code-block it was declared within. This could be a method, if statement, loop, etc.

## Local Scope, "Local To..."

When a variable is "Local To" some scope, it means that it can only be used within the code-block defined.

Below, the choice variable is local only to the while loop it is declared within. It can be used with the internal if statement, but nothing outside of the while loop.

The message variable is local only to the if statement it is declared within, and cannot be used outside of that if statement - it does not exist within the larger while loop.

    while ( done == false )
    {
        int choice = input.nextInt(); // Local to this while loop
        
        if ( choice == 2 )
        {
            // Local to this if statement
            String message = "Your choice: "; 
            System.out.println( message + choice );
        }
    }
