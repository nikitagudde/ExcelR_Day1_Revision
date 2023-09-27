package Swapping;
import java.util.Scanner;

public class Swap_2_num_without_third_var {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = sc.nextInt();

		System.out.println("Enter second number:");
		int b = sc.nextInt();

		System.out.println("Before swapping numbers are::" + a + " " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swapping values are::" + a + " " + b);
	}
}