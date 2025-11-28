import java.util.Scanner;
public class nested{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Divisible by both 3 and 5 or not using nested");
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        if (a%3==0){
            if(a%5==0){
                System.out.println("The number is divisible by both 3 and 5");
            }else{
                System.out.println("The number is divisible by 3 but not 5");
            }
            }else if(a%5==0){
                System.out.println("The number is divisible by 5 but not 3");
            }else{
                System.out.println("This number is neither divisible by 3 or 5");
            }
        }
    }
