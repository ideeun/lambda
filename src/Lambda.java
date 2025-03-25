import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

interface MathOperation {
    void operate(int a, int b);
}

public class Lambda  {
    public static void main(String[] args){
        MathOperation add = ((a, b) -> {
            System.out.println("Addition " + (a+b));
        });
        add.operate(4,4);

        MathOperation sub = ((a, b) -> {
            System.out.println("Subtraction " + (a-b));
        });
        sub.operate(7,9);

        MathOperation mul = ((a, b) -> {
            System.out.println("Multiplication " + a*b);
        });
        mul.operate(2,6);

        MathOperation div = ((a, b) -> {
            System.out.println("Division " + (double)a/b);
        });
        div.operate(9,4);


        System.out.println();

        List<Integer> oldNumbers = Arrays.asList(10, 15, 22, 33, 40, 55);
        Predicate<Integer> pr = n -> n%2 != 0;
        List<Integer> newNumbers = new ArrayList<>();
        oldNumbers.forEach( n -> {if(pr.test(n)){
            newNumbers.add(n);}
        });
        System.out.println(newNumbers);

        System.out.println();

        List<String> names = Arrays.asList("Alice", "Charlie","Bob" , "David");
        names.sort((a, b) -> b.compareTo(a));
        System.out.println(names);

        System.out.println();

        List<String> words = Arrays.asList("hello", "java", "lambda");
        Function<String,String> transform = str -> new StringBuilder(str.toUpperCase()).reverse().toString();
        words.forEach(word -> System.out.println(transform.apply(word)));

        System.out.println();

        List<String> cities = Arrays.asList("New York", "London", "Tokyo", "Berlin");
        Consumer<String> ct = c -> System.out.println(c);
        cities.forEach(c -> ct.accept(c));

        System.out.println();

        cities.forEach(System.out::println);

        System.out.println();

        BiFunction<Integer, Integer, Integer> max = (a, b) -> {
            if (a > b) return a; else return b;};
        System.out.println("Max: " + max.apply(5,3));
        BiFunction<Integer, Integer, Integer> min = (a, b) -> {
            if (a < b) return a; else return b;};
        System.out.println("Min: " + min.apply(5,3));



    }


}
