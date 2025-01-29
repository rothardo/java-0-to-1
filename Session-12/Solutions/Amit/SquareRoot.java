import java.util.Scanner;

public class SquareRoot {
    public static double root(double n,double guess,int ite) {
        for(int i=0;i<ite;i++){
            guess=(guess+(n/guess))/2;
        }
        return guess;
    }
    public static void main(String[] args) {
        System.out.println("PLEASE ENTER THE NUMBER ");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println("GUESS THE INITIAL ROOT :");
        int guess=scanner.nextInt();
        System.out.println(root(n,guess,10));
    }
}
