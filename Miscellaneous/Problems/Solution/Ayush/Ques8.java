import java.util.Scanner;
public class Ques8 {
    public static void main(String[] args) {
        System.out.println("Pricing are set accordingly\n"+
                "100 for 18 and above and 50 for below 18\n"+
                "100 for Weekends and 80 for Weekdays\n"+
                "100 for Evening shows and 80 for Matinee Shows\n"+
                "100 for Regular (with No Discount), 300 for 3D (with 10% Discount) and 500 for IMAX (with 20% Discount)\n");
        System.out.println("Enter Age");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println("Enter Day (1 for Weekends and 0 for Weekdays)");
        int day = input.nextInt();
        System.out.println("Enter Show time (1 for matinee and 0 for evening");
        int time = input.nextInt();
        System.out.println("Enter Movie type (1 for regular and 2 for 3D and 3 for IMAX");
        int type = input.nextInt();
        int totalage=0,totalday=0,totaltime=0,totaltype=0;
        float total=0;

                if (age < 18) {
                    totalage = 50;
                }if (age >= 18 ) {
                    totalage =100;
            }if (day ==0){
                    totalday = 80;
            }if(day ==1){
                    totalday = 100;
            }if(time ==0) {
                totaltime = 100;
            }if(time ==1){
                    totaltime = 80;
            }
                switch (type) {
                    case 1:
                        total= (totalage+ totalday + totaltime + 100);
                        System.out.println("Total cost of the movie ticket is "+ total +" ruppes");
                        break;
                    case 2:
                        total= (float)((totalage+ totalday + totaltime + 300)*0.9);
                        System.out.println("Total cost of the movie ticket is "+ total +" ruppes");
                        break;
                    case 3:
                        total= (float)((totalage+ totalday + totaltime + 500)*0.8);
                        System.out.println("Total cost of the movie ticket is "+ total +" ruppes");
                        break;
                }



        }

}
