package main;

public class Main {

	public static void main(String[] args) {
		
		// Invoking the add method with 2 arguments.
		System.out.println(add(1, 5));
		
		System.out.println(concat("Hello ", "World!"));
		
		System.out.println(divide(6, 0));
		
	}// end main.
	
	// Add Method with 2 parameters.
	public static int add(int a, int b) {
		return a + b;
	}
	
	// Concat Method.
	public static String concat(String a, String b) {
		return a + b;
	}
	
	/**
	 * Divides two numbers and returns the result.
	 * @param a - the number to divide
	 * @param b - the number to divide by
	 * @return -  the result of dividing a by b
	 * @throws IllegalException - if b equals 0
	 */
	public static int divide(int a, int b) throws IllegalArgumentException {
		if(b == 0) {
			throw new IllegalArgumentException();
		}
		return a / b;
	}

}// end class Main.
