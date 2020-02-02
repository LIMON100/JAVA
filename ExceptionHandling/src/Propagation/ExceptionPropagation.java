package Propagation;

public class ExceptionPropagation {

	public static void main(String[]args) {
		
		ExceptionPropagation obj = new ExceptionPropagation();
		obj.method1();
		System.out.println("ALL Method Complete..");
		
	}
	
	private void method3() {
		System.out.println("In method-3");
		int result = 10/0;
		System.out.println(result);
	}
	
	private void method2() {
		System.out.println("In method-2");
		method3();
	}
	
	private void method1() {
		try {
			method2();
		}
		catch(Exception e){
			System.out.println("Exception Caught"+e.getMessage());
		}
	}
	
}
