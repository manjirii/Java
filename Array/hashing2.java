
/************************************************* HASHMAP ******************************************************/

//import java.util.HashMap;
import java.util.*;

public class hashing2 {

    public static void main(String[] args) {

        
        // Creating HashMap : country(key) , population(value)
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("Chaina", 150);

        // To Print map
        System.out.println(map);

        // When we reinsert a key with different value , it updates the value
        map.put("Chaina", 180);
        System.out.println(map);

        // Search / Lookup (does any key exist in map or not
        if (map.containsKey("Chaina")) {
            System.out.println("Key is present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }

        // To print the value of key
        System.out.println(map.get("Chaina")); // key exists
        System.out.println(map.get("Indonesia")); // key doesn't exists

        int arr[] = { 12, 15, 18 }; // Method 1 to print array
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int val : arr) { // Method 2 to print array
            System.out.print(val + " ");
        }
        System.out.println();

        // for (int val : arr)
        for (Map.Entry<String, Integer> e : map.entrySet()) { // 1st method entrySet
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet(); // 2nd method keySet
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        // To remove key value pair
        map.remove("Chaina");
        System.out.println(map);
    }
}
