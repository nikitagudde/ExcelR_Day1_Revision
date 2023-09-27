package Conditional_Statments;

import java.util.Scanner;

public class Addition_Without_Using_Plus_Opretaor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = sc.nextInt();

		System.out.println("Enter second number:");
		int b = sc.nextInt();

		int sum;
		while (b != 0) {
			int c = a & b;
			a = a ^ b;
			b = c << 1;
		}
		System.out.println("sum is :" + a );

	}
}