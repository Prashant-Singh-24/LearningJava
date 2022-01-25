	package circle1;

import java.util.Scanner;

class circle
	{
		public double radius;
		public double area() {
			return Math.PI*radius*radius; 
					}
		public double perimeter() { 
			return 2*Math.PI*radius; 
		}

		
	}
	
public class Circle1 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		
		circle c1 = new circle();	 
		c1.radius = 5;
		
		System.out.println("Area of circle is :" + c1.area());
		System.out.println("Perimeter of circle is : " + c1.perimeter()); 
		
		
	}

}
