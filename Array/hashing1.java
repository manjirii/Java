/********************************************** HASHSET **********************************************************/

import java.util.HashSet;
import java.util.Iterator;

public class hashing1 {

    public static void main(String[] args) {

        // Creating
        HashSet<Integer> set = new HashSet<>();

        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // Search - contains
        if (set.contains(1)) {
            System.out.println("set contains 1");
        }

        if (!set.contains(6)) {
            System.out.println("does not contain");
        }

        // Delete
        set.remove(1);
        if (!set.contains(1)) { // to check whether 1 is deleted or not
            System.out.println("does not contain 1 - we deleted 1");
        }

        set.add(1);

        // Size
        System.out.println("Size of set is : " + set.size());

        // Print all elements
        System.out.println(set);

        // Iterator
        Iterator it = set.iterator();

        // Two special functions of iterator : hasNext(); & next();

        while (it.hasNext()) { // iterate until it has true value of hasNext();
            System.out.println(it.next());
        }

        // isEmpty();

        if (!set.isEmpty()) {
            System.out.println("Set is not empty");
        }
    }
}