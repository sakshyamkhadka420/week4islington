import java.util.Scanner;
public class xfx{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to XFX cinema");
        System.out.println("Are you a child, an adult or a senior?(Child/Adult/Senior): ");
        String age=sc.next();
        System.out.println("Which language do you want to watch the movie in?(Nepali/Hindi/English)");
        String lang=sc.next();
        System.out.println("Do you have your student ID(Yes/No)");
        String sid=sc.next();
        System.out.println("Is it a festive holiday?(Yes/No)");
        String fh=sc.next();
        
        double price=0;
        switch (age){
            case "Adult": price=250; break;
            case "Child": price=150; break;
            case "Senior": price=200; break;
            default: System.out.println("Invalid age group");return;
        }
        switch(lang){
            case "Nepali": break;
            case "English": price+=100;break;
            case "Hindi": price+=50;break;
            default: System.out.println("Invalid language");return;
        }
        switch(sid){
            case "Yes":price*=0.80;break;
            case "No": break;
            default: System.out.println("Invalid choice");return;
        }
        switch(fh){
            case "Yes":price*=0.85;break;
            case "No": break;
            default: System.out.println("Invalid choice");return;
        }
        System.out.println("Your ticket price is :"+price);
    }
}