import java.util.*;
public class days_of_week {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.print("ENTER THE NO OF DAY : ");
        int day=sc.nextInt();

        switch(day) {
            case 1 :
                System.out.println("SUNDAY");
                break;
            case 2 :
                System.out.println("MONDAY");
                break;
            case 3 :
                System.out.println("TUESDAY");
                break;
            case 4 :
                System.out.println("WEDNESDAY");
                break;
            case 5 :
                System.out.println("THRUSDAY");
                break;
            case 6 :
                System.out.println("FRIDAY");
                break;
            case 7 :
                System.out.println("SATURDAY");
                break;
            default:
                System.out.println("NOT A VALID ENTRY ");
        }
        }
    }
