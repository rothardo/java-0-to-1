import java.util.Scanner;

public class CubeSum {
    public static int SumOfCube(int n) {
        if(n<=0){
            return 0;
        }
        return n*n*n+SumOfCube(n-1);
    }

    public static void main(String[] args) {
        System.out.println("PLEASE ENTER THE NUMBER ");
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println(SumOfCube(num));
    }
}
