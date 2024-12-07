import java.util.Scanner;

public class credit_card {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.print("ENTER THE AGE : ");
        float age=sc.nextFloat();


        System.out.print("ENTER THE INCOME : ");
        int income=sc.nextInt();

        System.out.print("ENTER THE EMPLOYMENT STATUS (true or false): ");
        boolean empl = sc.nextBoolean();

        System.out.print("ENTER THE CREDIT SCORE : ");
        int credit_score=sc.nextInt();


        System.out.print("Enter your debt-to-income ratio (as a percentage): ");
        double debtToIncomeRatio = sc.nextDouble();

        System.out.print("Do you have a good payment history? (true/false): ");
        boolean goodPaymentHistory = sc.nextBoolean();


        String ans="Not Eligible";
        if(age>=25 && income>100000 && credit_score>750 && debtToIncomeRatio >=50 && goodPaymentHistory && empl){
            ans="Platinum";
        }
        else if(age>=21 && income>60000 && credit_score>700  && debtToIncomeRatio >=50 && goodPaymentHistory && empl){
            ans="Gold";
        }
        else if(age>=18 && income>30000 && credit_score>650 && debtToIncomeRatio >=50 && goodPaymentHistory && empl){
            ans="Silver";
        }

        System.out.println("YOU ARE IN THE CATEGERY OF "+ans);
    }
}
