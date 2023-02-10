import java.util.*;

public class WordReverser
{    
    public static void main(String[] args) //Program that prompts the user to enter a 
                                            //string and checks if it is a palindrome
    {
        String original, reverse = "";
        Scanner inFile = new Scanner (System.in);
        
        System.out.println("Enter a string = ");
        original = inFile.nextLine();
            
        int len = original.length();
        
        for(int i = len - 1 ; i>=0 ; i--)
        {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("Original String = "+original);
        System.out.println("Reverse string = " +reverse);
    }
}

