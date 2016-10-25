import java.io.*;

public class SaveTextFile
{
    public static void main()
    {
        try
        {
            File file = new File( "message.txt" );
            if ( file.exists() == false ) { file.createNewFile(); }
            
            FileWriter fw = new FileWriter( file.getAbsoluteFile() );
            BufferedWriter bw = new BufferedWriter( fw );
            
            bw.write( "Hello!\n" );
            bw.write( "How are you?\t" );
            bw.write( "I am good!\n" );
            
            bw.close();
        }
        catch ( IOException e )
        {
            e.printStackTrace();
        }
    }
}
