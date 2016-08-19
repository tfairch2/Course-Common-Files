# Classes and Objects

## Class

A class is a declaration of a new data-type. 
A class can contain its own **member variables** and **member methods**, 
which give it properties and functionality.

Once you've declared a class, 
a variable can be declared of that class type, 
to utilize the functionality defined within the class definition.

## Object

An object is a variable who is an instantiation of a class.

## Instance / Instantiation

An instantiation is when you declare a variable, 
and the variable's data-type is some class that has been defined. 
Once this occurs, that variable is an instance of that class.

**Class declaration**

    class Coordinates
    {
        public int x;
        public int y;
    }

**Declaring an object**

    Coordinates origin;
    
**Creating an instance**
    
    // This is needed in Java / C#
    // but in C++, declaring the object
    // will automatically instantiate it.
    origin = new Coordinates();
    
**Assigning values to member variables**

    origin.x = 0;
    origin.y = 0;

## Members

A member of a class is any **variable** or **method** declared within the class definition.

Every member variable and member method is accessible from all other member methods in the class.

## Accessibility

Member methods and variables can be qualified with an accessibility level: public, protected, or private.

* A **public** member is available to any other classes anywhere outside of the class it belongs to.
* A **protected** member is only available to the class it belongs to, and any children classes (subclasses).
* A **private** member is only available to the class it belongs to – no child classes.

If no accessibility level is specified, methods and variables are private by default.

## Child class (aka "subclass")

You can have one class inherit traits (variables and methods) from another class by having it inherit from another class. All public and protected members of the parent class are inherited by the child class for use.

## Parent class (aka "superclass")

The superclass refers to the parent class of a child class. The parent class can define variables and methods within its definition, for use within any of the child classes.

## Inherits (aka "extends" )

A child class inherits from (extends) the parent class. The child class will gain any public and protected members of the parent.

