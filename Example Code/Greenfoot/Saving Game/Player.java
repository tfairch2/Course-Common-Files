import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    public void act() 
    {
        if ( Greenfoot.isKeyDown( "left" ) )
        {
            setLocation( getX() - 5, getY() );
        }
        else if ( Greenfoot.isKeyDown( "right" ) )
        {
            setLocation( getX() + 5, getY() );
        }
        else if ( Greenfoot.isKeyDown( "up" ) )
        {
            setLocation( getX(), getY() - 5 );
        }
        else if ( Greenfoot.isKeyDown( "down" ) )
        {
            setLocation( getX(), getY() + 5 );
        }
    }    
}
