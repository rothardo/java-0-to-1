import java.util.Scanner;
public class Ques7 {
    public static void main(String[] args) {
        System.out.println("Basic charges 0.03rs per 1mb, 0.5rs for extra min for calling, 10rs per 1min of international call, No Discount Included\n"+
                "Premium charges 0.02rs per 1mb, 0.3rs for extra min for calling, 8rs per 1min of international call, Discount of 10%\n"+
                "Ultimate charges 0.01rs per 1mb, 0.1rs for extra min for calling, 5rs per 1min of international call, Discount of 20%\n");
        System.out.println("Your plan type");
        System.out.println("Press 1 for Basic\n"+"Press 2 for Premium\n"+"Press 3 for Ultimate");
        Scanner input = new Scanner(System.in);
        int plan = input.nextInt();
        System.out.println("Enter Data used(in mb), Extra min for calling, International call duration in min");
        float data = input.nextFloat();
        float call = input.nextFloat();
        float in = input.nextFloat();

        switch (plan) {
            case 1:
                float newdata = (float)(data*0.03);
                float newcall = (float)(call*0.5);
                float newin = (float)(in*10);
                float total = newdata + newcall + newin;
                System.out.println(total + " ruppes");
                break;
            case 2:
                float newdata2 = (float)(data*0.02);
                float newcall2 = (float)(call*0.3);
                float newin2 = (float)(in*8);
                float total2 = (float)((newdata2 + newcall2 + newin2)*0.1);
                System.out.println(total2 + " ruppes");
                break;
            case 3:
                float newdata3 = (float)(data*0.01);
                float newcall3 = (float)(call*0.1);
                float newin3 = (float)(in*5);
                float total3 = (float)((newdata3 + newcall3 + newin3)*0.2);
                System.out.println(total3 + " ruppes");
                break;

        }


    }
}