package FunctionalProgrammingInDepth.HighOrderFunctions;

public class HighOrderFunctions {
    public static void main(String[] args) {
        //createFactory produce math random then call configurator with mapping and return intvalue.
        Factory<Integer> creteFactory = creteFactory(()->Math.random() * 100, r -> r.intValue());
        Integer create = creteFactory.create();
        System.out.println(create);

        System.out.println(Math.random());
    }

    public static <T,R> Factory<R> creteFactory(Producer<T> producer , Configurator<T,R> configurator){
        return () -> {
            T product = producer.produce();
            return configurator.configure(product);
        };
    }
}
