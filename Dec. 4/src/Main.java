import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	ArrayList<String> items = new ArrayList<String>();
	//Add 4 items to the list
        items.add("Awakened Draconium");
        items.add("Automatic Wither Killing Machine");
        items.add("A DSU filled with octuple compressed cobblestone");


        //print ot the list
        System.out.println(items);
        //add an item at index 1
        items.add(1, "YOUR SOUL");
        System.out.println(items);

        //Overwrite an item in the list
        String theReplacedItem = items.set(2, "Reinforced Watering Can");
        items.add(theReplacedItem);
        System.out.println(items);

        int num = items.indexOf("YOUR SOUL");

        System.out.println(items.remove(1));
        System.out.println(items.remove("Automatic Wither Killing Machine"));

        //Set the item in index 3 to a new item,
        //inserting the object returned at the end of the list
        items.add(items.set(0, "The Ultimate Furnace"));
    }
}
