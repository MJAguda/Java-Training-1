
/**
 * Write a program that prompts the user to enter complete name of the User
 * And display the total numbers of vowel in messageDialog
 *
 * @author (Mark Jayson Aguda)
 * @version (April 16, 2018)
 */

import javax.swing.*;
import java.lang.*;

public class VowelCounter
{
    
    public static void main(String[] args)
    {
        
        String CompName, outString;
        int StringLength, count=0;
        char lett;
        
        CompName = JOptionPane.showInputDialog("Enter your Complete Name : ");
        StringLength = CompName.length();
        
        for(int i = 0; i < StringLength;i++)
        {
            lett = CompName.charAt(i);
            if(lett == 'a' || lett == 'A' ||
                lett == 'e' || lett == 'E'||
                lett == 'i' || lett == 'I'||
                lett == 'o' || lett == 'O'||
                lett == 'u' || lett == 'U')
            {
                count++;
            }    
                
        }
        
        outString = String.format("Length of String : %d%n", StringLength);
        outString = outString + String.format("Number of Vowels : %d", count);

        JOptionPane.showMessageDialog(null ,outString,"Vowel Counter",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
   
}
