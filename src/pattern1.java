
import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String num1=null;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter a number: ");

            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                isValid = true;
            } else if (scanner.hasNextLine()) {
                num1= scanner.nextLine();
                isValid = false;
            } else {
                System.out.println("Input is not a number. Please try again.");
                scanner.next();
            }
        }

        System.out.println("The number entered is: " + num);
        scanner.close();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }



    }
}