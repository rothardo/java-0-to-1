import java.util.Scanner;
public class temperature {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the temperature");
       float temp = scanner.nextFloat();
       if(temp<=10){
           System.out.println("Cold Temperature");
       }
       else if (temp>10 && temp<25) {
           System.out.println("Warm Temperature");
       }
       else {
           System.out.println("Hot Temperature");
       }
    }
}