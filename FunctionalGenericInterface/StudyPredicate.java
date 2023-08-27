package FunctionalGenericInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.IntStream;



//PredicateInterface
public class StudyPredicate {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Merhaba");
        list.add("Dünya");
        list.add("Java");

        Predicate<String> predicate = x -> !x.isEmpty();
        Predicate<String> predicate2 = x -> Objects.nonNull(x);
        Predicate<String> predicate3 = x -> x.contains("Java");

        List<String> filterListDeclarative = filterListDeclarative(list, predicate2);
        List<String> filterListImperative = filterListImperative(list, predicate);
        List<String> filterListContains = filterListImperative(list, predicate3);

        System.out.println(filterListDeclarative);
        System.out.println(filterListImperative);
        System.out.println(filterListContains);

        List<Integer> intList = IntStream.rangeClosed(0, 10)
                .boxed()
                .toList();

        Predicate<Integer> isOdd = x -> !(x % 2 == 0);

        List<Integer> listOfOdds = genericFilterList(intList, isOdd);
        System.out.println(listOfOdds);

    }

    private static <T> List<T> genericFilterList(List<T> list, Predicate<T> predicate) {
        List<T> newList = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                newList.add(t);
            }
        }
        return newList;
    }

    // Imperative
    private static List<String> filterListImperative(List<String> list, Predicate<String> predicate) {
        List<String> filtList = new ArrayList<>();
        for (String string : list) {
            if (predicate.test(string)) {
                filtList.add(string);
            }
        }
        return filtList;
    }

    // Declarative
    private static List<String> filterListDeclarative(List<String> list, Predicate<String> predicate2) {
        return list.stream().filter(predicate2).toList();
    }

}
