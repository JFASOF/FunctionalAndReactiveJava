package FunctionalGenericInterface;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;

//ConsumerInterface
public class StudyConsumer {
    public static void main(String[] args) {
        List<Integer> intList = IntStream.rangeClosed(0, 20)
                .boxed()
                .toList();

        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(12);
        //Imperative
        printList(intList, consumer);
        System.out.println("---------------------------------------");
        
        //Declarative
        List<Integer> intList2 = IntStream.rangeClosed(20, 30)
                .boxed()
                .toList();

        intList2.forEach(consumer);
    }

    private static <T> void printList(List<T> intList, Consumer<T> consumer) {
        for (T t : intList) {
            consumer.accept(t);
        }
    }
}
