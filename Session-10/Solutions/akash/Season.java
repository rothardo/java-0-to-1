import java.util.Scanner;
public class Season {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month as 1 to 12");
        int month = scanner.nextInt();
        if(month>=3 && month<=5){
            System.out.println("Spring Season");
        }
        else if(month>=6 && month<=8){
            System.out.println("Summer Season");
        }
        else if(month>=9 && month<=11){
            System.out.println("Autumn Season");
        }
        else if(month==1 || month==2 || month==12){
            System.out.println("Winter Season");
        }
        else{
            System.out.println("Invalid month entered");
        }
    }
}
