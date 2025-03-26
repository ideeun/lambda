package w3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList1 {
    public static void main (String[] args){
        ArrayList <String> arr1 = new ArrayList<>(Arrays.asList("red", "blue", "orange"));
        ArrayList <String> arr2 = new ArrayList<>(Arrays.asList("banana", "orange", "apple"));

        arr1.add("white");
//        21. Write a Java program to replace the second element of an ArrayList with the specified element.
        System.out.println(arr1);
        arr1.set(1,"pink");
        System.out.println(arr1);


//        14. Write a Java program that swaps two elements in an array list.
        Collections.swap(arr1, 0, 2);
        System.out.println("After swap: " + arr1);

//        15. Write a Java program to join two array lists.

        arr2.addAll(arr1);
        System.out.println("Join two array:" + arr2);

//        19. Write a Java program for trimming the capacity of an array list.
        ArrayList <String> arr3 = new ArrayList<>(3);
        arr3.add("car");
        arr3.add("hh");
        System.out.println(arr3);

        arr3.trimToSize();
        System.out.println("After trim: " + arr3);



//        20. Write a Java program to increase an array list size.

        arr3.ensureCapacity(6);
        arr3.add("cat");
        arr3.add("dog");
        System.out.println("After increase: " + arr3);

//        17. Write a Java program to empty an array list.
        arr3.clear();
        System.out.println("Afetr clear" + arr3);

    }
}
