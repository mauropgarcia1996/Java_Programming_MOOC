package part3;

import java.util.ArrayList;

public class IndexOutOfBoundsException {
    public static void main(String[] args) {
        ArrayList<Integer> numberArray = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {
            numberArray.add(1);
        }
        // Prints an error. 
        System.out.println(numberArray.get(8));
    }
}
