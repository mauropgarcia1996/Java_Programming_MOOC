package part3;
import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameArray = new ArrayList<>();
        for (int i=0; i <= 3; i++) {
            System.out.println("Enter a name!");
            nameArray.add(scanner.nextLine());
        }
        System.out.println(nameArray.get(2));
    }
}
