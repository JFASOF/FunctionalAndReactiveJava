package FunctionalProgrammingInDepth;

import java.util.function.Consumer;
import java.util.function.Function;

public class Chaining {
    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println(s);
        Consumer<String> c2 = s -> System.out.println(s);

        //c1.accept("JVM");
        //c2.accept("JVM");

        Consumer<String> c3 = s -> {
            c1.accept("JVM");
            c2.accept("JVM");
        };

        c3.accept("JVM");
        Consumer<String> c4 = c1.andThen(c2);
        System.out.println(c4);

        Function<Integer,Integer> f1 = s -> s + 2;
        Function<Integer,Integer> f2 = s -> s * 2;

        Function<Integer,Integer> f3 = f1.andThen(f2);
        //invoke apply f1 and then result is passed invoke f2.
        System.out.println(f3.apply(10));


        
    }
}
