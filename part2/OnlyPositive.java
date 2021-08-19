package part2;
import java.util.Scanner;

public class OnlyPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a Positive Number!");
            int number = Integer.valueOf(scanner.nextLine());

            if (number < 0) {
                System.err.println("Unsuitable number :( try again.");
                continue;
            } else if (number == 0) {
                System.out.println("Error");
                break;
            } else {
                System.out.println(Math.pow(number, 2));
            }
        }
    }
}
