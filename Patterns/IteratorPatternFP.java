package Patterns;

import java.util.function.Consumer;

/**
 * IteratorPatternFP
 */
public class IteratorPatternFP {

    public static void main(String[] args) {
        InnerIteratorPatternFP iPatternFP = new InnerIteratorPatternFP(new Object[] {1,5,7,8,8});
        iPatternFP.forEach(System.out :: println);
    }   
}

/**
 * InnerIteratorPatternFP
 */
class InnerIteratorPatternFP {

    Object[] elements = new Object[1];
    
    public InnerIteratorPatternFP(Object[] elements) {
        this.elements = elements;
    }

    public void forEach(Consumer<Object> action){
        for (Object object : elements) {
            action.accept(object);
        }
    }
}