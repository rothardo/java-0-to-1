import java.util.Scanner;

public class PerfectNumber {
    public static boolean Perfect(int n) {
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum==n;
    }
    public static void main(String[] args) {
        System.out.println("PLEASE ENTER THE NUMBER ");
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println(Perfect(num));
    }
}
