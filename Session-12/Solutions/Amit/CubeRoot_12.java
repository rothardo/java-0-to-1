import java.util.Scanner;

public class CubeRoot_12 {
    public static double Root(double n,double guess,int ite) {
        for(int i=0;i<ite;i++){
            guess=(guess+(n/guess))/3;
        }
        return guess;
    }
    public static void main(String[] args) {
        System.out.println("PLEASE ENTER THE NUMBER ");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println("GUESS THE CUBE ROOT :");
        int guess=scanner.nextInt();
        System.out.println(Root(n,guess,10));
    }
}