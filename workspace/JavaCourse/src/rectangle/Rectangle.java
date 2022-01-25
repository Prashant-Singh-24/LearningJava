package rectangle;

class rectangle{
	public int length ;
	public int breath;
	
	public  int area() {
		return length*breath;
			}
	public int perimeter(){
		return 2*(length+breath);
			}
	
}

public class Rectangle {

	public static void main(String[] args) {
		
		rectangle R1 = new rectangle() ;
		R1.breath = 12;
		R1.length = 45;
		
		System.out.println("The area of Rectangle is :" + R1.area());
		System.out.println("The perimeter of Rectangle is : " + R1.perimeter());
		
		

	}

}
