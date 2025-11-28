import java.util.Scanner;
public class gpa{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your GPA: ");
        float gpa=sc.nextFloat();
        if (gpa<0.0 || gpa>4.0){
            System.out.println("Error: GPA must be between 0.0 and 4.0");
            return;
        }
        
        String grade;
        if(gpa>=3.7){
            grade="A";
        }else if(gpa>=3.0){
            grade="B";
        }else if(gpa>=2.0){
            grade="C";
        }else if(gpa>=1.0){
            grade="D";
        }else{
            grade="F";
        }
        
        System.out.println("Your grade is: "+grade);
    }
}