package part2;

public class Reprint {
    public static void main(String[] args) {
        // Run Method
        printText();
        printText();
        System.out.println("");
        printMessage("Well, this is a message.");
        printMessage("Hey there! cheers.");

        int myNumber = returnNumber(10);
        System.out.println(myNumber);
    }

    public static void printText() {
        System.out.println("Hello! I'm printing something...");
    }

    public static void printMessage(String input) {
        System.out.println(input);
    }

    public static int returnNumber(int number) {
        return number;
    }
}
