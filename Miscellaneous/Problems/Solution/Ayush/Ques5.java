import java.util.Scanner;
public class Ques5 {
    public static void main(String[] args) {
        System.out.println("Choose the operation you want to perform:");
        System.out.println("Press 1 for Checking current Balance");
        System.out.println("Press 2 for Withdraw");
        System.out.println("Press 3 for Deposit");
        System.out.println("Press 4 for Money Transfer");
        Scanner input = new Scanner(System.in);
        int operation = input.nextInt();
        int originalpin=8087;
        float balance = 0;
        switch(operation){
            case 1:
                System.out.println(balance);
                break;
            case 2:
                System.out.println("Enter the amount to withdraw");
                float amount = input.nextFloat();
                if(amount<balance){
                    float amountlatest = balance - amount;
                    System.out.println(amountlatest);
                }else {
                    System.out.println("Insufficient balance");
                }
                break;
            case 3:
                System.out.println("Enter the amount to deposit");
                float depoamount = input.nextFloat();
                float depoamountlatest = balance + depoamount;
                System.out.println(depoamountlatest);
                break;
            case 4:
                System.out.println("Enter the pin for verification");
                int pin = input.nextInt();
                if(originalpin==pin){
                    System.out.println("Enter the Account number of the receiver");
                    int accno = input.nextInt();
                    System.out.println("Enter the amount to transfer");
                    float transferamount = input.nextFloat();
                    if(transferamount>20000){
                        System.out.println("Amount is above the transactions limits ");
                    }else{
                        System.out.println("Successfully amount transferred");
                    }
                }else{
                    System.out.println("Wrong pin entered");
                }
                break;
        }

    }
}
