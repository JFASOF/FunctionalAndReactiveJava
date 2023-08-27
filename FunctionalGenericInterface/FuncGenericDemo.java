package FunctionalGenericInterface;


/**
 * FuncGenericDemo
 */
public class FuncGenericDemo {

    public static void main(String[] args) {
        FuncGeneric<String,String> funcGeneric = s -> s.substring(1,5);
        System.out.println("funcGeneric.apply(\"Hello\") : " + funcGeneric.execute("Hello"));

        FuncGeneric<String,Integer> funcGeneric2 = s -> s.length();
        System.out.println(funcGeneric2.execute("Merhaba Dünya"));

        FuncGeneric<String,String[]> funcGeneric3 = s -> s.split(" ", 2);
        System.out.println(funcGeneric3.execute("Merhaba Dünya").toString());
    }
}