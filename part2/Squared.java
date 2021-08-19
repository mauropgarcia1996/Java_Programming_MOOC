package part2;
import java.util.Scanner;

// Calculating Square and Square Root

public class Squared {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! Let's calculate the square of a number of your choice.");
        int number = Integer.valueOf(scanner.nextLine());

        System.out.println("The square of " + number + " is " + (number * number));
        System.out.println("The square root of " + number + " is " + Math.sqrt(number));


    }
}
