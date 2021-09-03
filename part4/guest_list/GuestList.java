package part4.guest_list;
import java.util.Scanner;
import java.nio.file.Paths;

public class GuestList {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Paths.get("/home/maurogarcia/Personal/Java_Programming_MOOC/part4/guest_list/guests.txt"))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
    }
}
