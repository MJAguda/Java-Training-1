
/**
 * Write a description of class FarenToCelORCellToFaren here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FarenToCelORCelToFaren extends JFrame
{
   private JLabel FL, CL;
   private JTextField FTF, CTF;
   private JButton convertB1, convertB2, exitB;
   private ConvertCButtonHandler ccbHandler;
   private ConvertFButtonHandler cfbHandler;
   private ExitButtonHandler ebHandler;
   
   public FarenToCelORCelToFaren ()
   {
       FL = new JLabel ("Farentheit : ");
       CL = new JLabel ("Celsius : ");
       
       FTF = new JTextField (10);
       CTF = new JTextField (10);       
       
       convertB1 = new JButton("CONVERT to Celsius");
       ccbHandler = new ConvertCButtonHandler();
       convertB1.addActionListener(ccbHandler);
       
       convertB2 = new JButton("CONVERT to Farenthiet");
       cfbHandler = new ConvertFButtonHandler();
       convertB2.addActionListener(cfbHandler);
       
       exitB = new JButton("EXIT");
       ebHandler = new ExitButtonHandler();
       exitB.addActionListener(ebHandler);
       
       setTitle("Farentheit And Celsius Converter");
       
       Container pane = getContentPane();
       
       pane.setLayout(new GridLayout (4,2));
       
       pane.add(FL);
       pane.add(FTF);
       pane.add(CL);
       pane.add(CTF);
       pane.add(convertB1);
       pane.add(convertB2);
       pane.add(exitB);
       
       setSize(350,300);
       setVisible(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   
   private class ConvertCButtonHandler implements ActionListener
   {
       public void actionPerformed(ActionEvent e)
       {
           double F,C;
           F = Double.parseDouble(FTF.getText());           
           C = (F - 32) * (5.0/9.0);
           CTF.setText(String.format("%.2f C",C));
       }
   }
   private class ConvertFButtonHandler implements ActionListener
   {
       public void actionPerformed(ActionEvent e)
       {
           double F, C;
           C = Double.parseDouble(CTF.getText());
           F = C * (9.0/5.0) + 32;
           FTF.setText(String.format("%.2f F",F));
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
       FarenToCelORCelToFaren obj = new FarenToCelORCelToFaren();
   }
}
