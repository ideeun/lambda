package w3;

import java.util.TreeMap;

public class TreeMap1 {
    public static void main (String[] args){
        TreeMap< Integer, String > tm = new TreeMap<>();
        tm.put(10, "Red");
        tm.put(20, "Green");
        tm.put(40, "Black");
        tm.put(50, "White");
        tm.put(60, "Pink");

//        15. Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.

        System.out.println("Key: "+tm.higherEntry(30));
        System.out.println("Key: " + tm.headMap(30, true));

//      26. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
        System.out.println("Keys greater than or equal to 30: " + tm.ceilingKey(30));

//      25. Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.

        System.out.println("Keys greater than or equal to 20: " + tm.ceilingEntry(20));

//      24. Write a Java program to get a portion of a map whose keys are greater than a given key.
        System.out.println("Keys are greater than 20: " + tm.tailMap(20, false));

//      22.Write a Java program to get the portion of a map whose keys range from a given key to another key.
        System.out.println(tm.subMap(20, true, 50, true));

//      19. Write a Java program to remove and get a key-value mapping associated with the least key in a map.
        System.out.println("Value returned: " + tm.pollFirstEntry());


    }

    }
