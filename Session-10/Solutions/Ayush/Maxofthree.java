import java.util.Scanner;
public class Maxofthree {
    public static void main(String[] args) {
        System.out.println("Enter the three numbers:");
        Scanner input1 = new Scanner(System.in);
        int num1 = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        int num2 = input2.nextInt();
        Scanner input3 = new Scanner(System.in);
        int num3 = input3.nextInt();
        if (num1>num2 && num1>num3) {
            System.out.println( num1 + " is the biggest number ");
        } else if (num2>num1 && num2>num3){
            System.out.println( num2 + " is the biggest number ");
        }else{
            System.out.println( num3 + " is the biggest number ");
        }
    }
}
