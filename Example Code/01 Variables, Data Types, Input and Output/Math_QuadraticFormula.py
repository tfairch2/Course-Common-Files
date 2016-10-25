import math

print( "QUADRATIC FORMULA" )

print( "Format: ax^2 + bx + c" )
a = input( "Enter a: " )
b = input( "Enter b: " )
c = input( "Enter c: " )

x1 = ( -b + math.sqrt( b*b - 4*a*c ) ) / 2 * a
x2 = ( -b - math.sqrt( b*b - 4*a*c ) ) / 2 * a

# Test with a = 1, b = 2, c = -15

print( "x1 = " + str( x1 ) + ", x2 = " + str( x2 ) )
