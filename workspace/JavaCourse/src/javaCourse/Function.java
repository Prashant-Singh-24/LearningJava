package javaCourse;

import java.util.Scanner;

public class Function {

	///////////////////// 
	
//	public static void printMyName(String name) {
//		System.out.println(name);
//	}
	
	/////////////////////
	
//	public static int printSum(int a , int b ) {
//		int sum = a + b ;
//		return sum ;
//		
//	}
	
	///////////////////////
	
//	public static int printMultiply(int a , int b ) {
//		int mul = a * b ;
//		return mul ; 
//		
//	}
	
	///////////////////////
	
	public static void printFactorial( int n ) {
		int factorial = 1 ;
		
		if (n < 0 ) {
			System.out.println("Invalid Number");
		}
//		using For Loop
		for(int i = n ; i >=1 ; i--) {
			factorial = factorial * i ;	
		}
		System.out.println(factorial);
		return ; 
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		String name = sc.next();
//		
//		printMyName(name);// calling function 
		
		
		///////////////////////////////////
		
		
//		System.out.println("Enter a ");
//		int a = sc.nextInt();
//		System.out.println("Enrter b ");
//		int b = sc.nextInt();
//		
//		int sum = printSum(a,b);
//		
//		System.out.println("The sum of 2 numbers is : " + sum);
		 
		///////////////////////////////////
		
		
//	    System.out.println("Enter a ");
//		int a = sc.nextInt();
//		System.out.println("Enrter b ");
//		int b = sc.nextInt();
//		
//		int mul = printMultiply(a,b);
//		System.out.println("The multiply is : " + mul);
		
		
		///////////////////////////////////
		
		int n = sc.nextInt();
		
		System.out.println(n);
		

	}

}
