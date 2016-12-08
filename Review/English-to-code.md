# English to code

It is important to understand programming terminology so that you can effectively translate documented requirements to an actual implementation.

This guide is a glossary of common things I will write as requirements,
and the kind of code that I'm expecting.

---

## Example: Function specification

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

