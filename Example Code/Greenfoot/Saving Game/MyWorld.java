import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;

public class MyWorld extends World
{
    Player player;
    Button btnSave;
    Button btnLoad;
    
    public MyWorld()
    {    
        super(600, 400, 1); 
        
        player = new Player();
        addObject( player, getWidth()/2, getHeight()/2 );
        
        btnSave = new Button();
        addObject( btnSave, getWidth() * 1/4, 300 );
        showText( "Save", getWidth() * 1/4, 300 );
        
        btnLoad = new Button();
        addObject( btnLoad, getWidth() * 3/4, 300 );
        showText( "Load", getWidth() * 3/4, 300 );
    }
    
    public void act()
    {
        if ( Greenfoot.mouseClicked( btnSave ) )
        {
            save();
        }
        
        if ( Greenfoot.mouseClicked( btnLoad ) )
        {
            load();
        }
        
        showText( "(" + player.getX() + ", " + player.getY() + ")", 100, 20 );
    }
    
    public void save()
    {
        try
        {
            File file = new File( "savegame.txt" );
            if ( file.exists() == false ) { file.createNewFile(); }
            
            FileWriter fw = new FileWriter( file.getAbsoluteFile() );
            BufferedWriter bw = new BufferedWriter( fw );
            
            bw.write( "PlayerX\n" );
            bw.write( player.getX() + "\n" );
            bw.write( "PlayerY\n" );
            bw.write( player.getY() + "\n" );
            
            bw.close();
        }
        catch( IOException e )
        {
            showText( "Error writing file.", 100, 100 );
        }
    }
    
    public void load()
    {
        String filename = "savegame.txt";
        int x = player.getX(), y = player.getY();
        
        try
        {
            FileReader fr = new FileReader( filename );
            BufferedReader br = new BufferedReader( fr );
            
            String line = null;
            while ( true )
            {
                line = br.readLine();
                if ( line == null ) { break; }
                
                if ( line.equals( "PlayerX" ) )
                {
                    line = br.readLine();
                    x = Integer.parseInt( line );
                }
                else if ( line.equals( "PlayerY" ) )
                {
                    line = br.readLine();
                    y = Integer.parseInt( line );
                }
            }
            
            br.close();
        }
        catch ( FileNotFoundException e )
        {
            showText( "Error could not find file.", 100, 100 );
        }
        catch ( IOException e )
        {
            showText( "Error reading file.", 100, 100 );
        }
        
        player.setLocation( x, y );
    }
}





