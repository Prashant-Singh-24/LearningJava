package com.methods;
import java.util.Scanner;


public class PracticingMethods { 
	
//	static int  max(int x , int y ) {
//		
//		if(x>y)
//		{ 
//			x++; 
//			return x ;
//		}else {
//			return y ; 
//		}
//
//	}
	
//	static void update(int A[] , int index , int value) {
//		A[index] = value;
//	}
//	static void update2(int X , int value) {
//		
//		 X = value ;
//	}
//
	static void prime(int x) {
		 
	}
	
	
	public static void main(String[] args) {
//	
//		int a = 45 , b = 78 , c , x = 45;
//		c = max(a , b ) ;
//		System.out.println(c); 
//		System.out.println(x); 
	
//	int A[] = {24 , 61 , 45, 45};
//	update(A  , 2 , 78);
//	
//	for(int x : A ) {
//		System.out.println(x);  
//	}
//
//	int X = 23 ;
//	update2(X , 45);
//	System.out.println("Value of Premitive is " + X);
//	System.out.println("Passing a method " + X);
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		if((a+1)%2==0) { 
			System.out.println("Prime number");
		}else {
			System.out.println("Real number");
		}
		
	}

}
