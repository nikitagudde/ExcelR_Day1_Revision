package Conditional_Statments;

public class Leap_Year {
	public static void main(String [] args) {
		int year = 2020;
		if(year % 4 == 0 && year % 100 != 0|| year % 400 == 0) {
			System.out.println(year+"it is leap year");
			
		}
		else {
			System.out.println(year+"it is not  leap year");
			
		}
		
	}

}
