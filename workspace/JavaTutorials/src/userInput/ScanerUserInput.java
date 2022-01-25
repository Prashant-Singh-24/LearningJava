package userInput;
import java.util.Scanner;

public class ScanerUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Principle Amount");
		int principle = sc.nextInt();
		System.out.println("Enter the Rate");
		float rate = sc.nextFloat();
		System.out.println("Enter the Time Period");
		int time = sc.nextInt() ;
		float simpleIntrest = principle * time * rate / 100 ;
		
		System.out.println("Simple Intrest is " + simpleIntrest);

	}

}
