package part2;
import java.util.Scanner;

// Conditionals and Comparisons

public class Absolute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's calculate the absolute number");

        int number = Integer.valueOf(scanner.nextLine());

        System.out.println("The absolute of " + number + " is " + (number < 0 ? number * -1 : number));
    }
}
