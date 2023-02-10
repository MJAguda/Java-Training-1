import java.util.*;
import java.lang.*;

public class WordCounter{
    
    public static void main(String[] args){
        int count = 0;
        String str1;
        Scanner inFile = new Scanner (System.in);
        
        System.out.printf("Enter String : ");
        str1 = inFile.next();
        
        for(int i = 0 ; i <= str1.length()-1 ; i++){
            if(str1.charAt(i) == 'C' || str1.charAt(i) == 'c' 
            && str1.charAt(i+1) == 'P' || str1.charAt(i+1) == 'p'
            && str1.charAt(i+2) == 'E' || str1.charAt(i+2) == 'e'){
                count++;
            }
        }
        
        System.out.printf("The number of Occurent of the word CPE is %d times", count);
        
    }
}