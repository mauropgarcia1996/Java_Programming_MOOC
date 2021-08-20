package part2;

public class StarSing {
    public static void main(String[] args) {
        // printStars(5);
        // printSquare(4);
        // printRectangle(5, 2);
        // printTriangle(4);
        // printReverseTriangle(4);
        printChristmasTree(10);
    }

    public static void printStars(int number) {
        System.out.println("*".repeat(number));
    }

    public static void printSquare(int number) {
        int num = 0;

        while (num < number) {
            printStars(number);
            num++;
        }
    }

    public static void printRectangle(int width, int height) {
        int num = 0;

        while (num < height) {
            printStars(width);
            num++;
        }
    }

    public static void printTriangle(int size) {
        int num = 1;

        while (num <= size) {
            printStars(num);
            num++;
        }
    }

    public static void printSpace(int number) {
        System.out.println(" ".repeat(number));
    }

    public static void printReverseTriangle(int size) {
        int num = 1;

        while (num <= size) {
            String characterString = " ".repeat(size - num);
            characterString += "*".repeat(num);
            System.out.println(characterString);
            num++;
        }
    }

    public static void printAnotherTriangle(int height) {
        int num = 1;
        while (num <= height) {
            String row = "";

            // Insert Left Spaces
            if (num != height) {
                row += " ".repeat(height - num);
            }
            // Insert Left Stars
            row+= "*".repeat(num - 1);
            // Insert Middle Star
            row+= "*".repeat(1);
            // Insert Right Stars
            row+= "*".repeat(num - 1);
            // Insert Right Spaces
            if (num != height) {
                row += " ".repeat(height - num);
            }
            // Insert Base
            System.out.println(row);

            num++;
        }
    }

    public static void printBase(int height) {
        String base = "";
        base += " ".repeat(height - 2);
        base += "*".repeat(3);
        base += " ".repeat(height - 2);
        System.out.println(base);
        System.out.println(base);
    }

    public static void printChristmasTree(int height) {
        printAnotherTriangle(height);
        printBase(height);
    }

}
