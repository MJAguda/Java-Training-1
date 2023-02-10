import javax.swing.*;

public class MessageType{
    
    public static void main(String[] args){
    
        JOptionPane.showMessageDialog (null, "Hello World!!!","Greetings", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog (null, "Hello World!!!","Greetings", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog (null, "Hello World!!!","Greetings", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog (null, "Hello World!!!","Greetings", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog (null, "Hello World!!!","Greetings", JOptionPane.WARNING_MESSAGE);
    }
    
}
