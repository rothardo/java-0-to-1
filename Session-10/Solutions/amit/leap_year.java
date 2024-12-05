import java.util.Scanner;

public class leap_year {
    public static void main (String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.print("ENTER THE YEAR : ");
        int year=sc.nextInt();

        if(year%100==0)
        {
            if(year%4==0){
                System.out.println("LEAP YEAR");
            }
            else{
                System.out.println("NOT A LEAP YEAR");
            }
        }
        else if(year%4==0){
            System.out.println("LEAP YEAR");
        }
        else{
            System.out.println("NOT A LEAP YEAR");
        }
    }
}
