import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER 1: ");
        int num1 = sc.nextInt();

        System.out.print("ENTER THE NUMBER 2: ");
        int num2 = sc.nextInt();

        System.out.print("ENTER THE NUMBER 3: ");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("THE GREATEST IS " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("THE GREATEST IS " + num2);
        } else {
            System.out.println("THE GREATEST IS " + num3);
        }
    }
}
