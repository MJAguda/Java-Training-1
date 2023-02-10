import java.lang.*;

public class Discriminant
{
    static void main(String[] args)
    {          
        
     int a=1,c=1,b=4;
     
     double discri,roots;
     
     roots = Math.pow(b, 2);
     discri = roots - 4*a*c;
     
     System.out.printf("b^2 - 4ac : ", discri);
     
    }
}