import java.util.Scanner;

public class vote_eligibel {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.print("ENTER THE AGE : ");
        int age=sc.nextInt();
        if (age>=18){
            System.out.println("ELIGIBLE FOR VOTE");
        }
        else{
            System.out.println("NOT ELIGIBLE FOR VOTE");
        }
    }
}
