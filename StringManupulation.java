public class StringManupulation
{
    static void main(String[] args)
    {
        String MyName = new String("Mark Jayson M. Aguda");
        String s1 = new String ("Hello.");
        String s2 = new String ("Kuninchiwa.");
        String s3 = new String ("Hola.");
        String s4 = new String ("Staefzky.");
        
        System.out.println ("Sentence : " + s1.charAt(3));
        System.out.println ("Sentence : " + MyName.indexOf('a', 5));
        System.out.println ("Sentence : " + MyName.indexOf('M', 4));        
    }
}
