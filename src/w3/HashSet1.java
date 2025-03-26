package w3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSet1 {
    public static void main (String[] args){
        HashSet<String> hs1 = new HashSet<String>(Arrays.asList("red", "blue", "orange"));
        hs1.add("pink");
        HashSet<String> hs2 = new HashSet<String>(Arrays.asList("red", "purple", "orange"));

//      10. Write a Java program to compare two hash set.
        for (String el : hs1){
            if (hs2.contains(el)){
                System.out.println("Yes -> " + el);
            }
            else{
                System.out.println("No -> " + el);

            }
        }

//        11. Write a Java program to compare two sets and retain elements that are the same.
        hs1.retainAll(hs2);
        System.out.println(hs1);

//        8. Write a Java program to convert a hash set to a tree set.
        TreeSet<String> ts = new TreeSet<>(hs2);
        System.out.println(ts);

//        7. Write a Java program to convert a hash set to an array.
        String[] arr = new String[hs2.size()];
        hs2.toArray(arr);
        System.out.println(Arrays.toString(arr));

//        2. Write a Java program to iterate through all elements in a hash list.
        Iterator iter = hs1.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

//      12. Write a Java program to remove all elements from a hash set.
        hs1.clear();
        System.out.println(hs1);






    }

    }
