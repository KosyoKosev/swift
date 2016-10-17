
import java.util.Scanner;

public class Task1_PeoplePresentation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        while (!(text.equalsIgnoreCase("END"))) {

            String[] split = text.split(" ");
            Person p;
            if (split.length == 5) {
                p = new Student(split[0], split[1], split[2],
                        Double.parseDouble(split[3]), Double.parseDouble(split[4]));

            } else {
                p = new Worker(split[0], split[1],
                        Integer.parseInt(split[2]), Integer.parseInt(split[3]));
            }
            
            String error = p.validate();
            if (error.equals("")) {
                System.out.println(p);
            } else {
                System.out.println(error);
            }
            text = sc.nextLine();
        }
    }

}
