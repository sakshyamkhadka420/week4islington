import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your annual income (NPR): ");
        double income = scan.nextDouble();
        double tax;

        if (income > 0 && income <= 500000){
            tax = income * 0.1;
        }else if(income >   500000 && income <= 700000){
            tax = 5000 + (income - 500000) * 0.1;
        }else if(income > 700000 && income <= 1000000){
            tax = 15000 + (income - 700000) * 0.2;
        }else if(income > 1000000 && income <= 2000000){
            tax = 35000 + (income - 1000000) * 0.3;
        }else if(income > 2000000 && income <= 5000000){
            tax = 335000 + (income - 2000000) * 0.36;
        }else{
            tax = 1135000 + (income - 5000000) * 0.39;
        }
        
        System.out.println("Payable tax income : NPR " + tax);
        
    }
}