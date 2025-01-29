import java.util.Scanner;

public class Prime_11 {
    public static boolean Check(int n) {
        if(n==1){
            return false;
        }
        int i=2;
        while(n/2>=i){
            if (n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("PLEASE ENTER THE NUMBER ");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        if(Check(n)){
            System.out.println("THIS IS  A PRIME NUMBER ");
        }

        else{
            System.out.println("THIS IS NOT PRIME ");
        }
    }
}
