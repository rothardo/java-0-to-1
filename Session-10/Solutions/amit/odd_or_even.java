import java.util.*;
public class odd_or_even {
    public static void main (String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.print("ENTER THE NO : ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("NUMBER IS EVEN");
        }
        else{
            System.out.println("NUMBER IS ODD");
        }
    }
}
