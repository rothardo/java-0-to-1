import java.util.Scanner;
public class Ques4 {
    public static void main(String[] args) {
        System.out.println("Enter the input unit\n"
        +"Press 1 for Celsius\n"
        +"Press 2 for Fahrenheit\n"
        +"Press 3 for Kelvin");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        int choice2;
        System.out.println("Enter the temperature");
        float temp = input.nextFloat();
        float cf = temp * 9 / 5 + 32;
        float ck = temp + 273.15f;
        float fk = (temp - 32) * 5 / 9 + 273.15f;
        float fc = (temp - 32) * 5 / 9;
        float kc = temp - 273.15f;
        float kf = (temp - 273.15f) * 9 / 5 + 32;
        switch (choice) {
            case 1:
                System.out.println("Enter the output unit\n"
                        + "Press 1 for Fahrenheit\n"
                        + "Press 2 for Kelvin");
                 choice2 = input.nextInt();
                switch (choice2) {
                    case 1:
                        System.out.println(cf);
                        break;
                    case 2:
                        System.out.println(ck);
                        break;
                }
                break;
            case 2:
                System.out.println("Enter the output unit\n"
                        + "Press 1 for Celsius\n"
                        + "Press 2 for Kelvin");
                 choice2 = input.nextInt();
                switch (choice2) {
                    case 1:
                        System.out.println(fc);
                        break;
                    case 2:
                        System.out.println(fk);
                        break;
                }
                break;
            case 3:
                System.out.println("Enter the output unit\n"
                        + "Press 1 for Celsius\n"
                        + "Press 2 for Fahrenheit");
                 choice2 = input.nextInt();
                switch (choice2) {
                    case 1:
                        System.out.println(kc);
                        break;
                    case 2:
                        System.out.println(kf);
                        break;
                }
                break;


        }}
}
