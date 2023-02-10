import java.util.Scanner;
public class temperature{
        public static void main(String[] args){
        
            Scanner aw=new Scanner(System.in);
            
            System.out.println("Temperature in:\n");
            
            System.out.println("a.Celcius\nb.Farenheit\nc.Kelvin");
            System.out.print("Enter choice : ");
            
            char choice=aw.nextLine().charAt(0);
            
            System.out.print("Enter value : ");
            float value=aw.nextFloat();
            
            if (choice=='a'||choice=='A'){
                System.out.println("\nVALUES");
                System.out.println("\n"+value+"FARENHEIT\tKELVIN");
            }
            else if (choice=='b'||choice=='B'){
                System.out.println("\nVALUES");
                System.out.println("\nCELCIUS\tKELVIN");
            }
            else if (choice=='c'||choice=='C'){
                System.out.println("\nVALUES");
                System.out.println("\nFARENHEIT\tCELCIUS");
            }
            else{
                System.out.println("INVALID INPUT!");
                }   
            }
        }
