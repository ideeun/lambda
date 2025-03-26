package w3;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main (String[] args){
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1,4,6,8,9));
//        19. Write a Java program to remove and return the first element of a linked list.
        System.out.println(ll);
        int first = ll.pop();
        System.out.println(first);
        System.out.println(ll);

//        18. Write a Java program to copy a linked list to another linked list.
        LinkedList <Integer> ll2 = new LinkedList<>();
        ll2 = (LinkedList) ll.clone();
        System.out.println(ll2);

//        20. Write a Java program to retrieve, but not remove, the first element of a linked list.
        System.out.println(ll.getFirst());

//        26. Write a Java program to replace an element in a linked list.
        ll.set(2,100);
        System.out.println(ll);

//        25. Write a Java program to check if a linked list is empty or not.
        if(ll.isEmpty()){
            System.out.println("empty");
        }
        else{
            System.out.println("No empty");
        }

//        22. Write a Java program to check if a particular element exists in a linked list.
        if (ll.contains(8)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
