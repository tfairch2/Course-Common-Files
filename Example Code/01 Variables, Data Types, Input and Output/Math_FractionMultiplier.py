print( "FRACTION MULTIPLIER" )

num1 	= input( "Enter FIRST fraction's numerator:   " )
denom1 	= input( "Enter FIRST fraction's denominator: " )

num2 	= input( "Enter SECOND fraction's numerator:   " )
denom2 	= input( "Enter SECOND fraction's denominator: " )

# Calculate product
prodNum = num1 * num2
prodDenom = denom1 * denom2

print( str( num1 ) + "/" + str( denom1 ) + " x " 
	+ str( num2 ) + "/" + str( denom2 ) + " = "
	+ str( prodNum ) + "/" + str( prodDenom ) )
