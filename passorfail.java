import java.util.Scanner;
public class passorfail{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks: ");
        double a=sc.nextDouble();
        if(a>=40){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}