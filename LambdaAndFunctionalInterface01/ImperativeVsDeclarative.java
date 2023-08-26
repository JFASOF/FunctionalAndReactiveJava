package LambdaAndFunctionalInterface01;

import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class ImperativeVsDeclarative {
    public static void main(String[] args) {
        // Imperative
        int sumOfEvensImp = 0;
        int sumOfEvensDec = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sumOfEvensImp += i;
            }
        }
        System.out.println(sumOfEvensImp);
        
        // Declarative or Functional
        
        sumOfEvensDec = IntStream.rangeClosed(0, 100)
        .filter(i -> i % 2 == 0)
        .reduce((x,y) -> x+y)
        .getAsInt();
        System.out.println(sumOfEvensDec);
        

        IntPredicate isEven = i -> i % 2 == 0 ;
        IntBinaryOperator intBinaryOperator = (x,y) -> x+y;

        var sumOfEvensDecForIns =  IntStream.rangeClosed(0, 100)
        .filter(isEven)
        .reduce(intBinaryOperator)
        .getAsInt();
        System.out.println(sumOfEvensDecForIns);

    }

}
