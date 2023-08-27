package FunctionalGenericInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Function;

//FunctionInterface
public class StudyFunction {
    public static void main(String[] args) {
        // Function<T,R>
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int indexLimit = scanner.nextInt();

        Function<String, Integer> fnc = x -> x.length();

        List<String> listOfStrings = generateString(indexLimit);
        List<Integer> newList = mapLength(listOfStrings, fnc);
        List<Integer> newList2 = mapLength2(listOfStrings, fnc);

        System.out.println(newList);
        System.out.println(newList2);
    }

    // Declarative
    private static <T, R> List<R> mapLength(List<T> listOfStrings, Function<T, R> fnc) {
        return listOfStrings.stream().map(fnc).toList();
    }

    // Imperative
    private static <T, R> List<R> mapLength2(List<T> listOfStrings, Function<T, R> fnc) {
        List<R> result = new ArrayList<>();
        for (T t : listOfStrings) {
            result.add(fnc.apply(t));
        }
        return result;
    }

    private static List<String> generateString(int indexLimit) {
        List<String> lStrings = new ArrayList<>();
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        // int targetStringLength = 10;
        Random random = new Random();
        // int randomtargetStringLength = random.nextInt(2, 6);

        while (indexLimit > 0) {
            String generateString = random.ints(leftLimit, rightLimit + 1)
                    .limit(random.nextInt(2, 6))
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();

            lStrings.add(generateString);
            indexLimit--;
        }
        return lStrings;
    }
}
