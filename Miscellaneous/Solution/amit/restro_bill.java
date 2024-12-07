import java.util.Scanner;

public class final_grade {
    public static void main(String[] args){
        System.out.println("ENTER THE ATTENDENCE IN PERCENTAGE");
        Scanner scanner = new Scanner(System.in);
        float attend = scanner.nextFloat();

        System.out.println("ENTER THE HOMEWORK COMPLETED IN PERCENTAGE");
        float home_work = scanner.nextFloat();

        System.out.println("ENTER THE MIDTERM MARKS IN PERCENTAGE");
        float midterm = scanner.nextFloat();

        System.out.println("ENTER THE FINAL EXAM MARKS IN PERCENTAGE");
        float final_exam = scanner.nextFloat();

        float final_marks=(((attend*15)/100)+((home_work*15)/100)+((midterm*15)/100)+((final_exam*15)/100));

        System.out.println(" YOUR  FINAL MARKS IS " +final_marks);

         if(final_marks>=50){
             System.out.println("YOU ARE PASS");
         }
         else{
             System.out.println("YOU ARE FAIL");
         }
    }
}
