import javax.swing.*;
import java.util.*;
import java.io.*;

public class WeightedAvg{
 
    public WeightedAvg(){
        
        Scanner inFile = new Scanner (System.in);
        
        String var = "C_";
        String outputString;
        String categ;
        double cat;
        
        categ = JOptionPane.showInputDialog ("Enter Number of Categories : ");
        cat = Double.parseDouble(categ);
        
        for (int i = 1 ; i <= cat ; i++){
            var = JOptionPane.showInputDialog ("Enter Number of Categories : ");
            
        }
        
        
        
    }

}

