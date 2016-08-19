# Operators

## Arithmetic Operators

These are operators that can be used in math expressions.

<table>
    <tr>
        <th>Operator</th>
        <th>Name</th>
        <th>Information</th>
    </tr>
    <tr>
        <td>+</td>
        <td>Addition Operator</td>
        <td><pre>sum = a + b + c;</pre></td>
    </tr>
    
    <tr>
        <td>-</td>
        <td>Subtraction Operator</td>
        <td><pre>diff = a - b;</pre></td>
    </tr>
    
    <tr>
        <td>*</td>
        <td>Multiplication Operator</td>
        <td><pre>area = length * width;</pre></td>
    </tr>
    
    <tr>
        <td>/</td>
        <td>Division Operator</td>
        <td><pre>mph = miles / hour</pre></td>
    </tr>
    
    <tr>
        <td>%</td>
        <td>Modulus Operator</td>
        <td><pre>time12Hr = 14 % 12</pre></td>
    </tr>
    
    <tr>
        <td>++</td>
        <td>Increment Operator</td>
        <td>Adds 1 to a variable: <pre>
x++; 
++x;
        </pre></td>
    </tr>
    
    <tr>
        <td>--</td>
        <td>Decrement Operator</td>
        <td>Subtracts 1 from a variable: 
        <pre>
x--; 
--x;
        </pre></td>
    </tr>
</table>


## Relational Operators

Relational operators are the ways we can compare two items: two numbers, two strings, two variables, etc.

<table>
    <tr>
        <th>Operator</th>
        <th>Name</th>
        <th>Information</th>
    </tr>
    <tr>
        <td>==</td>
        <td>Equal to</td>
        <td><pre>A == B</pre></td>
    </tr>
    <tr>
        <td>!=</td>
        <td>Not equal to</td>
        <td><pre>A != B</pre></td>
    </tr>
    <tr>
        <td>></td>
        <td>Greater than</td>
        <td><pre>A > B</pre></td>
    </tr>
    <tr>
        <td>>=</td>
        <td>Greater than or equal to</td>
        <td><pre>A >= B</pre></td>
    </tr>
    <tr>
        <td><</td>
        <td>Less than</td>
        <td><pre>A < B</pre></td>
    </tr>
    <tr>
        <td><=</td>
        <td>Less than or equal to</td>
        <td><pre><=</pre></td>
    </tr>
</table>

## Logical Operators

Logical operators help us build expressions that will result in true or false. We can use these to chain together multiple expressions (is a == b and is b == c?), or to negate some logic.

<table>
    <tr>
        <th>Operator</th>
        <th>Name</th>
        <th>Information</th>
    </tr>
    <tr>
        <td>&&</td>
        <td>AND operator</td>
        <td><pre>( age >= 13 && age <= 19 )</pre></td>
    </tr>
    <tr>
        <td>||</td>
        <td>OR operator</td>
        <td><pre>(x < minimum || x > maximum)</pre></td>
    </tr>
    <tr>
        <td>!</td>
        <td>NOT operator</td>
        <td><pre>!(myAge == yourAge)</pre></td>
    </tr>
</table>

## Assignment Operators

These operators allow us to assign values to variables.

<table>
    <tr>
        <th>Operator</th>
        <th>Name</th>
        <th>Information</th>
    </tr>
    <tr>
        <td>=</td>
        <td>Assignment operator</td>
        <td><pre>state = "Kansas";</pre></td>
    </tr>
    <tr>
        <td>+=</td>
        <td>Add and assign</td>
        <td><pre>
catQuantity += 5;
// Equivalent to...
catQuantity = catQuantity + 5;
        </pre></td>
    </tr>
    <tr>
        <td>-=</td>
        <td>Subtract and assign</td>
        <td><pre>
balance -= 9.99;
balance = balance – 9.99; // (etc)
        </pre></td>
    </tr>
    <tr>
        <td>*=</td>
        <td>Multiply and assign</td>
        <td><pre>doubled *= 2;</pre></td>
    </tr>
    <tr>
        <td>/=</td>
        <td>Divide and assign</td>
        <td><pre>halved /= 2;</pre></td>
    </tr>
    <tr>
        <td>%=</td>
        <td>Modulus and assign</td>
        <td><pre>dayOfMonth %= 7;</pre></td>
    </tr>
</table>
