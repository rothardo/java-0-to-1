import java.util.Scanner;
public class Evenorodd {
    public static void main(String[] args) {
        System.out.println("Enter the digit");
        Scanner input = new Scanner(System.in);
        int digit = input.nextInt();
        if (digit % 2 == 0) {
            System.out.println("The entered number is even ");
        } else if (digit % 2 != 0) {
            System.out.println("The entered number is odd ");
        } else {
            System.out.println("Invalid input ");
        }
    }
}