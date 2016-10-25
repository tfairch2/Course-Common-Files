a = float( input( "Enter number 1: " ) )
b = float( input( "Enter number 2: " ) )

print( "\nWhat kind of operation?" )
print( "1. Add \t 2. Subtract \t 3. Multiply \t 4. Divide" )

choice = input( ">> " )

if ( choice == 1 ):
	result = a + b
	print( str( a ) + " + " + str( b ) + " = " + str( result ) )
	
elif ( choice == 2 ):
	result = a - b
	print( str( a ) + " - " + str( b ) + " = " + str( result ) )
	
elif ( choice == 3 ):
	result = a * b
	print( str( a ) + " * " + str( b ) + " = " + str( result ) )
	
elif ( choice == 4 ):
	result = a / b
	print( str( a ) + " / " + str( b ) + " = " + str( result ) )

else:
	print( "Invalid operation" )

