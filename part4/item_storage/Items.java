package part4.item_storage;
import java.util.ArrayList;

public class Items {
    public static void main(String[] args) {
        String[] itemNames = {"Headphones", "Mouse", "Monitor"};
        ArrayList<Item> itemList = new ArrayList<>();

        for (String name: itemNames) {
            Item createdItem = new Item(name);
            itemList.add(createdItem);
        }

        for (Item item: itemList) {
            item.printDetails();
        }
    }
}
