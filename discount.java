import java.util.Scanner;
public class discount{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the product price: ");
        float mp=sc.nextFloat();
        System.out.println("Enter the product category(A/B/C/D): ");
        char category=sc.next().toUpperCase().charAt(0);
        
        float discount=0.0f;
        
        if(category == 'A'){
            discount=0.60f;
        }else if(category=='B'){
            discount=0.40f;
        }else if(category=='C'){
            discount=0.20f;
        }else if(category=='D'){
            discount= 0.10f;
        }else{
            System.out.println("Invalid category entered");
            return;
        }
        float sp=mp-(mp*discount);
        System.out.println("Here's the price: "+sp);
    }
}