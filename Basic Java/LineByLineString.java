
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String first = scanner.nextLine();
            if (first.equals("")) {
                break;
            }
            String[] pieces = first.split(" ");
            for (String word : pieces) {
                System.out.println(word);
            }
        }

    }

}
