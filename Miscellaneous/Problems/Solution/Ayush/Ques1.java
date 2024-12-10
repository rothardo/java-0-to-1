import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        System.out.println("Are you employed? (true/false)");
        Scanner input = new Scanner(System.in);
        boolean es = input.nextBoolean();
        float credit, income;
       if (es) {
           System.out.println("Are you having maintained/good Debt-To-Income Ratio and Payment History? (true/false)");
           boolean statement = input.nextBoolean();
           if (statement) {
               System.out.println("What is your age?");
               int age = input.nextInt();
               if (age >= 25) {
                   System.out.println("Enter your income");
                   income = input.nextFloat();
                   System.out.println("Enter your credit score");
                   credit = input.nextFloat();
                   if (income > 100000 && credit > 750) {
                       System.out.println("You are Platinum");
                   } else if (income > 60000 && credit > 700) {
                       System.out.println("You are Gold");
                   } else if (income > 30000 && credit > 650) {
                       System.out.println("You are Silver");
                   } else {
                       System.out.println("You are Not Eligible as income and credit score is not meeting requirements");
                   }
               } else if (age >= 21 && age < 25) {
                   System.out.println("Enter your income");
                   income = input.nextFloat();
                   System.out.println("Enter your credit score");
                   credit = input.nextFloat();
                   if (income > 60000 && credit > 700) {
                       System.out.println("You are Gold");
                   } else if (income > 30000 && credit > 650) {
                       System.out.println("You are Silver");
                   } else {
                       System.out.println("You are Not Eligible as income and credit score is not meeting requirements");
                   }
               } else if (age >= 18 && age < 21) {
                   System.out.println("Enter your income");
                   income = input.nextFloat();
                   System.out.println("Enter your credit score");
                   credit = input.nextFloat();
                   if (income > 30000 && credit > 650) {
                       System.out.println("You are Silver");
                   } else {
                       System.out.println("You are Not Eligible as income and credit score is not meeting requirements");
                   }

               }else{
                   System.out.println("You are Not eligible as you are underaged");
               }
           }else {
               System.out.println("You are Not eligible");

           }
       }else{
           System.out.println("Are you are eligible");
       }
    }}



