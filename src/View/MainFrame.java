package View;

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame
{

    public MainFrame()
    {
        super("A05 - Football Players Table");
        setupLayoutForMacs();
        
        //------------------------------------------------------
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Using the borderlayout to organize the content of the MainFrame
        setLayout(new BorderLayout());
        // Set the size for the application
        setSize(1080, 720);
        setVisible(true);
    }

    private void setupLayoutForMacs()
    {
        // On some MACs it might be necessary to have the statement below 
        //for the background color of the button to appear    
        try
        {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        //------------------------------------------------------
    }
}
