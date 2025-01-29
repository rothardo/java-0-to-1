import java.util.Scanner;

// HERE I AM USING THE PROPERTY  A*B=L.C.M.(A,B)*L.C.M.(A,B).   
public class LCM_12 {
    public static int HCF(int a,int b) {
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLEASE ENTER NUMBERS :- ");
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();

        System.out.println("LCM IS :-  "+(n1*n2)/HCF(n1,n2));
    }
}