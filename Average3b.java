import java.util.Scanner;

public class Average3b {
    
    public static void main(String[] args) {
        
        int sum, average;
        
        Scanner keyb = new Scanner(System.in);
        
        System.out.print("What is the first value? : ");
        int value1 = keyb.nextInt();
        
        System.out.print("What is the second value? : ");
        int value2 = keyb.nextInt();
        
        System.out.print("What is the third value? : ");
        int value3 = keyb.nextInt();
        
        System.out.print("What is the fourth value? : ");
        int value4 = keyb.nextInt();
        
        sum = value1 + value2 + value3 + value4;
        average = sum / 4;
        
        System.out.println("The sum is "+ sum);
        System.out.println("The average is "+ average);
    }
}
