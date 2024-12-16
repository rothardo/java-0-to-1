import java.util.Scanner;
public class login {
    public static void main(String[] args){
        String user_stored="amit_raj";
        String pass_stored ="amit_amit";

        System.out.println("ENTER THE USER ID :");
        Scanner scanner = new Scanner(System.in);
        String user_id_entered = scanner.nextLine();
        System.out.println("YOU ENTERED USER ID :"+ user_id_entered);


        System.out.println("ENTER THE PASSWORD");
        String password_entered = scanner.nextLine();
        System.out.println("YOU ENTERED PASSWORD :"+ password_entered);

        if (user_stored.equals(user_id_entered) && pass_stored.equals(password_entered)){
            System.out.println("YOUR CREDENTIAL IS CORRECT");
        }

        else{
            System.out.println("WRONG CREDENTIAL");
            System.out.println("ENTER THE USER ID :");
            String user_id_entered_2 = scanner.nextLine();
            System.out.println("YOU ENTERED USER ID :"+ user_id_entered);


            System.out.println("ENTER THE PASSWORD");
            String password_entered_2 = scanner.nextLine();
            System.out.println("YOU ENTERED PASSWORD :"+ password_entered_2);
            if (user_stored.equals(user_id_entered_2) && pass_stored.equals(password_entered_2)){
                System.out.println("YOUR CREDENTIAL IS CORRECT");
            }

            else{
                System.out.println("WRONG CREDENTIAL");
                System.out.println("ENTER THE USER ID :");
                String user_id_entered_3 = scanner.nextLine();
                System.out.println("YOU ENTERED USER ID :"+ user_id_entered);


                System.out.println("ENTER THE PASSWORD");
                String password_entered_3 = scanner.nextLine();
                System.out.println("YOU ENTERED PASSWORD :"+ password_entered);
                if (user_stored.equals(user_id_entered_3) && pass_stored.equals(password_entered_3)){
                    System.out.println("YOUR CREDENTIAL IS CORRECT");
                }

                else{
                    System.out.println("WRONG CREDENTIAL AND YOUR ACCOUNT IS BLOCKED");
                }
            }
        }
        int char_count=0;
        int int_count=0;
        for(int i=0;i<pass_stored.length();i++){
            if(Character.isLetter(pass_stored.charAt(i))){
                char_count++;
            }
            else{
                int_count++;
            }
        }

        if(char_count>2 && int_count>2 && pass_stored.length()>8){
            System.out.println("Password is strong");
        }

        else if(char_count>1 && int_count>2 && pass_stored.length()>6){
            System.out.println("Password is medium");
        }

        //if(char_count>1 && int_count>1 && pass_stored.length()>4)
         else{
            System.out.println("Password is easy");
        }
    }
}
