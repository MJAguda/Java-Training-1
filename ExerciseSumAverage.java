import java.util.*;

public class ExerciseSumAverage{
        static Scanner inFile = new Scanner(System.in);

       public static void main(String[] args){
       float num, sum = 0, avg;
       
       
       for(int count = 1; count<=5 ; count++ ){
       System.out.print("Number = ");
       num = inFile.nextFloat();
       
       sum+=num;

       
       System.out.println();
       }
       
       avg = sum/5;
       
       System.out.printf("Sum = %0.2f", sum);
       System.out.printf("Average = %0.2f", avg);
    
    }
}
