import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        System.out.println("Enter the Year");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year % 4 == 0) {
            System.out.println("Leap Year ");
        } else {
            System.out.println("Not a leap Year ");
        }
    }
}
