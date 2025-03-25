import java.util.*;

public class AnonClass {
    public static void main(String[] args){
//

        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.push(10); ad.push(20); ad.push(30);
        System.out.println(ad);
        for (Integer i: ad){
            System.out.println(ad.pop());
        }

        ad.offer(1); ad.offer(3); ad.offer(5);
        System.out.println(ad);
        ad.addFirst(-1);
        ad.addLast(7);
        System.out.println(ad);


    }
}

interface User{
    void getUserInfo();
}

class Admin implements User{
    String name;
    String  lastName;

    public Admin(String n, String ln){
        name = n;
        lastName = ln;
    }
    @Override
    public void getUserInfo() {
        System.out.println("Name: "  + name
        +" Last Name: " + lastName);

    }
}

