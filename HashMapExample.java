package Javaprogram;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap with Integer as the key and String as the value
        HashMap<Integer, String> map = new HashMap<>();

        // Adding elements to the HashMap
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");
        map.put(5, "Elderberry");

        // Printing the HashMap
        System.out.println("HashMap Elements:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + " - Value: " + map.get(key));
        }

        // Checking if a specific key exists
        if (map.containsKey(3)) {
            System.out.println("\nKey 3 is present in the HashMap with value: " + map.get(3));
        } else {
            System.out.println("\nKey 3 is not present in the HashMap.");
        }
    }
}
/*OUTPUT:
 HashMap Elements:
Key: 1 - Value: Apple
Key: 2 - Value: Banana
Key: 3 - Value: Cherry
Key: 4 - Value: Date
Key: 5 - Value: Elderberry

Key 3 is present in the HashMap with value: Cherry
*/
