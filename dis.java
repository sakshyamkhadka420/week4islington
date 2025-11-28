import java.util.Scanner;
public class dis{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Divisible by both 3 and 5 or not");
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        if (a%3==0 && a%5==0){
            System.out.println("Divisble by both 3 and 5");
        }else{
            System.out.println("The number is not divisible by both 3 and 5");
        }
    }
}