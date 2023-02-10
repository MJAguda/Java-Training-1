//Program that acts as a Timer

import java.util.*;
import javax.swing.*;

public class TimeConverter{
    public static void main(String[] args){
        
        double hrs, mins, secs; //Initialization
        String hours, minutes, seconds, outputString;
        
        hours = JOptionPane.showInputDialog("Hours : ");
        minutes = JOptionPane.showInputDialog("Minutes : ");
        seconds = JOptionPane.showInputDialog("Seconds : ");
        
        hrs = Double.parseDouble(hours);
        mins = Double.parseDouble(minutes);
        secs = Double.parseDouble(seconds);
        
        secs = secs + (mins *60) + (hrs *3600);
        
        outputString = "Seconds : " +secs;
           
           JOptionPane.showMessageDialog(null, outputString, "Timer", JOptionPane.PLAIN_MESSAGE);
           
        
        System.exit(0);
    }
}
