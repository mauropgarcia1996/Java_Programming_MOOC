package part4.item_storage;
import java.util.Date;

public class Item {
    private String name;
    private Date createdAt;

    public Item(String name) {
        this.name = name;
        this.createdAt = new Date();
    }

    public void printDetails() {
        System.out.println(this.name + " created at: " + this.createdAt);
    }
}
