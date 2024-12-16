import java.util.Scanner;

public class CalendarDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER THE YEAR (MEANS LAST TWO DIGITS OF THE YEAR):");
        int year = scanner.nextInt();

        System.out.println("ENTER THE DECADE OF THE DATE:");
        int decade = scanner.nextInt();

        System.out.println("ENTER THE MONTH:");
        int month = scanner.nextInt();

        System.out.println("ENTER THE DATE OF MONTH:");
        int day = scanner.nextInt();

        int monthCode = -1;
        int decadeCode = -1;

        // Combine year and decade to calculate the full year
        int fullYear =(decade+100)+year;

        // Leap year check
        if ((fullYear%4==0&&(fullYear%100!=0||fullYear%400==0))) {
            if (month==2 && day==29) {
                // Valid date for February 29
            }
        } else if (month==2 && day==29) {
            System.out.println("NOT A VALID DATE (February 29 only exists in leap years)");
            return;
        }

        if (month == 2 && (day == 30 || day == 31)) {
            System.out.println("NOT A VALID DATE");
            return;
        }

        if (month == 1 || month == 10) {
            monthCode = 0;
        } else if (month == 2 || month == 3 || month == 11) {
            monthCode = 3;
        } else if (month == 4 || month == 7) {
            monthCode = 6;
        } else if (month == 5) {
            monthCode = 1;
        } else if (month == 6) {
            monthCode = 4;
        } else if (month == 8) {
            monthCode = 2;
        } else if (month == 9 || month == 12) {
            monthCode = 5;
        } else {
            System.out.println("NOT A VALID MONTH");
            return;
        }

        if (decade==20) {
            decadeCode=6;
        } else if (decade==19) {
            decadeCode=0;
        } else if (decade==18) {
            decadeCode=2;
        } else if (decade==17) {
            decadeCode=4;
        } else if (decade==16) {
            decadeCode=6;
        } else {
            System.out.println("THIS PROGRAM CAN NOT FIND DAY FOR PROVIDED DECADE");
            return;
        }

        int year_div=year/4;
        int inte;
        inte = year+year_div+day+decadeCode+monthCode;

        inte = inte%7+1;
        switch(inte){
            case 1:
                System.out.println("SUNDAY");
                break;

            case 2:
                System.out.println("MONDAY");
                break;

            case 3:
                System.out.println("TUESDAY");
                break;

            case 4:
                System.out.println("WEDNESDAY");
                break;

            case 5:
                System.out.println("THURSDAY");
                break;

            case 6:
                System.out.println("FRIDAY");
                break;

            case 7:
                System.out.println("SATURDAY");
                break;
        }
    }
}
