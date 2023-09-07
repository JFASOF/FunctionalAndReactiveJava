package OptionalForNullPointer;

import java.util.Optional;

public class OptionalCreation {
    public static void main(String[] args) {
        //Optional Value 16 Byts , An Object , Immutable
        String text = "Hello World";
        Optional<String> opt = Optional.of(text);
        System.out.println(opt.get());
        //nullpointer exception
        /*
        String nullString = null;
        Optional<String> opt2 = Optional.of(nullString);
        System.out.println(opt2.get());
        */
        //empty 
        //NoSuchElementException
        /*Optional<Integer> emOptional = Optional.empty();
        System.out.println(emOptional.get());
        */

        //nullable
        Optional<String> nullable = Optional.ofNullable(text);



    }
}
