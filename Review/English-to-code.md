# English to code

It is important to understand programming terminology so that you can effectively translate documented requirements to an actual implementation.

This guide is a glossary of common things I will write as requirements,
and the kind of code that I'm expecting.

---

## Function specification

**Example:**

Write a function named GetPerimeter. Its input is the width and length of a rectangle, stored as doubles.
It returns the length of the perimeter, which is also a double.

Within the function, calculate the perimeter (2 x width + 2 x length) and return the result.

**Translation:**

* Function name: GetPerimeter
* Parameters: double width, double length
* Return type: double

double GetPerimeter( double width, double length )
{
  return 2 * width + 2 * length;
}

---

## Class with private members and getters and setters

A **Getter** (or accessor) method is a function that corresponds to one private member variable of the class.
Its job is to *return the value* of that private member, acting as an interface between the class and the outside world.

Likewise, a **Setter** (or mutator) method is a function that takes in some input and assigns it to its corresponding
private member variable. Its job is to sometimes do error checking on that data before assigning it to the private member,
but in general it is also another interface function between the class and the outside world.

**Example:**

Write a class called Button.

It has the following private member variables:

* width and height, both integers
* text, a string

It should have getter and setter functions for each of these variables.

**Translation:**

    class Button
    {
      public:
        // Getters
        int GetWidth() { return width; }
        int GetHeight() { return height; }
        string GetText() { return text; }

        // Setters
        void SetWidth( int newWidth ) { width = newWidth; }
        void SetHeight( int newHeight ) { height = newHeight; }
        void SetText( string newText ) { text = newText; }

      private:
        int width;
        int height;
        string text;
    };

Each private member variable has a corresponding **Getter** and **Setter** method. 
Getters and Setters almost always follow the same pattern:

* Getters
  * Return type: Matches the private member variable
  * Input (Parameters): NONE
  * Functionality: Returns the private member variable
* Setters
  * Return type: Void
  * Input (Parameters): The new value for the private member variable; therefore, must be the same data-type.
  * Functionality: Assign the corresponding private member variable equal to the value that was passed in.

