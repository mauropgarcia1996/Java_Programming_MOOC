package part3;

import java.util.ArrayList;

public class GreatestInList {
    public static void main(String[] args) {
        ArrayList<Integer> numberArray = new ArrayList<>();

        numberArray.add(1);
        numberArray.add(23);
        numberArray.add(123);
        numberArray.add(5);

        int greatest = numberArray.get(0);

        int smallest = numberArray.get(0);

        // If the INDEX is needed.

        // for (int i=0; i <= numberArray.size() - 1; i++) {
        //     int number = numberArray.get(i);
        //     if (number > greatest) {
        //         greatest = number;
        //     }
        //     if (number < smallest) {
        //         smallest = number;
        //     }
        // }

        // If INDEX IS NOT needed.

        for (Integer number: numberArray) {
            if (number > greatest) {
                greatest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
        }

        if (numberArray.contains(123)) {
            System.err.println(123 + " was found!");
        }

        System.out.println(greatest);
        System.out.println(smallest);
    }
}
