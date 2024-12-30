package Javaprogram;

import java.util.HashSet;

public class HashSetClearExample {
    public static void main(String[] args) {
        // Creating a HashSet and adding elements to it
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        set.add("Elderberry");

        // Displaying the HashSet before removing all elements
        System.out.println("HashSet before clearing: " + set);

        // Removing all elements using clear()
        set.clear();

        // Displaying the HashSet after removing all elements
        System.out.println("HashSet after clearing: " + set);
    }
}
/*OUTPUT:
 HashSet before clearing: [Apple, Cherry, Date, Elderberry, Banana]
HashSet after clearing: []
*/
