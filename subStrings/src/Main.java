import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //.substring() = A method used to extract a portion of a string .substring(start, end)

        Scanner scanner = new Scanner(System.in);

        int flag = 1;

        while(flag == 1){


            System.out.print("Enter Email: ");
            String email = scanner.nextLine();

            if(email.contains("@gmail.com")){
                flag = 0;
                //6 because u put index where u want it to end before that index
                String username = email.substring(0, email.indexOf("@"));
                String domain = email.substring(email.indexOf("@") + 1);

                System.out.println(username);
                System.out.println(domain);
            }
            else{
                System.out.println("Invalid Email!");
            }

        }
        scanner.close();
    }
}
