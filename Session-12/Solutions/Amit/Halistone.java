import java.util.Scanner;

public class Halistone {
    public static void Hali(int n) {
        int count=1;
        int maxi=-1;
        while(n>1) {
            maxi=Math.max(maxi,n);
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            count++;

        }
        System.out.println("MAXIMUM ="+maxi +" LENGTH ="+count);
    }
    public static void main(String[] args) {
        System.out.println("PLEASE ENTER THE NUMBER ");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        Hali(n);
    }
}
