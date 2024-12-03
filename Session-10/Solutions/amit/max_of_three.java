import java.util.Scanner;

public class max_of_three {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.print("ENTER THE NO 1 : ");
        int num1=sc.nextInt();
        System.out.print("ENTER THE NO 2 : ");
        int num2=sc.nextInt();
        System.out.print("ENTER THE NO 3 : ");
        int num3=sc.nextInt();

        if(num1>num2 && num2>num3)
        {
            System.out.println("THE GREATEST IS "+ num1);
        }
        else if(num2>num3 && num3>num1)
        {
            System.out.println("THE GREATEST IS "+ num2);
        }
        else
        {
            System.out.println("THE GREATEST IS "+ num3);
        }
    }
}
