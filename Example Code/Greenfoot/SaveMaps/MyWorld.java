import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;

public class MyWorld extends World
{
    Tile[][] tiles;
    
    public MyWorld()
    {    
        super(600, 600, 1); 
        tiles = new Tile[10][10];
        
        for ( int y = 0; y < 10; y++ )
        {
            for ( int x = 0; x < 10; x++ )
            {
                tiles[x][y] = new Tile();
                addObject( tiles[x][y], x*100, y*100 );
            }
        }
    }
    
    public void act()
    {
        if ( Greenfoot.isKeyDown( "s" ) )
        {
            save();
        }
        if ( Greenfoot.isKeyDown( "l" ) )
        {
            load();
        }
    }
    public void save()
    {
        try
        {
            File file = new File( "map.txt" );
            if ( file.exists() == false ) { file.createNewFile(); }
            
            FileWriter fw = new FileWriter( file.getAbsoluteFile() );
            BufferedWriter bw = new BufferedWriter( fw );
            
            for ( int y = 0; y < 10; y++ )
            {
                for ( int x = 0; x < 10; x++ )
                {
                    bw.write( tiles[x][y].GetType() + "\n" );
                }
            }
            
            bw.close();
        }
        catch( IOException e )
        {
            showText( "Error writing file.", 100, 100 );
        }
        
        showText( "Saved", 100, 100 );
    }
    
    public void load()
    {
        String filename = "map.txt";
        
        int x = 0, y = 0;
        
        try
        {
            FileReader fr = new FileReader( filename );
            BufferedReader br = new BufferedReader( fr );
            
            String line = null;
            while ( true )
            {
                line = br.readLine();
                if ( line == null ) { break; }
                
                int tileType = Integer.parseInt( line );
                tiles[x][y].SetType( tileType );
                
                x++;
                if ( x == 10 )
                {
                    x = 0;
                    y++;
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
        
        showText( "Loaded", 100, 100 );
    }
}
