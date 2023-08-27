package FunctionalGenericInterface;

import java.util.function.Supplier;

//SupplierInterface
public class StudySupplier {

    public static void main(String[] args) {
        Supplier<String> strSupplier = () -> new String("Merhaba Dünya");
        System.out.println(strSupplier.get());

        Supplier<Double> doSupplier = () -> Math.random();
        System.out.println(doSupplier.get());

    }
}
