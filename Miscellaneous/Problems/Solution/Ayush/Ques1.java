import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args) {
        System.out.println("Enter the requested data below");
        System.out.println("Age, Income, Credit, Employment Status (1 for employed, 0 for unemployed), Debt-to-income ratio, Payment history (1 for available, 0 for unavailable)");

        Scanner input = new Scanner(System.in);

        int age = input.nextInt();
        float income = input.nextFloat();
        float credit = input.nextFloat();
        int es = input.nextInt();
        float dti = input.nextFloat();
        int ph = input.nextInt();

        if (age >= 18 && income > 30000 && credit > 650 && es == 1 && dti > 0 && ph == 1) {
            System.out.println("You are Silver");
        } else if (age >= 21 && income > 60000 && credit > 700 && es == 1 && dti > 0 && ph == 1) {
            System.out.println("You are Gold");
        } else if (age >= 25 && income > 100000 && credit > 750 && es == 1 && dti > 0 && ph == 1) {
            System.out.println("You are Platinum");
        } else {
            System.out.println("You are Not Eligible");
        }

    }
}

