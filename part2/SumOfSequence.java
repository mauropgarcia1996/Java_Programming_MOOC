package part2;
import java.util.Scanner;

public class SumOfSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.valueOf(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i <= input; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
