
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int a = Integer.valueOf(scanner.nextLine());
        while(a>0){
            printText();
            a--;
        }
    }
    
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
