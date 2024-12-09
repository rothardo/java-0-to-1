import java.util.Scanner;
public class Ageverification {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age >= 18){
            System.out.println("You are eligible to vote");
        }else if (age < 18){
            System.out.println("You are not eligible to vote");
        }else{
            System.out.println("Invalid input");
        }
    }
}
