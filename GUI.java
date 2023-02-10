
/**
 * Write a description of class JFram here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame //second way
{


    
    public static void main(String[] args)
    {
        JFrame window = new JFrame();
       
        window.setTitle("GUI Components"); 
        window.setSize(400, 500);
        window.setVisible(true);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);      
        window.setLayout(null);

        JButton ConvertB, ExitB;
        
        ConvertB = new JButton("Convert");        
        window.add(ConvertB);
        ConvertB.setBounds(200,400,100,40);
        
        ExitB = new JButton("Exit");        
        window.add(ExitB);
        ConvertB.setBounds(100,400,100,40);
        
    }
}
