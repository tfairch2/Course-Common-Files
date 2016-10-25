
public class Animation
{
    int frame;
    char[][] view;
    
    public Animation()
    {
        frame = 0;
        view = new char[10][5];
        main();
    }
    
    public void main()
    {
        while ( true )
        {
            draw();
            frame++;
            if ( frame == 5 ) { frame = 0; }
            
            try
            {
                Thread.sleep( 1000 );
            }
            catch (InterruptedException e) {
    			e.printStackTrace();
    		}
        }
    }
    
    public void draw()
    {
        System.out.print( "\f" );
        for ( int y = 0; y < 5; y++ )
        {
            for ( int x = 0; x < 10; x++ )
            {
                if ( x == 5 && y == frame )
                    System.out.print( "*" );
                else
                    System.out.print( "." );
            }
            System.out.print( "\n" );
        }
    }
}
