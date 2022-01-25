package com.apnacollege;
import java.util.Scanner;

public class LoopsInJava {

	public static void main(String[] args) {

		// For Loop
//		int num = 0 ;
//		num++;
//		for(int i = 0 ; i <= 10 ; i++ ) {
//			System.out.print(i + " ");	  		
//		}
		
		
		// While Loops
		
//		int i = 0 ;
//		i++;
//		while(i <= 10 ) {
//			System.out.println("Hello World");
//			i++;
//		}
		
		
		
		// Do While 
		
//		int i = 0 ;
//		  
//		do {
//			System.out.println(i);
//			i++;
//		}while(i <= 10);
		
		 int sum = 0 ; 
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N "); 
		int  n = sc.nextInt();
		 
		for(int i  = 1 ; i <= n ; i++) { 
			sum = sum + i ;
					} 
		System.out.println("Sum of first n natural number is " + sum); 
		
	}

}
