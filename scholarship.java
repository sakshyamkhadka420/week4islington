import java.util.Scanner;
public class scholarship{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter GPA: ");
        float gpa=sc.nextFloat();
        System.out.println("Enter attendance percentage: ");
        float attendance=sc.nextFloat();
        System.out.println("Enter attitude score(1-10): ");
        int attitude=sc.nextInt();
        if(gpa>=3.2){
            if(attendance>80){
                if(attitude>5){
                    System.out.println("You are eligible for schoolarship");
                }else{
                    System.out.println("You are ineligible: Insufficient attitude scores");
                }
            }else{
                System.out.println("You are ineligible: Insufficient attendance");
            }
        }else{
            System.out.println("You are ineligible: Insufficient GPA");
        }
    }
}