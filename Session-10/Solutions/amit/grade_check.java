import java.util.Scanner;

public class grade_check {
      public static void main(String[] args){
          Scanner sc =new Scanner (System.in);
          System.out.print("ENTER THE MARKS : ");
          int marks=sc.nextInt();

          if(marks<50){
              System.out.println("FAIL");
          }
          else{
              System.out.println("PASS");
          }
      }
}
