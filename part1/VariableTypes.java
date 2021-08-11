import java.util.Scanner;

public class VariableTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean showInfo = false;
        String typeString = "Hello!";
        int typeInteger = 4;
        double typeDouble = 70.5;

        System.out.println("Greeting: " + typeString);
        System.out.println("Age: " + typeInteger);
        System.out.println("Weight: " + typeDouble);

        System.out.println("Change my greeting!");
        typeString = scanner.nextLine();

        System.out.println("Change my age!");
        typeInteger = Integer.valueOf(scanner.nextLine());

        System.out.println("Change my weight!");
        typeDouble = Double.valueOf(scanner.nextLine());

        System.out.println("Show new information?");
        showInfo = Boolean.valueOf(scanner.nextLine());

        if (showInfo) {
            System.out.println("New Greeting: " + typeString);
            System.out.println("New Age: " + typeInteger);
            System.out.println("New Weight: " + typeDouble);
        }

    }
}
