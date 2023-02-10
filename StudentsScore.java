
/**
 * Develop a simple GUI program that will read ten files 
 * containing the answers of ten students enrolled in java.
 * The scores of each student will stored in a file called 
 * java.dat and refer to the answer key written in the board.
 *
 * @author (Mark Jayson Aguda)
 * @version (Quiz #2 April 18, 2018)
 */

import javax.swing.*;
import java.util.*;
import java.io.*;

public class StudentsScore
{
    public static void main(String[] args) throws FileNotFoundException
    {
        PrintWriter outFile = new PrintWriter("java.dat");
        String outputStr;
            int score1 = 0, score2 = 0, score3 = 0, score4 = 0, score5 = 0;
            int score6 = 0, score7 = 0, score8 = 0, score9 = 0, score10 = 0;
            
            Scanner ans1 = new Scanner(new FileReader("C:\\Users\\User\\Documents\\Requirements\\3rd Year\\Second Sem\\Object Oriented Programming\\Programs\\TxtFiles\\ans1.txt"));
            Scanner ans2 = new Scanner(new FileReader("C:\\Users\\User\\Documents\\Requirements\\3rd Year\\Second Sem\\Object Oriented Programming\\Programs\\TxtFiles\\ans2.txt"));
            Scanner ans3 = new Scanner(new FileReader("C:\\Users\\User\\Documents\\Requirements\\3rd Year\\Second Sem\\Object Oriented Programming\\Programs\\TxtFiles\\ans3.txt"));
            Scanner ans4 = new Scanner(new FileReader("C:\\Users\\User\\Documents\\Requirements\\3rd Year\\Second Sem\\Object Oriented Programming\\Programs\\TxtFiles\\ans4.txt"));
            Scanner ans5 = new Scanner(new FileReader("C:\\Users\\User\\Documents\\Requirements\\3rd Year\\Second Sem\\Object Oriented Programming\\Programs\\TxtFiles\\ans5.txt"));
            Scanner ans6 = new Scanner(new FileReader("C:\\Users\\User\\Documents\\Requirements\\3rd Year\\Second Sem\\Object Oriented Programming\\Programs\\TxtFiles\\ans6.txt"));
            Scanner ans7 = new Scanner(new FileReader("C:\\Users\\User\\Documents\\Requirements\\3rd Year\\Second Sem\\Object Oriented Programming\\Programs\\TxtFiles\\ans7.txt"));
            Scanner ans8 = new Scanner(new FileReader("C:\\Users\\User\\Documents\\Requirements\\3rd Year\\Second Sem\\Object Oriented Programming\\Programs\\TxtFiles\\ans8.txt"));
            Scanner ans9 = new Scanner(new FileReader("C:\\Users\\User\\Documents\\Requirements\\3rd Year\\Second Sem\\Object Oriented Programming\\Programs\\TxtFiles\\ans9.txt"));
            Scanner ans10 = new Scanner(new FileReader("C:\\Users\\User\\Documents\\Requirements\\3rd Year\\Second Sem\\Object Oriented Programming\\Programs\\TxtFiles\\ans10.txt"));
            Scanner inFile1 = new Scanner(new FileReader("C:\\Users\\User\\Documents\\Requirements\\3rd Year\\Second Sem\\Object Oriented Programming\\Programs\\TxtFiles\\1.txt"));
            Scanner inFile2 = new Scanner(new FileReader("C:\\Users\\User\\Documents\\Requirements\\3rd Year\\Second Sem\\Object Oriented Programming\\Programs\\TxtFiles\\2.txt"));
            Scanner inFile3 = new Scanner(new FileReader("C:\\Users\\User\\Documents\\Requirements\\3rd Year\\Second Sem\\Object Oriented Programming\\Programs\\TxtFiles\\3.txt"));
            Scanner inFile4 = new Scanner(new FileReader("C:\\Users\\User\\Documents\\Requirements\\3rd Year\\Second Sem\\Object Oriented Programming\\Programs\\TxtFiles\\4.txt"));
            Scanner inFile5 = new Scanner(new FileReader("C:\\Users\\User\\Documents\\Requirements\\3rd Year\\Second Sem\\Object Oriented Programming\\Programs\\TxtFiles\\5.txt"));
            Scanner inFile6 = new Scanner(new FileReader("C:\\Users\\User\\Documents\\Requirements\\3rd Year\\Second Sem\\Object Oriented Programming\\Programs\\TxtFiles\\6.txt"));
            Scanner inFile7 = new Scanner(new FileReader("C:\\Users\\User\\Documents\\Requirements\\3rd Year\\Second Sem\\Object Oriented Programming\\Programs\\TxtFiles\\7.txt"));
            Scanner inFile8 = new Scanner(new FileReader("C:\\Users\\User\\Documents\\Requirements\\3rd Year\\Second Sem\\Object Oriented Programming\\Programs\\TxtFiles\\8.txt"));
            Scanner inFile9 = new Scanner(new FileReader("C:\\Users\\User\\Documents\\Requirements\\3rd Year\\Second Sem\\Object Oriented Programming\\Programs\\TxtFiles\\9.txt"));
            Scanner inFile10 = new Scanner(new FileReader("C:\\Users\\User\\Documents\\Requirements\\3rd Year\\Second Sem\\Object Oriented Programming\\Programs\\TxtFiles\\10.txt"));
            
            String outputStr1 = "Greetings Programmer. This Program will Check your test papers... Automatically That is!";
            
            JOptionPane.showMessageDialog(null, outputStr1, "Student's Score",JOptionPane.INFORMATION_MESSAGE);
            
                while(inFile1.hasNext())
                {
                    if(inFile1.next().charAt(0) == ans1.next().charAt(0))
                    score1++;
                }
                while(inFile2.hasNext())
                {
                    if(inFile2.next().charAt(0) == ans2.next().charAt(0))
                    score2++;
                }
                while(inFile3.hasNext())
                {
                    if(inFile3.next().charAt(0) == ans3.next().charAt(0))
                    score3++;
                }
                while(inFile4.hasNext())
                {
                    if(inFile4.next().charAt(0) == ans4.next().charAt(0))
                    score4++;
                }
                while(inFile5.hasNext())
                {
                    if(inFile5.next().charAt(0) == ans5.next().charAt(0))
                    score5++;
                }
                while(inFile6.hasNext())
                {
                    if(inFile6.next().charAt(0) == ans6.next().charAt(0))
                    score6++;
                }
                while(inFile7.hasNext())
                {
                    if(inFile7.next().charAt(0) == ans7.next().charAt(0))
                    score7++;
                }
                while(inFile8.hasNext())
                {
                    if(inFile8.next().charAt(0) == ans8.next().charAt(0))
                    score8++;
                }
                while(inFile9.hasNext())
                {
                    if(inFile9.next().charAt(0) == ans9.next().charAt(0))
                    score9++;
                }
                while(inFile10.hasNext())
                {
                    if(inFile10.next().charAt(0) == ans10.next().charAt(0))
                    score10++;
                }
                
                outputStr = "Student1's Score = "+score1+"\n"+
                            "Student2's Score = "+score2+"\n"+
                            "Student3's Score = "+score3+"\n"+
                            "Student4's Score = "+score4+"\n"+
                            "Student5's Score = "+score5+"\n"+
                            "Student6's Score = "+score6+"\n"+
                            "Student7's Score = "+score7+"\n"+
                            "Student8's Score = "+score8+"\n"+
                            "Student9's Score = "+score9+"\n"+
                            "Student10's Score = "+score10;
                                       
                outFile.print(outputStr);          
                          
                inFile1.close();
                inFile2.close();
                inFile3.close();
                inFile4.close();
                inFile5.close();
                inFile6.close();
                inFile7.close();
                inFile8.close();
                inFile9.close();
                inFile10.close();
                ans1.close();
                ans2.close();
                ans3.close();
                ans4.close();
                ans5.close();
                ans6.close();
                ans7.close();
                ans8.close();
                ans9.close();
                ans10.close();
                outFile.close();
                
        JOptionPane.showMessageDialog(null, outputStr, "Student's Score",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
