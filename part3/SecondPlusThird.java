package part3;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberArray = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {
            System.out.println("Enter a number!");
            numberArray.add(Integer.valueOf(scanner.nextLine()));
        }
        System.out.println("Second + Third: " + (numberArray.get(1) + numberArray.get(2)));
        
        // Logs Array size.
        System.out.println("List Size: " + numberArray.size());
    }
}