package part3;
import java.util.Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {5, 5, 5, 5};

        sumOfNumbersInArray(numbers);
        printNeatly(numbers);
    }

    public static void sumOfNumbersInArray(int[] array) {
        int sum = 0;
        for (int number: array) {
            sum += number;
        }

        System.out.println("The sum of all numbers is: " + sum);
    }

    public static void printNeatly(int[] array) {
        String[] sarr = Arrays.stream(array).mapToObj(String::valueOf).toArray(String[]::new);
        System.out.println(String.join(",", sarr));
    }
}
