package LambdaAndFunctionalInterface01;

public class FirstLambda {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(
			  () ->  System.out.println("Thread executed"));
		t1.start();
		
		//Runnable

	}

}
