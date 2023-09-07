package OptionalForNullPointer;

import java.util.Optional;

public class OptionalUnwrap {
    public static void main(String[] args) {
        Integer val = 20 ;
        Optional<Integer> oInteger = Optional.of(val);
        Optional<Integer> emIntegerOptional = Optional.empty();
        //get
        System.out.println(oInteger.get());

        //isPresent
        Integer ternaryInt = oInteger.isPresent() ? oInteger.get() : 0;
        System.out.println(ternaryInt);

        //orElse
        Integer oInteger2 = emIntegerOptional.orElse(0);
        System.out.println(oInteger2);

        //orElseGet(supplier)
        Integer oInteger3 = emIntegerOptional.orElseGet(() -> 0);
        System.out.println(oInteger3);

        //orElseThrow(exceptionSupplier)
        //Integer oInteger4 = emIntegerOptional.orElseThrow(() -> new NullPointerException("Değer null olamaz"));
        //System.out.println(oInteger4);

        oInteger.ifPresentOrElse(x -> System.out.println("Value: " + x), () ->
        System.out.println("Not Present"));
}
}
