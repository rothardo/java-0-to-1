import java.util.Scanner;
public class Leap_year {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if(year%4==0 || year%400 ==0){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
