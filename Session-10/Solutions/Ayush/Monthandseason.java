import java.util.Scanner;
public class Monthandseason {
    public static void main(String[] args) {
        System.out.println("Enter the number from 1 to 12");
        Scanner input1 = new Scanner(System.in);
        int month = input1.nextInt();
        switch (month) {
            case 1:
                System.out.println("Its January month and Winter season");
                break;
            case 2:
                System.out.println("Its February month and Winter season");
                break;
            case 3:
                System.out.println("Its March month and Winter season");
                break;
            case 4:
                System.out.println("Its April month and Spring season");
                break;
            case 5:
                System.out.println("Its May month and Spring season");
                break;
            case 6:
                System.out.println("Its June month and Spring season");
                break;
            case 7:
                System.out.println("Its July month and Summer season");
                break;
            case 8:
                System.out.println("Its August month and Summer season");
                break;
            case 9:
                System.out.println("Its September month and Summer season");
                break;
            case 10:
                System.out.println("Its October month and Fall season");
                break;
            case 11:
                System.out.println("Its November month and Fall season");
                break;
            case 12:
                System.out.println("Its December month and Fall season");
                break;
            default:
                System.out.println("Invalid month");
        }

    }
}