import java.util.Scanner;
public class Ques3 {
    public static void main(String[] args) {
        System.out.println("Enter Attendance, Homework, Midterm, Final score");
        Scanner input = new Scanner(System.in);
        float attend = input.nextFloat();
        float hw = input.nextFloat();
        float mt = input.nextFloat();
        float finals = input.nextFloat();

        float attend2 = (float) (attend*0.15);
        float hw2 = (float) (hw*0.25);
        float mt2 = (float) (mt*0.25);
        float finals2 = (float) (finals*0.35);
        float total= (float) (attend2+hw2+mt2+finals2);
        if(total>=90){
            System.out.println("You are pass with AA grade");
        }else if(total>=80){
            System.out.println("You are pass with AB grade");
        }else if(total>=70){
            System.out.println("You are pass with BB grade");
        }else if(total>=60){
            System.out.println("You are pass with BC grade");
        }else if(total>=50){
            System.out.println("You are pass with CC grade");
        }else if(total>=40){
            System.out.println("You are pass with CD grade");
        }else if(total>30){
            System.out.println("You are pass with DD grade");
        }else{
            System.out.println("You are fail");
        }
    }
}