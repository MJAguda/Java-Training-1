import java.util.*;

public class ClassScanner{
    static Scanner keyb = new Scanner (System.in);
    
    public static void main(String[] args){
        int temp;
        String first,last;
        
        System.out.print("Enter first name: ");
        first = keyb.next();
        System.out.println();
        
        System.out.print("Enter the last name : ");
        last = keyb.next();
        System.out.println();
        
        System.out.print("Enter today's Temperature : ");
        temp = keyb.nextInt();
        System.out.println();
        
        System.out.println(first+ " " +last+ " today's temperature is : "+temp);
    }
}