package wk3;
// Claire Francis, September 18, 2025, Wk3Program1

import java.util.Scanner;

// Write a program that takes as user input two decimal numbers, x and y.
// You may assume they are positive numbers greater than 1.
// The program computes and displays the following quantities:  x+y   xy   x/y   x^y   and    log y (x).


public class Wk3Program1 {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		double x;
		double y;
		String s;
		
		
		System.out.print("Enter a random positive decimal greater than 1: ");
		x = userinput.nextDouble();
		s = userinput.nextLine();
		System.out.print("Enter a random positive decimal greater than 1: ");
		y = userinput.nextDouble();
		s = userinput.nextLine();
		
		System.out.format("Your two numbers added together equals %f\n", x + y);
		System.out.format("Your two numbers multiplied together equals %f\n", x * y);
		System.out.format("Your two numbers multiplied together equals %f\n", x / y);
		System.out.format("Your numbers logged equals %.6f\n", Math.log(x)/Math.log(y));


	}

}
