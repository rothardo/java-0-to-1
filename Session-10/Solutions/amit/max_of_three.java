import java.util.Scanner;

public class max_of_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER 1: ");
        int num1 = sc.nextInt();

        System.out.print("ENTER THE NUMBER 2: ");
        int num2 = sc.nextInt();

        System.out.print("ENTER THE NUMBER 3: ");
        int num3 = sc.nextInt();

        int maxim;

        if (num1 >= num2 && num1 >= num3) {
            maxim=num1;
        } else if (num2 >= num1 && num2 >= num3) {
            maxim=num2;
        } else {
            maxim=num3;
        }

        System.out.println("MAXIMUM NUMBER IS " +maxim);
    }
}
