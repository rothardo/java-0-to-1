import java.util.Scanner;

public class Simple_11 {
    public static double interest(double principle , double time , double rate) {
        double amt=(principle*time*rate)/100;
        return amt;
    }

    public static void main(String[] args) {
        System.out.println("PLEASE ENTER THE PRINCIPLE AMOUNT:- ");
        Scanner scanner = new Scanner(System.in);
        double pri=scanner.nextDouble();

        System.out.println("PLEASE ENTER THE TIME(IN YEAR):- ");
        double time=scanner.nextDouble();

        System.out.println("PLEASE ENTER THE RATE  IF INTEREST:- ");
        double rate=scanner.nextDouble();

        if(pri>=0 & time>=0 & rate>=0) {
            System.out.println("AMOUNT OF THE INTEREST IS:- " + interest(pri, time, rate));
        }
        else
            System.out.println("PLEASE ENTER VALID INPUT");
    }
}
