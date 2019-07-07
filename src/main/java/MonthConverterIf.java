
import java.util.Scanner;
public class MonthConverterIf {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.print("enter a number between 1 and 12: ");

            int montInt;

            montInt = in.nextInt();

            if (montInt == 1)

                System.out.println("January");

            else if (montInt == 2)

                System.out.println("February");

            else if (montInt == 3)

                System.out.println("March");

            else if (montInt == 4)

                System.out.println("April");

            else if (montInt == 5)

                System.out.println("May");

            else if (montInt == 6)

                System.out.println("June");

            else if (montInt == 7)

                System.out.println("July");

            else if (montInt == 8)

                System.out.println("August");

            else if (montInt == 9)
                System.out.println("September");

            else if (montInt == 10)

                System.out.println("October");

            else if (montInt == 11)

                System.out.println("November");

            else if (montInt == 12)

                System.out.println("December");

            else

                System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");

        }

    }

