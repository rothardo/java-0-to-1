import java.util.Scanner;
public class Tempchecker {
    public static void main(String[] args) {
        System.out.println("Enter the Temperature");
        Scanner input1 = new Scanner(System.in);
        int temp = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        if (temp<10) {
            System.out.println( "Cold ");
        } else if (temp>=10 && temp<=25){
            System.out.println( "Warm ");
        }else{
            System.out.println( "Hot ");
        }
    }
}
