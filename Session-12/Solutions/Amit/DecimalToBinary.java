import java.util.Scanner;

public class DecimalToBinary {

    public static String decimal_to_binary(int num) {

        if(num==0){
            return "0";
        }
        int number=Math.abs(num);
        StringBuilder binary= new StringBuilder();
        while(number>0){
            int reminder=number%2;
            binary.insert(0,reminder);
            number=number/2;
        }
        if(num<0){
            binary=binary.insert(0,"-");
        }
        return binary.toString();
    }
    public static void main(String[] args) {
        System.out.println("PLEASE ENTER THE NUMBER ");
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println(decimal_to_binary(num));
    }
}
