import java.util.Scanner;

public class Validate_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=0;
        do{
            System.out.println("PLEASE ENTER A POSITIVE NUMBER ");
            number=scanner.nextInt();
            if(number<0){
                System.out.println("WRONG ENTRY ");
            }
            else
                System.out.println("WRITE ENTRY ");
        }while(number<=0);

        System.out.println(number);
    }
}
