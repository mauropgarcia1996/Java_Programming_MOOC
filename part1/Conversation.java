import java.util.Scanner;

public class Conversation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi! how are you?");
        String firstText = scanner.nextLine();
        System.out.println("Cool, and what's your name?");
        String secondText = scanner.nextLine();
        System.out.println("Hi " + secondText + "! Do you like soccer?");
        String thirdText = scanner.nextLine();
        System.out.println("Great! but now I have to go. Have a good one.");

        System.out.println("PD: You wrote:");
        System.out.println(firstText);
        System.out.println(secondText);
        System.out.println(thirdText);
    }
}
