import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write some number to check if it's even or odd!");

        int number = Integer.valueOf(scanner.nextLine());

        System.out.println(number % 2 == 0 ? "It's even" : "It's odd");
    }
}
