package w3;

import java.util.HashMap;
import java.util.Set;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Red");
        hm.put(2, "Green");
        hm.put(3, "Black");
        hm.put(4, "White");
        hm.put(5, "Blue");
        System.out.println(hm);

//        6. Write a Java program to get a shallow copy of a HashMap instance.
        HashMap<Integer, String> hm2 = new HashMap<>();
        hm2 = (HashMap) hm.clone();
        System.out.println(hm2);

//      7. Write a Java program to test if a map contains a mapping for the specified key.
        if (hm.containsKey(4)) {
            System.out.println("4 : " + hm.get(4));
        } else {
            System.out.println("No");
        }

//        8. Write a Java program to test if a map contains a mapping for the specified value.

        if (hm.containsValue("Pink")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

//      9. Write a Java program to create a set view of the mappings contained in a map.
        Set set = hm.entrySet();
        System.out.println(set);

//        10. Write a Java program to get the value of a specified key in a map.
        System.out.println("Value for key 4: " + hm.get(4));


//        11. Write a Java program to get a set view of the keys contained in this map.
        System.out.println(hm.keySet());

//        12. Write a Java program to get a collection view of the values contained in this map.
        System.out.println(hm.values());


    }
}
