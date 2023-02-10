import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FeetToInchGUI extends JFrame
{

    private JLabel feetL, inchL;
    private JTextField feetTF, inchTF;
    private JButton convertB, exitB;
    private ConvertButtonHandler cbHandler;
    private ExitButtonHandler ebHandler;
    public FeetToInchGUI()  
    {
               
        //labels for feet and inches
        feetL = new JLabel ("Enter length in FEET : ", SwingConstants.RIGHT);
        inchL = new JLabel ("Length in INCHES : ", SwingConstants.RIGHT);
        
        //two textfield
        feetTF = new JTextField (10);
        inchTF = new JTextField (10);
        
        //create convert button
        convertB = new JButton("CONVERT");
        cbHandler = new ConvertButtonHandler();
        convertB.addActionListener(cbHandler);
        
        //create exit button
        exitB = new JButton("EXIT");
        ebHandler = new ExitButtonHandler();
        exitB.addActionListener(ebHandler);        
        
        setTitle("Conversion of Feet to Inches");
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(3,2));
        
        pane.add(feetL);
        pane.add(feetTF);
        pane.add(inchL);
        pane.add(inchTF);
        pane.add(convertB);
        pane.add(exitB);
        
        setSize(280,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private class ConvertButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double feet, inch;
            feet = Double.parseDouble(feetTF.getText());
            inch = feet * 12;
            
            inchTF.setText("" +inch);
        }
    }
    
    private class ExitButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
          
    public static void main(String[] args)
    {
        FeetToInchGUI obj = new FeetToInchGUI();
    }
}
