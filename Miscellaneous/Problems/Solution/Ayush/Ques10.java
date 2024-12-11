import java.util.Scanner;
public class Ques10 {
    public static void main(String[] args) {
        System.out.println("What operation you want to perform?\n"+
                "Press 1 for Login to your account\n"+
                "Press 2 for Password Strength Checking \n");
        Scanner input = new Scanner(System.in);
        String userid = "Ayush",id,newpass;
        int passcode = 8087;
        int code;
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You are having 3 attempts\n" +
                        "Enter the Userid\n");
                id = input.next();
                System.out.println("Enter the Passcode\n");
                code = input.nextInt();
                if (userid.equals(id) && passcode == code) {
                    System.out.println("You are logged in");
                } else {
                    System.out.println("Wrong credentials, You are having 2 attempts\n" +
                            "Enter the Userid\n");
                    id = input.next();
                    System.out.println("Enter the Passcode\n");
                    code = input.nextInt();
                    if (userid.equals(id) && passcode == code) {
                        System.out.println("You are logged in");
                    } else {
                        System.out.println("Wrong credentials, You are having 1 attempts\n" +
                                "Enter the Userid\n");
                        id = input.next();
                        System.out.println("Enter the Passcode\n");
                        code = input.nextInt();
                        if (userid.equals(id) && passcode == code) {
                            System.out.println("You are logged in");
                        } else {
                            System.out.println("Wrong credentials, Account Locked");
                            if (userid.equals(id) && passcode == code) {
                                System.out.println("You are logged in");
                            }
                        }


                    }
                }
                break;
            case 2:
                System.out.println("Enter the password\n");
                newpass = input.next();
                if(newpass.length() > 8 && newpass.contains("$")){
                    System.out.println("Password is Strong\n");
                }else{
                    System.out.println("Weak password\n");
                }

        }
    }
}
