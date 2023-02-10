import java.util.*;

public class Palindrome
{    
    public static void main(String[] args) //Program that prompts the user to enter                           //string and checks if it is a palindrome
    {
        String original , reverse = "";
        int len, x;
        
        Scanner inFile = new Scanner (System.in);
            
        do{
            System.out.print("Enter a 6-character String = ");
            original = inFile.next();
                
            len = original.length();
        }while(len+1 < 6);
        
             
        for(int i = len - 1 ; i>=0 ; i--)
        {
            reverse = reverse + original.charAt(i);
        }
        
        x = reverse.compareTo(original);
        
        if(x==0){
            System.out.printf("The given String is a Palindrome.");
        }
        else{
            System.out.printf("The given String is not a Palindrome.");
        }
        System.exit(0);
    }
}

