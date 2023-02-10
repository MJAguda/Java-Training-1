
/**
 * Develop a program that will prompt the user to 
 * enter a string to be encrypted to a 5x5 military tap code. 
 *
 * @author (Mark Jayson M. Aguda)
 * @version (April 20, 2018)
 */

import java.io.*;
import javax.swing.*;

public class EncryptToTapCode
{
    public static void main(String[] args)
    {
        String str = JOptionPane.showInputDialog("Enter String to be encrypted : ");
        
        int strlength = str.length();
        String Tap = "";
        
        
        for(int i = 0 ; i<strlength ; i++)
        {
            if(str.charAt(i) == 'A' || str.charAt(i) == 'a')
            {
                Tap += "11,";
            }
            else if(str.charAt(i) == 'B' || str.charAt(i) == 'b')
            {
                Tap += "12,";
            }
            else if(str.charAt(i) == 'C' || str.charAt(i) == 'c' || str.charAt(i) == 'K' || str.charAt(i) == 'k')
            {
                Tap += "13,";
            }
            else if(str.charAt(i) == 'D' || str.charAt(i) == 'd')
            {
                Tap += "14,";
            }
            else if(str.charAt(i) == 'E' || str.charAt(i) == 'e')
            {
                Tap += "15,";
            }
            else if(str.charAt(i) == 'F' || str.charAt(i) == 'f')
            {
                Tap += "21,";
            }
            else if(str.charAt(i) == 'G' || str.charAt(i) == 'g')
            {
                Tap += "22,";
            }
            else if(str.charAt(i) == 'H' || str.charAt(i) == 'h')
            {
                Tap += "23,";
            }
            else if(str.charAt(i) == 'I' || str.charAt(i) == 'i')
            {
                Tap += "24,";
            }
            else if(str.charAt(i) == 'J' || str.charAt(i) == 'j')
            {
                Tap += "25,";
            }
            else if(str.charAt(i) == 'L' || str.charAt(i) == 'l')
            {
                Tap += "31,";
            }
            else if(str.charAt(i) == 'M' || str.charAt(i) == 'm')
            {
                Tap += "32,";
            }
            else if(str.charAt(i) == 'N' || str.charAt(i) == 'n')
            {
                Tap += "33,";
            }
            else if(str.charAt(i) == 'O' || str.charAt(i) == 'o')
            {
                Tap += "34,";
            }
            else if(str.charAt(i) == 'P' || str.charAt(i) == 'p')
            {
                Tap += "35,";
            }
            else if(str.charAt(i) == 'Q' || str.charAt(i) == 'q')
            {
                Tap += "41,";
            }
            else if(str.charAt(i) == 'R' || str.charAt(i) == 'r')
            {
                Tap += "42,";
            }
            else if(str.charAt(i) == 'S' || str.charAt(i) == 's')
            {
                Tap += "43,";
            }
            else if(str.charAt(i) == 'T' || str.charAt(i) == 't')
            {
                Tap += "44,";
            }
            else if(str.charAt(i) == 'U' || str.charAt(i) == 'u')
            {
                Tap += "45,";
            }
            else if(str.charAt(i) == 'V' || str.charAt(i) == 'v')
            {
                Tap += "51,";
            }
            else if(str.charAt(i) == 'W' || str.charAt(i) == 'w')
            {
                Tap += "52,";
            }
            else if(str.charAt(i) == 'X' || str.charAt(i) == 'x')
            {
                Tap += "53,";
            }
            else if(str.charAt(i) == 'Y' || str.charAt(i) == 'y')
            {
                Tap += "54,";
            }
            else if(str.charAt(i) == 'Z' || str.charAt(i) == 'z')
            {
                Tap += "55,";
            }
        }
        
        JOptionPane.showMessageDialog(null, Tap, "Encrypted", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
