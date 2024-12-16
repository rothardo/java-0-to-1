import java.util.Scanner;

public class movieTicket {
    public static void main(String[] args) {
        System.out.println("ENTER THE AGE OF THE VIEWER :");
        Scanner scanner = new Scanner(System.in);
        float age=scanner.nextFloat();
        float discount=0f;

        float price=500f;
        System.out.println("ENTER THE CODE OF DAY (like 1 for sunday ,2 for monday ) :");
        int day=scanner.nextInt();

        System.out.println("ENTER SHOW TIME CODE \n1 FOR MATINEE \n2 FOR EVENING :");
        int showTime=scanner.nextInt();

        System.out.println("ENTER THE SHOW TYPE \n1 FOR REGULAR \n2 FOR 3D \n3 FOR INMAX:");
        int showType=scanner.nextInt();

        System.out.println("ENTER YOUR CHOICE \n1 FOR SINGLE \n2 FOR COUPLES \n3 FOR FAMILY :");
        int familyType=scanner.nextInt();


        if (age<18){
            discount=5;
        }

        if(showTime==2){
            price=price+40;
        }

        //PRICING DISTRIBUTION ACCORDING TO SHOW TYPE.
        switch(showType){
            case 2:
                price=price+50;
                break;

            case 3:
                price =price+150;
                break;

            default:
                System.out.println("NOT SUCH TYPE OF SHOW TYPE IS THERE ");
                return;
        }

        // EVALUATING THE PRICE ACCORDING TO DAY.
        // ON WEEKEND'S I AM INCREASING THE PRICE.
        if(day==1||day==7||day==6){
            price=price+50;
        }


        // I HAVE PLANED THE DISCOUNT ACCORDING TO FAMILY TYPE.
        switch(familyType){

            case 1:
                price =price;
                break;
            case 2:
                price=price+40;
                break;

            case 3:
                discount=discount+5;
                break;

            default:
                System.out.println("NOT A VALID FAMILY TYPE");
                return;
        }
        float finalPrice=price -(price*discount)/100;
        System.out.println("PRICE OF THE TICKET IS :"+finalPrice);
    }
}




