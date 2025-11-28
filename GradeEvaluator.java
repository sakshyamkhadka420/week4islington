import java.util.Scanner;
/**
 * Assignment submission
 *
 * @author Sakshyam Khadka
 * @version 01
 */
public class GradeEvaluator
{
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your marks: ");
            int marks=sc.nextInt();
            
            String result = (marks>=10)? "Pass" : "Fail";
            System.out.println("Your result: " +result);
             }
}