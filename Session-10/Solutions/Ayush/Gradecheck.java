import java.util.Scanner;
public class Gradecheck {
    public static void main(String[] args) {
        System.out.println("Enter the Marks");
        Scanner input = new Scanner(System.in);
        int marks = input.nextInt();
        if (marks>50) {
            System.out.println("Passed ");
        } else {
            System.out.println("Failed ");
        }
    }
}
