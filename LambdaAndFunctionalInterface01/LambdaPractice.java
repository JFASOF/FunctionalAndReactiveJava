package LambdaAndFunctionalInterface01;

@FunctionalInterface
interface MathOperation{
    public void operation(int a,int b);
}

@FunctionalInterface
interface LengthOfString{
    public int lenOfString(String s);
}

public class LambdaPractice {
    public static void main(String[] args) {
            MathOperation add = (a,b) -> System.out.println(a+b);
            add.operation(10,20);
            MathOperation multiply = (a,b) -> System.out.println(a*b);
            multiply.operation(10, 20);
            LengthOfString lengthOfString = str -> str.length();
            System.out.println(lengthOfString.lenOfString("Merhaba Dünya"));;
    }

}
