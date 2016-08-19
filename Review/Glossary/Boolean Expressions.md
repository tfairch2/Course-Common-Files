# Boolean Expressions

A boolean expression is an expression that evaluates to **true** or **false**. 
Boolean expressions are commonly used within if statements and while loops.

A statement such as “x > y” is a boolean expression.

Boolean expressions can be built from smaller boolean expressions, 
using && (and) and || (or).

With the **AND operator, all sub-expressions must be true.** 
If even one of them are false, the entire expression is false.

With the **OR operator, at least one sub-expression must be true.** 
The rest can be false, or the rest can also be true – doesn't matter. 
At least one sub-expression must be true, 
and the entire expression is true. 
**The entire expression is only false if every sub-expression is false.**

<table>
<tr>
    <td style="width:50%;">
<img src="https://github.com/Rachels-Courses/Course-Common-Files/blob/master/Review/Glossary/images/venn-and.png?raw=true" title="A&&B&&C">
    </td>
</tr><tr>
    <td style="width:50%;">
<img src="https://github.com/Rachels-Courses/Course-Common-Files/blob/master/Review/Glossary/images/venn-or.png?raw=true" title="A||B||C">
    </td>
</tr>
</table>

The not operator ! will inverse an expression's logic. If something returns false, then !(something) will return true, and vice versa.

## Truth Tables

We can explore these relationships in-depth with something called Truth Tables. We use these tables to diagram the outcome of an expression based on the sub-expressions.


If we start with just one expression, “a”, it can either be True or False. Without any && or ||, the result is clear:

<table>
    <tr>
        <th>Sub-expression</th><th>Total Expression</th>
    </tr>
    
    <tr>
        <td><h4>A</h4></td>
        <td><h3>A</h3></td>
    </tr>
    
    <tr>
        <td>True</td>
        <td>True</td>
    </tr>
    
    <tr>
        <td>False</td>
        <td>False</td>
    </tr>
</table>

We can add another value and compare A and B. 
The left side of the truth table will be different states that A and B 
can be in – Both true, both false, or one true and one false. 
Then we can check the result of A && B, or A || B.

### A && B

<table>
    <tr>
        <th>Sub-expression</th><th></th><th>Total Expression</th>
    </tr>
    
    <tr>
        <td><h4>A</h4></td>
        <td><h4>B</h4></td>
        <td><h3>A && B</h3></td>
    </tr>
    
    <tr>
        <td><h4>True</h4></td>
        <td><h4>True</h4></td>
        <td><h3>True</h3></td>
    </tr>
    
    <tr>
        <td><h4>True</h4></td>
        <td><h4>False</h4></td>
        <td><h3>False</h3></td>
    </tr>
    
    <tr>
        <td><h4>False</h4></td>
        <td><h4>True</h4></td>
        <td><h3>False</h3></td>
    </tr>
    
    <tr>
        <td><h4>False</h4></td>
        <td><h4>False</h4></td>
        <td><h3>False</h3></td>
    </tr>
</table>

### A || B

<table>
    <tr>
        <th>Sub-expression</th><th></th><th>Total Expression</th>
    </tr>
    
    <tr>
        <td><h4>A</h4></td>
        <td><h4>B</h4></td>
        <td><h3>A || B</h3></td>
    </tr>
    
    <tr>
        <td><h4>True</h4></td>
        <td><h4>True</h4></td>
        <td><h3>True</h3></td>
    </tr>
    
    <tr>
        <td><h4>True</h4></td>
        <td><h4>False</h4></td>
        <td><h3>True</h3></td>
    </tr>
    
    <tr>
        <td><h4>False</h4></td>
        <td><h4>True</h4></td>
        <td><h3>True</h3></td>
    </tr>
    
    <tr>
        <td><h4>False</h4></td>
        <td><h4>False</h4></td>
        <td><h3>False</h3></td>
    </tr>
</table>
