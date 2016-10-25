import java.awt.*;
import java.awt.event.*;

// help from http://www.tutorialspoint.com/awt/awt_event_handling.htm

public class UserInterface
{
    Frame mainFrame;
    Panel panel;
    Button button;
    Label label;
    
    public UserInterface()
    {
        mainFrame = new Frame( "Java Example" );
        mainFrame.setSize( 300, 100 );
        
        panel = new Panel();
        
        button = new Button( "Click Me" );
        button.addActionListener( new ButtonClickListener() );
        panel.add( button );
        
        label = new Label( "Unclicked" );
        panel.add( label );
        
        mainFrame.add( panel );
        
        main();
    }
    
    public void main()
    {
        mainFrame.setVisible( true );
    }
    
    private class ButtonClickListener implements ActionListener
    {
        public void actionPerformed( ActionEvent e )
        {
            String command = e.getActionCommand();
            
            if ( command.equals( "Click Me" ) )
            {
                label.setText( "CLICKED" );
            }
        }
    }
}
