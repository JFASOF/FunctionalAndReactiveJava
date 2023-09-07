package FunctionalGenericInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

public class StudyUnaryOperator {

    public static void main(String[] args) {
        List<Integer> intList = IntStream.rangeClosed(0, 20)
                .boxed()
                .toList();

        UnaryOperator<Integer> iOperator = x -> x * 10;

        List<Integer> iList = multiImperative(intList, iOperator);
        List<Integer> iList2 = multiDeclarative(intList, iOperator);
        System.out.println(iList);
        System.out.println(iList2);

    }

    // Declarative
    private static <T> List<T> multiDeclarative(List<T> list, UnaryOperator<T> unaryOperator) {
        return list.stream().map(unaryOperator).toList();
    }

    // Imperative
    private static <T> List<T> multiImperative(List<T> list, UnaryOperator<T> unaryOperator) {

        List<T> newList = new ArrayList<>();
        for (T t : list) {
            T element = unaryOperator.apply(t);
            newList.add(element);
        }
        return newList;
    }
}
