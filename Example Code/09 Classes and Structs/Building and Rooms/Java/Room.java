public class Room
{
    private String name;
    private double width, length, height;
    Floor floorType;
    Color floorColor;
    Color wallColor;
    
    public void SetDimensions( double newWidth, double newLength, double newHeight )
    {
        width = newWidth;
        length = newLength;
        height = newHeight;
    }
    
    public void SetStyle( Floor ft, Color fc, Color wc )
    {
        floorType = ft;
        floorColor = fc;
        wallColor = wc;
    }
    
    public void DisplayInfo()
    {
        System.out.println( "Room name:     " + name );
        System.out.println( "Dimensions:    " + width + " x " + length + " x " + height );
        System.out.println( "SQFT:          " + GetSqFt() );
        System.out.println( "Floor type:    " + floorType );
        System.out.println( "Floor color:   " + floorColor );
        System.out.println( "Wall type:     " + wallColor );
    }
    
    public void SetName( String newName )
    {
        name = newName;
    }
    
    public String GetName()
    {
        return name;
    }
    
    public double GetSqFt()
    {
        return ( width * length );
    }
    
    public double GetVolume()
    {
        return ( width * length * height );
    }
}