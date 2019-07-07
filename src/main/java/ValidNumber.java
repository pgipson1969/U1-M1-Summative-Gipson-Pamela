import java.util.Scanner;

public class ValidNumber {


    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        int num = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print("Enter number between 1 and 10: ");
            {
                num = sn.nextInt();            //   if (num >= 1 && num <= 10) {
                 //   valid = true;
                } elseif (num<1&& num>10);
                {                System.out.println("You must enter a number between 1 and 10, please try again.");
                sn.next();
               elseif (num >= 1 && num <= 10);
                System.out.println(num + " is a valid number.");
            }
        }

    }

    private static void elseif(boolean b) {
    }
}