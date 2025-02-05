package main;

import main.lemonadestand.LemonJuice;
import main.lemonadestand.Lemonade;
import main.lemonadestand.Sugar;
import main.lemonadestand.Water;

public class Main {

	public static void main(String[] args) {
		
		int x = 5;
		
		String hello = "hello World";
		
		LemonJuice lemonJuice = new LemonJuice(5, "ounces");
		Sugar sugar = new Sugar(12, "tsp");
		Water water = new Water(3, "cups");
		
		Lemonade lemonade = new Lemonade(lemonJuice, sugar, water);
		
		System.out.println(lemonade.getWater());
		
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
