import java.util.Scanner;

public class temp_check {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.print("ENTER THE TEMPERATURE : ");
        int temp=sc.nextInt();

        if(temp<10){
            System.out.println("COLD");
        }
        else if(temp>25){
            System.out.println("HOT");
        }
        else{
            System.out.println("WARM");
        }
    }
}

