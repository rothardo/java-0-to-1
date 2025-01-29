import java.util.Scanner;

public class Fibonacci_11 {
    public static void Series(int n) {
        int n1=0;
        int n2=1;
        System.out.print(n1 +","+n2);
        for(int i=0;i<n-1;i++){
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(","+n3);
        }
    }

    public static void main(String[] args) {
        System.out.println("PLEASE ENTER THE LENGTH OF THE SERIES:- ");
        Scanner scanner = new Scanner(System.in);
        int l=scanner.nextInt();
        Series(l);
    }
}
