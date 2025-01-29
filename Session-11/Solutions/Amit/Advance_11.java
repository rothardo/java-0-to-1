import java.util.Scanner;

public class Advance_11 {
    public static void Comp(int n1,int n2, int n3, int n4 ,int n5) {
        int LocalMax=n1;
        int LocalMin=n1;
        if(n2>LocalMax){
            LocalMax=n2;
        }
        if(n2<LocalMin) {
            LocalMin = n2;
        }

        if(n3>LocalMax){
            LocalMax=n3;
        }
        if(n3<LocalMin) {
            LocalMin = n3;
        }

        if(n4>LocalMax){
            LocalMax=n4;
        }
        if(n4<LocalMin) {
            LocalMin = n4;
        }

        if(n5>LocalMax){
            LocalMax=n5;
        }
        if(n5<LocalMin){
            LocalMin=n5;
        }
        System.out.println("MAXIMUM IS :- "+LocalMax + " MINIMUM IS :- "+LocalMin);

        if(n1==n2 & n2==n3 & n3==n4 & n4==n5){
            System.out.println("ALL NUMBER IS EQUAL ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLEASE ENTER FIVE NUMBERS:- ");
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int n3=scanner.nextInt();
        int n4=scanner.nextInt();
        int n5=scanner.nextInt();
        Comp(n1,n2,n3,n4,n5);
    }
}
