
import java.util.Scanner;

public class Task1_NumberNotANumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        while (!(text.equalsIgnoreCase("END"))) {

            try {
                Integer.parseInt(text);
                System.out.println("Number");
            } catch (NumberFormatException ex) {
                System.out.println("No a number");
            }

            text = sc.nextLine();

        }
    }

}
