/**
 * Assignment submission
 *
 * @author Sakshyam Khadka
 * @version 01
 */
public class MathOperations
{
        public static void main(String[]args){
        int a=10, b=5;
            //The arithmetic operators
            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
            System.out.println(a % b);
            
            //the unary operators
            int x=10;
            System.out.println(++x);
            System.out.println(x++);
            
            //the assignment operators
            int z=20;
            z +=5;
            z *=2;
            System.out.println(z);
            
            //the relational operators
            System.out.println(a > b);
            System.out.println(a == b);
            
            //the logical operators
            boolean p = true, q = false;
            System.out.println(p && q);
            System.out.println(p || q);


           //the ternary operators
           System.out.println(a > b ? a : b);
             }
}