import java.util.*;

public class LongestString{
    static Scanner inFile = new Scanner (System.in); 
    public static void main(String[] args){
        String str1, str2, str3;
        System.out.print("Enter First String : ");
        str1 = inFile.next();
        System.out.print("Enter Second String : ");
        str2 = inFile.next();
        System.out.print("Enter Third String : ");
        str3 = inFile.next();
        if(str1.length() > str3.length() && str1.length() > str3.length()){
            System.out.printf("The longest String is the First String with a length of" +str1.length()+ ".");
        }
        else if(str2.length() > str1.length() && str2.length() > str3.length()){
            System.out.printf("The longest String is the Second String with a length of" +str2.length()+ ".");
        }
        else if(str3.length() > str1.length() && str3.length() > str2.length()){
            System.out.printf("The longest String is the Third String with a length of" +str3.length()+ ".");
        }
        else {
            System.out.printf("They are all Equal with a length of " +str3.length()+ ".");
        }        
    }
}