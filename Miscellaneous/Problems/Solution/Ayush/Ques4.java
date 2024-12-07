import java.util.Scanner;
public class Ques4 {
    public static void main(String[] args) {
        System.out.println("The unit for input");
        System.out.println("Press 1 for Celsius");
        System.out.println("Press 2 for Fahrenheit");
        System.out.println("Press 3 for Kelvin");
        Scanner input = new Scanner(System.in);

        int choice = input.nextInt();

        System.out.println("Convert to which scale");
        System.out.println("Press 1 for Celsius");
        System.out.println("Press 2 for Fahrenheit");
        System.out.println("Press 3 for Kelvin");
        int choice2 = input.nextInt();
        System.out.println("Enter the temperature");
        float temp = input.nextFloat();
        float cf = temp*((float)(9/5) + 32);
        float ck = temp+(float)273.15;
        float fk = (float)((float)(temp-32)*((float)5/9)+273.15);
        float fc = (float)(temp-32)*((float) 5 /9);
        float kc = (float) (temp-273.15);
        float kf = (float)((float)(temp-273.15)*((float)9/5)+32);


        switch (choice){
         case 1:
             if (choice2 == 2){
                 System.out.println(cf);
             }else if(choice2 == 3){
                 System.out.println(ck);
             }
             break;
         case 2:
             if (choice2 == 1){
                 System.out.println(fc);
             }else if(choice2 == 3){
                 System.out.println(fk);
             }
             break;
         case 3:
             if (choice2 == 3){
                 System.out.println(kc);
             }else if(choice2 == 2){
                 System.out.println(kf);
             }
             break;

        }
    }
}
