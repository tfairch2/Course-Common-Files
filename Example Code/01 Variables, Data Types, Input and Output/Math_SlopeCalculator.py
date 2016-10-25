print( "SLOPE CALCULATOR" )

x1 = input( "FIRST coordinate pair, enter x: " )
y1 = input( "FIRST coordinate pair, enter y: " )

x2 = input( "SECOND coordinate pair, enter x: " )
y2 = input( "SECOND coordinate pair, enter y: " )

slopeNumerator = y2 - y1;
slopeDenominator = x2 - x1;

slope = slopeNumerator / slopeDenominator

print( "The slope is: " + str( slope ) + ", or " + str( slopeNumerator ) + "/" + str( slopeDenominator ) )
