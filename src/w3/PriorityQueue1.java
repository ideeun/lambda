package w3;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main (String[] args){
        PriorityQueue <String> pq = new PriorityQueue<>(Arrays.asList("Red", "Blue"));
        pq.add("Pink");
        pq.add("Purple");
        System.out.println(pq);
        pq.offer("Black");
        System.out.println(pq);
//      6. Write a Java program to count the number of elements in a priority queue.
        System.out.println(pq.size());

//        7. Write a Java program to compare two priority queues.
        PriorityQueue <String> pq2 = new PriorityQueue<>(Arrays.asList("Red", "Blue", "White", "Orange"));
        for (String el : pq){
            if (pq2.contains(el)){
                System.out.println("Yes -> " + el);
            }
            else{
                System.out.println("No -> " + el);

            }
        }
//        8. Write a Java program to retrieve the first element of the priority queue.
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);



//        9. Write a Java program to retrieve and remove the first element.
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

//        10. Write a Java program to convert a priority queue to an array containing all its elements.
        String[] arr = new String[pq.size()];
        pq.toArray(arr);
        System.out.println(Arrays.toString(arr));

//     12. Write a Java program to change priorityQueue to maximum priority queue.
        PriorityQueue<Integer> pq3 = new PriorityQueue<>(10, Collections.reverseOrder());
        pq3.add(10);
        pq3.add(22);
        pq3.add(36);
        pq3.add(25);
        pq3.add(16);
        pq3.add(70);
        pq3.add(82);
        pq3.add(89);
        pq3.add(14);

        System.out.println(pq3);



    }


    }
