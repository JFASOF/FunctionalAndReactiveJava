package FunctionalProgrammingInDepth;

import java.util.Objects;

public class StudyPureFunction {
    public static void main(String[] args) {
        int result = add(1, 1);
        System.out.println(result);
        System.out.println(Math.min(result, 4));
        boolean isValid = isValid("valid");
        System.out.println(isValid);
    }
    //OOP pure function
    public static int add (int a ,int b){
        return a+b;
    }
    //pure function
    public static boolean isValid(String s){
        if(Objects.isNull(s))
            return false;
        return s.equalsIgnoreCase("VALID");
    }
}
