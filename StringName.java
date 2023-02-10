

public class StringName{
    public static void main(String[] args){
        String s = new String();
        s = "This is my first String";
        
        System.out.println(s);
        System.out.println(" \n ");
        System.out.println("it has "+s.length()+" characters. \n");
        System.out.println(s.trim()+" \n ");
        System.out.println(s.concat (s)+" \n ");
        System.out.println(s.substring(12)+" \n ");
        System.out.println(s.indexOf("f")+" \n ");
        System.out.println(s.charAt(5)+" \n ");
        System.out.println(s.compareTo(s)+" \n ");
        }
    }
