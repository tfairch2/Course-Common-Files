import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Tile extends Actor
{
    int type;
    
    public Tile()
    {
        type = 0; // grass, 1 = wood, 2 = stones, 3 = water
        updateImage();
    }
    
    public int GetType()
    {
        return type;
    }
    
    public void SetType( int t )
    {
        type = t;
//        getWorld().showText( "Type " + t, getX(), getY() );
        updateImage();
    }
    
    public void act() 
    {
        if ( Greenfoot.mouseClicked( this ) )
        {
            type++;
            if ( type == 4 ) { type = 0; }
            updateImage();
        }
    } 
    
    public void updateImage()
    {
        if ( type == 0 ) { setImage( "grass.png" ); }
        else if ( type == 1 ) { setImage( "wood.png" ); }
        else if ( type == 2 ) { setImage( "stones.png" ); }
        else if ( type == 3 ) { setImage( "water.png" ); }
    }
}
