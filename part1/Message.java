import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");

        String message = scanner.nextLine();

        System.out.println("Your name is: " + message);
    }
    
}