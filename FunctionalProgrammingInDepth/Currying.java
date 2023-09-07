package FunctionalProgrammingInDepth;

public class Currying {
    public static void main(String[] args) {
        Function<Integer,Function<Integer,Integer>> fun1 = u -> {
            return v -> u + v;
        };

        //fun one after then other.
        Integer apply = fun1.apply(1).apply(2);
        
        System.out.println(apply);

        Function<Integer,Integer> fun2 = fun1.apply(1);

        Integer sum = fun2.apply(2);
        System.out.println(sum);
    }
}
