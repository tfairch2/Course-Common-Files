public class Building
{
    private Room[] rooms;
    
    public Building()
    {
        rooms = new Room[5];
        for ( int i = 0; i < rooms.length; i++ )
        {
            rooms[i] = new Room();
        }
        
        rooms[0].SetName( "Living room" );
        rooms[1].SetName( "Kitchen" );
        rooms[2].SetName( "Bedroom" );
        rooms[3].SetName( "Bathroom" );
        rooms[4].SetName( "Closet" );
        
        rooms[0].SetDimensions( 9, 16, 8 );
        rooms[1].SetDimensions( 5, 8, 8 );
        rooms[2].SetDimensions( 9, 17, 8 );
        rooms[3].SetDimensions( 5, 5, 8 );
        rooms[4].SetDimensions( 5, 6, 8 );
        
        rooms[0].SetStyle( Floor.CARPET, Color.TAN, Color.WHITE );
        rooms[1].SetStyle( Floor.TILE, Color.BLUE, Color.YELLOW );
        rooms[2].SetStyle( Floor.CARPET, Color.BROWN, Color.RED );
        rooms[3].SetStyle( Floor.TILE, Color.WHITE, Color.BLACK );
        rooms[4].SetStyle( Floor.CARPET, Color.TAN, Color.GRAY );
    }
    
    public void Display()
    {
        double totalSqft = 0;
        
        for ( int i = 0; i < rooms.length; i++ )
        {
            totalSqft += rooms[i].GetSqFt();
            rooms[i].DisplayInfo();
            System.out.println( "" );
        }
        
        System.out.println( "Total square feet: " + totalSqft );
    }
}
