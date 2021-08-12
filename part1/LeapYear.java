import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number = Integer.valueOf(reader.nextLine());

        System.err.println("Given a year: " + number);
        if (number % 4 == 0 && number % 100 != 0) {
            System.out.println("It's a leap year.");
        } else if (number % 100 == 0 && number % 400 == 0) {
            System.out.println("It's a leap year.");
        } else {
            System.out.println("It's NOT a leap year.");
        }
    }
}
