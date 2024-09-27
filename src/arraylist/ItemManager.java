package arraylist;

import java.util.ArrayList;

public class ItemManager {

    private ArrayList<String> items;

    public ItemManager() {
        items = new ArrayList<>();

    }

    public void displayItems() {
        System.out.println("Items in the list: " + items);
    }
    public void insertItem(String item) {
        items.add(item);
        System.out.println("Added " + item + " in the list");
    }
}
