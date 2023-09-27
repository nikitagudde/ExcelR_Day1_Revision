package Switch;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter choice:");
		System.out.println("1.Area of circle");
		System.out.println("2.Area of rectangle");
		System.out.println("3.Area of Triangle");
		System.out.println("4.Area of square");
		System.out.println("5.Perimeter of circle");
		System.out.println("6.Perimeter of rectangle");
		System.out.println("7.Perimeter of Triangle");
		System.out.println("8.Perimeter of square");
		System.out.println("9.Default");

		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			double pi = 3.14, area;
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter the radius:");
			int r = sc1.nextInt();
			area = pi * r * r;
			System.out.println("Area of circle is: " + area);
			break;

		case 2:
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter the length:");
			int l = sc2.nextInt();

			System.out.println("Enter Breadth:");
			int b = sc2.nextInt();

			int a = l * b;
			System.out.println("Area of rectangle is:" + a);
			break;
			
		case 3:
			Scanner sc3=new Scanner(System.in);
			System.out.println("Enter base :");
			int b1=sc3.nextInt();
			
			System.out.println("Enter height:");
			int h=sc3.nextInt();
			
			float a2= (b1 *h)/2;
			System.out.println("Area of Triangle is:"+a2);
			break;

		case 4:
			Scanner sc4=new Scanner(System.in);
			System.out.println("Enter the side :");
			int s=sc4.nextInt();
			
			double a3=s*s;
			System.out.println("Area of square is:"+a3);
			break;
			
		case 5:
			Scanner sc5 = new Scanner(System.in);
			System.out.println("Enter the radius:");
			int r1 = sc5.nextInt();
			
			double pi1=3.14, peri;
			peri=2 * pi1* r1;
			System.out.println("Perimeter of circle is"+ peri);
			break;
			
		case 6:
			Scanner sc6 = new Scanner(System.in);
			System.out.println("Enter the length:");
			int l1 = sc6.nextInt();

			System.out.println("Enter Breadth:");
			int b2 = sc6.nextInt();

			int peri1 = 2*(l1 + b2);
			System.out.println("Perimeter of rectangle is:" + peri1);
			break;
			
		case 7:
			Scanner sc7=new Scanner(System.in);
			System.out.println("Enter first side of triangle:");
			int s1=sc7.nextInt();
			
			System.out.println("Enter second side of triangle: ");
			int s2=sc7.nextInt();
			
			System.out.println("Enter third side of triangle:");
			int s3=sc7.nextInt();
			
			double peri2= s1+s2+s3;
			System.out.println("Perimeter of Triangle is :"+peri2);
		    break;
		    
		case 8:
			Scanner sc8=new Scanner(System.in);
			System.out.println("Enter the side :");
			int side=sc8.nextInt();
			
			double perimeter=4*side;
			System.out.println("Perimeter of square is:"+perimeter);
			break;
			
		
			default:
				System.out.println("Invalid choice");
				
		}
	}
}