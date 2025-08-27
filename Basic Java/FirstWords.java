
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();

            if (line.equals("")) {
                break;
            }

            String[] words = line.split(" ");

            if (words.length > 0) {
                System.out.println(words[0]);
            }

        }

    }
}
