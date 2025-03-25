import java.util.ArrayList;
import java.util.List;

class Storage <T>{
    ArrayList<T> array;

    public Storage (){
        this.array = new ArrayList<>();
    }

    public void display(){
        for(T x: array){
            System.out.println(x);}
    }

    public void delete(int id){
        array.remove(id);
    }

    public void get(int id){
        System.out.println(array.get(id));
    }

    public void count(){
        System.out.println("Size " + array.size());

    }

    public void addItem(T item){
        array.add(item);
    }

    public void printItems(List<T> list){
        System.out.println(list);
    }


}

public class Main {
    public static void main(String[] args){
        Storage<Integer> si = new Storage();

        for(int i = 0 ; i<5; i++){
            si.addItem(i);
        }
        si.display();

        Storage<String> ss = new Storage();

        for(int i = 0 ; i<5; i++){
            ss.addItem("a" + i);
        }
        ss.display();

    }
}


