package w3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main (String[] args){
        TreeSet <String> ts = new TreeSet<>(Arrays.asList("Pink", "Red", "Green"));
        ts.add("Blue");

//        3. Write a Java program to add all the elements of a specified tree set to another tree set.
        TreeSet <String> ts2 = new TreeSet<>(ts);
        System.out.println(ts2);

//        4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
        Iterator iter = ts.descendingIterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

//        9. Write a Java program to find numbers less than 7 in a tree set.
        TreeSet <Integer> num = new TreeSet<Integer>(Arrays.asList(1,5,3,8,9,11,3,76));
        TreeSet <Integer>tn = new TreeSet<Integer>();

        tn = (TreeSet) num.headSet(7);
        System.out.println(tn);
//      10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.

        System.out.println("greater than or equal to 5 -> " + num.ceiling(5));
        System.out.println("greater than or equal to 12 -> " + num.ceiling(12));

//        11. Write a Java program to get the element in a tree set less than or equal to the given element.
        System.out.println("less than or equal to 4 -> " + num.floor(4));
        System.out.println("less than or equal to 12 -> " + num.floor(12));

//        14. Write a Java program to retrieve and remove the first element of a tree set.
//        15. Write a Java program to retrieve and remove the last element of a tree set.
//        16. Write a Java program to remove a given element from a tree set.
        System.out.println(num.pollFirst());
        System.out.println(num.pollLast());
        num.clear();
        System.out.println(num);



    }

    }
