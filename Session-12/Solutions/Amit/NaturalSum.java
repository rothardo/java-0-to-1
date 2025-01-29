import java.util.Scanner;

public class NaturalSum {

    public static int sum(int n) {
        if (n<=0){
            return  0;
        }
            return n+sum(n-1);
        }
    public static void main(String[] args) {
        System.out.println("PLEASE ENTER THE NUMBER ");
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println(sum(num));
    }
}