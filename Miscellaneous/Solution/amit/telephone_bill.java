import java.util.Scanner;

public class telephone_bill {
    public static void main(String[] args){
        System.out.println("ENTER YOUR CALL TYPE :");
        System.out.println("1 FOR BASIC \n2 FOR PREMIUM \n3 FOR ULTIMATE");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        float total_bill=0;
        float data=0;

        System.out.println("ENTER THE EXTRA TIME IN MINITES");
        float extra = scanner.nextFloat();

        System.out.println("ENTER THE DATA USED IN MB ");
        data = scanner.nextFloat();

        switch(choice){
            case 1 :
                total_bill=20+(.5f*extra);
//              DISCOUNT APPLIED %5
                if(extra>5){
                    total_bill=total_bill-(total_bill*5)/100;
                }

                // CALCULATION OF DATA CHARGES.
                if(data>1){
                    total_bill=total_bill+.1f*data;
                }
                System.out.println("TOTAL BILL IS "+ total_bill);
                break;
            case 2:
                total_bill=100+(1*extra);
                // DISCOUNT APPLIED %10
                if(extra>10){
                    total_bill=total_bill-(total_bill*10)/100;
                }
                //CALCULATION OF DATA CHARGES.
                if(data>1){
                    total_bill=total_bill+.3f*data;
                }
                System.out.println("TOTAL BILL IS "+ total_bill);
                break;

            case 3:
                total_bill=100+(1.5f*extra);
//                discount applied %10
                if(extra>40){
                    total_bill=total_bill-(total_bill*12)/100;
                }
                // CALCULATION OF DATA CHARGES.
                if(data>1){
                    total_bill=total_bill+.5f*data;
                }
                System.out.println("TOTAL BILL IS "+ total_bill);
                break;
        }
    }
}
