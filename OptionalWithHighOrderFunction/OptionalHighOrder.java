package OptionalWithHighOrderFunction;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalHighOrder {
    public static void main(String[] args) {
        Optional<String> optString = Optional.of("HighOrder");

        //map , reduce , filter , flatMap, high order funcs...

        // map (mapperFunction)
        String str = optString.map(x -> "HighOrderFunction").orElse("Empty");
        System.out.println(str);

        //filter (predicate)
        Optional<String> filterStr = optString.filter(x -> x.equalsIgnoreCase("filterString"));
        System.out.println(filterStr);

        //flatMap (mapperFunction)
        Optional<String> flatMapStr = optString.filter(x -> x.equalsIgnoreCase("flatMapString"));
        System.out.println(flatMapStr);

        //stream
        Stream<String> stream = optString.stream();
        Optional.empty().stream().forEach(System.out :: println);

    }
}
