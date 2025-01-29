import java.util.Scanner;

public class Notes_11 {
    public static void Note(int n) {
        if(n%5!=0){
            System.out.println("THIS IS NOT A VALID AMOUNT \nPLEASE ENTER THE AMOUNT IN THE MULTIPLE OF 5 ");
        }
        else {
            if (n % 100 < n) {
                int Note_100 = n / 100;
                n = n % 100;
                System.out.println("100$ bills :-  " + Note_100);
            }

            if (n % 50 < n) {
                int Note_50 = n / 50;
                n = n % 50;
                System.out.println("50$ bills :-  " + Note_50);
            }

            if (n % 20 < n) {
                int Note_20 = n / 20;
                n = n % 20;
                System.out.println("20 bills :-  " + Note_20);
            }

            if (n % 10 < n) {
                int Note_10 = n / 10;
                n = n % 10;
                System.out.println("10 bills :-  " + Note_10);
            }

            if (n % 5 < n) {
                int Note_5 = n / 5;
                n = n % 5;
                System.out.println("5 bills :-  " + Note_5);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("PLEASE ENTER THE AMOUNT ");
        Scanner scanner = new Scanner(System.in);
        int amt=scanner.nextInt();

        Note(amt);
    }
}
