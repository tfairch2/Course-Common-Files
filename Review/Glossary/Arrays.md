# Arrays

## Array

An Array is essentially a list of variables, but stored under one name. Using the subscript operator [ ], you can access different elements of the array with a numeric index.

An array can only be of one data-type, meaning each of its elements must be the same data-type.

---

### Java Specific!

An array will be initialized with the new keyword, but each element of the array is also its own variable. Each of these elements must also be initialized separately with the new keyword.

**Declaring an array:**

    Student[] students;
    
** Initializing the array:**
    
    students = new Student[30];

** Initializing the elements: **

    for ( int i = 0; i < students.length; i++ )
    {
        students[i] = new Student();
    }

---

## Index

An index is a number that represents one of the variable-elements of an array. If an array is of size n, then the indices of the array go from 0, 1, 2, …, n-1, and never up to n.

An element of the **students** array at **index** 3:

    students[3]

An index is a number that represents one of the variable-elements of an array. If an array is of size n, then the indices of the array go from 0, 1, 2, …, n-1, and never up to n.

    students[x]
    
Due to this, you can use a for loop to easily iterate through each element of an array to make changes:

**Java code:**

    for ( int i = 0; i < students.length; i++ )
    {
        System.out.println( students[i] );
    }

## Element

An **element** refers to one specific variable in an array, 
accessed at one specific index. An element is one variable, 
and is treated largely like any other variable, 
except you must access that element through an **array**, 
using the **subscript operator [ ]**.
