
/**
 * Wrie a program that prompts the user to enter the weight of a person in
 * kilogram and outputs the equivalent weight in pounds. Use Dialog Boxes
 *
 * @author (Mark Jayson Aguda)
 * @version (April, 15 2018) 
 */
import javax.swing.*;

public class KilogramToPoundUsingGUI
{
    public static void main(String[] args)
    {
        final double OneKilogram = 2.2;
        int weight_kilogram;
        double weight_pound;
        String weight_str, outputstr;
        
        weight_str = JOptionPane.showInputDialog("Enter weight in Kilogram : ");
        weight_kilogram = Integer.parseInt(weight_str);
        
        weight_pound = weight_kilogram * OneKilogram;
        
        outputstr = String.format("%.2f", weight_kilogram) + " kg. = " + String.format(".2f", weight_pound) + " lb.";
        
        JOptionPane.showMessageDialog(null,outputstr,"Kilogram to Pound Converter", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
