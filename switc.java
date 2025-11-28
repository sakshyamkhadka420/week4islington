import java.util.Scanner;
public class switc{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the product price: ");
        float mp=sc.nextFloat();
        System.out.println("Enter the product category(A/B/C/D): ");
        char category=sc.next().toUpperCase().charAt(0);
        
        float discount=0.0f;
        
        switch(category){
        case 'A':
                 discount=0.60f;
                 break;
        case 'B':
                 discount=0.40f;
                 break;
        case 'C':
                 discount=0.20f;
                 break;
        case 'D':
                 discount=0.10f;
                 break;
        }
        float sp=mp-(mp*discount);
        System.out.println("Here's the price: "+sp);
    }
}