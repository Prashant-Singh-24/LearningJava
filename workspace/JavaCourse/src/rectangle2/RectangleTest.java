package rectangle2;

class rectangle{
	
	public int length;
	public int breadth;
	
	public int area() {
		return length*breadth;
	}
	public int perimeter() {
		return 2*(length+breadth);
	}
	public boolean isSquare() {
		return length == breadth;
	}
	 
}

public class RectangleTest { 

	public static void main(String[] args) {
		

		rectangle r = new rectangle();
		
		r.breadth = 45 ;
		r.length = 4;
		
		System.out.println("Area is " + r.area());
		System.out.println("Perimeter is : " + r.perimeter());
		System.out.println("Is Square :" + r.isSquare());
		
	}

}
