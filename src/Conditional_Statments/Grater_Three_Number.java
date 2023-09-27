package Conditional_Statments;

public class Grater_Three_Number {
	public static void main(String [] args) {
		int a=10,b=40,c=50;
		if(a>b && a>c) {
			System.out.println(a+"a is grater");
		}
		else if(b>a && a>c) {
			System.out.println(b+"b is grater");
			
		}
		else if(c>a && c>b) {
			System.out.println(c+"c is grater");
		}
		else {
			System.out.println("Inavlid");
		}
	}

}
