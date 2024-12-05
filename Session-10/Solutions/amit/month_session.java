import java.util.Scanner;

public class month_session {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.print("ENTER THE NO OF MONTH : ");
        int month=sc.nextInt();

        if(month==1 || month==12 || month== 11)
        {
            System.out.println("WINTER SEASON");
        }

        else if(month>=2 && month<=3){
            System.out.println("SPRING");
        }

        else if(month>=4 && month<=7){
            System.out.println("SUMMER");
        }

        else{
            System.out.println("RAINY");
        }
    }
}
