package part2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.valueOf(scanner.nextLine());
        int sum_factorial = 1;
        
        // FACTORIAL SEQUENCE
        for (int i = 1; i <= input; i++) {
            sum_factorial = sum_factorial * i;
        }
        System.out.println(sum_factorial);
    }
}
