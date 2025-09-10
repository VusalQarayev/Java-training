
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Read book info
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.println("Publication year: ");
            int year = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, pages, year));
        }

        System.out.println();

        
        System.out.print("What information will be printed? ");
        String choice = scanner.nextLine();

        System.out.println();

        if (choice.equalsIgnoreCase("everything")) {
            for (Book book : books) {
                System.out.println(book); // Uses Book.toString()
            }
        } else if (choice.equalsIgnoreCase("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }

    }
}
