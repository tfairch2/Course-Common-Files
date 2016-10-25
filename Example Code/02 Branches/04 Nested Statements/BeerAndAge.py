wantBeer = raw_input( "Do you want a beer? (y/n): " )

if ( wantBeer == "y" or wantBeer == "Y" ):
	
	age = raw_input( "What is your age? " )
	
	if ( age < 21 ):
		print( "You can't have a beer!" )
		
	else:
		print( "Here is a beer!" )
		
elif ( wantBeer == "n" or wantBeer == "N" ):
	print( "OK, here is a soda instead." )

else:
	print( "I don't know what '" + wantBeer + "' means!" )
