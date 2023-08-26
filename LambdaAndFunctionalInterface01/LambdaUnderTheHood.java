package LambdaAndFunctionalInterface01;

/**
 * LambdaUnderTheHood
 */
public class LambdaUnderTheHood {
    public static void main(String[] args) {
    
    FuncInterfaceEx funcInterfaceEx1 =  new FuncInterfaceEx() {

        @Override
        public void myMethod() {
            // TODO Auto-generated method stub
            System.out.println("Implemantation 1");
        }
        
    }; 

    FuncInterfaceEx funcInterfaceEx2 = new FuncInterfaceEx() {

        @Override
        public void myMethod() {
            // TODO Auto-generated method stub
            System.out.println("Implementation 2");
        }
        
    };
    //Lambdas -> Type Inference and InvokeDynamic
    FuncInterfaceEx funcInterfaceEx = () -> System.out.println("InvokeDynamic");
}
    
}