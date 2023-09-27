package Conditional_Statments;
import java.util.Scanner;

public class Vowel_Constant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character:");
		char ch = sc.next().toLowerCase().charAt(0);

		if (ch >= 'a' && ch <= 'z') {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch + "is vowel");
			} else {
				System.out.println(ch + "is consonant");
			}
		} else {
			System.out.println("Invalid Input. ");
		}
	}
}
