package javaCourse;

import java.util.Scanner;
import java.util.Arrays;

public class Basics {

	public static void main(String[] args) {
		// Output
		
		
//		System.out.println("Hello World");
//		
//		 System.out.println("hello world ");
//		 
//		 System.out.println("*\n**\n***\n****");
		
		// Variable
		
//		int a = 45 ;
//		int b = 54 ;
//		int sum = a + b ;
//		int diff = b - a ;
//		System.out.println(sum);
//		System.out.println(diff); 
		
		// Input
//		Scanner sc = new Scanner(System.in);
////		String name = sc.nextLine();
////		System.out.println(name);
//		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int sum = a + b ;
//		System.out.println("The sum is :" + sum);
		
		// Conditional Statement
		
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your age :");
//		int age = sc.nextInt();
//		
//		if(age > 18 ) {
//			System.out.println("You are above 18 so you can drive");
//		}
//		else {
//			System.out.println("Gaddi nhi milegi");
//		}

//		System.out.println("Enter your number :");
//		int num = sc.nextInt();
//		
//		if( num % 2 == 0 ) {
//			System.out.println("Your number is an even number");
//		}else {
//			System.out.println("Your number is an odd number ");
//		}
		
//		System.out.println("Enter the value of A");
//		int A = sc.nextInt();
//		System.out.println("Enter the value of B");
//		int B = sc.nextInt();
//		
//		if (A==B){
//			System.out.println("Equal");
//		}
//		else {
//			if(A>B) {
//				System.out.println("A greater than B");
//			}
//			else {
//				if (A<B) {
//					System.out.println("A is less then B");
//				}
//			}
//				
//		}
		
//		System.out.println("Enter a number between 1 to 3");
//		int num = sc.nextInt();
//		
//		switch(num){
//		case 1 :
//			System.out.println("Hello");
//			break;
//		case 2 :
//			System.out.println("Namaste");
//			break;
//			
//		case 3 : 
//			System.out.println("Jule Jule");
//			break;
//			default :
//				System.out.println("Invalid Number");
//		}
		
		// Loops
		
//		for(int Counter = 0 ; Counter <=5 ; Counter++) {
//			System.out.println("Hello World");
//		}
//		
		
//		for ( int i = 0 ; i < 11 ; i++ ) {
//			System.out.println(i);
//		} 
		
//	 int i =  0 ;
//	 while(i < 11 ){
//		 System.out.println(i);
//		 i++;
//		 	 }
		
//		int i =  0 ;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i<11);
		
//		System.out.println("Enter the number:");
//		int num = sc.nextInt();
//		int sum = 0;
//		for (int i = 1 ; i <= num ; i++) {
//			sum = sum + i ;
//		}
//		System.out.println(sum);
		
//		System.out.println("Enter the number for which you want to print the table");
//		int n = sc.nextInt();
//		for (int i = 0 ; i < 11 ; i++) {
//			System.out.println(n*i); 
//		}
		
//		System.out.println("Enter your number: ");
//		int num = sc.nextInt();
//		for ( int i = 0 ; i <= num ; i ++) {
//			num = (num + 1)/2 ;
//		}
//		System.out.println(num); 
		
		// Parttern in Java (Nested loops)
		
		
		//Qn.1 print solid rectangle
		
//		 for ( int i = 1 ; i <= 4 ; i++) {
//			for (int j=1 ; j <= 5 ; j++ ) {
//				System.out.print("*");
//			}
//			System.out.println("*");
//		}
		
		// Qn.2 print hollow rectangle
		
//		int n = 4 ;
//		int m = 5 ;
//		
//		for (int i = 1 ; i<=n ; i++) {
//			for (int j = 1 ; j <= m ; j++) {
//				if(i == 1 || i== n || j==1 || j==m) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println(""); 
//		}
		
		// Qn 3. half pyramid 
		
//		int n = 4 ;
//		
//		
//		for(int i = n ; i >= 1 ; i--) {
//			for(int j = 1 ; j <= i ; j++) {
//				System.out.print("*");
//				} 
//				System.out.println(""); 
//			}
		
		// Qn.4 rotated half pyramid 
		
//		int n = 4 ;
//		
//		for(int i = 1 ; i<=n ; i ++ ) {
//			// inner loop
//			for(int j = 1 ; j <= n - i ; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1 ; j <= i ; j++ ) {
//				System.out.print("*");
//			}
//			System.out.println("");  
//		}
		
		// Qn.5 print number pattern
		
		System.out.println("Enter your number :");
		
		
		int m = sc.nextInt();
		
		for (int  i = 1 ; i <= m ; i++) {
		   for( int j = 1 ; j <= i ; j++) {
			   System.out.print (j + " ");
		   }
		   System.out.println(""); 
		} 
		
//int m = 5 ;
//		
//		for (int  i = 1 ; i <= m ; i++) {
//		   for( int j = 1 ; j <= m-i+1 ; j++) { 
//			   System.out.print (j + " "); 
//		   }
//		   System.out.println("");
//		} 
		
		// Qn.6 Floyd's Triangle
		
//		int n = 5 ; 
//		int num = 0 ;
//		
//		for (int i = 1 ; i <= n ; i ++ ) {
//			// inner loop
//			for (int j = 1 ; j <= i ; j++) {
//				num++;
//				System.out.print(num + " ");
//			}
//			System.out.println();
//		}

		// Qn.7 print 0-1 triangle
//		
//		int n =  5 ;
//		
//		for (int i  = 0 ; i <= n ; i++) {
//			// inner loop
//			for(int j = 0 ; j <= i ; j++) {
//				if( (i+j)%2 == 0 ) {
//					System.out.print("1 ");
//				}else {
//					System.out.print("0 ");
//				}
//			}
//			System.out.println(); 
//		}
		
	// Qn. 10 Butterfly Pattern
		
//		System.out.println("Enter the  value of n ");
//		int n = sc.nextInt();
//		
//		for( int i = 1 ; i <= n ; i++) {
//			for( int j = 1 ; j <= i ; j++ ) {
//				System.out.print("*");
//			}
//			
//			for(int j = 1 ; j <= 2*(n-i) ; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 1 ; j <= i ; j++) {
//				System.out.print("*"); 
//			}
//			System.out.println();
//		}
//		
//		
//		
//		
//		for( int i = n ; i >= 1 ; i--) {
//			for( int j = 1 ; j <= i ; j++ ) {
//				System.out.print("*");
//			}
//			
//			for(int j = 1 ; j <= 2*(n-i) ; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 1 ; j <= i ; j++) {
//				System.out.print("*"); 
//			}
//			System.out.println();
//		}
		
		
		// Qn 10 solid Rhombus
		
//		int n = 5 ; 
//		
//		for(int i = 1 ; i <= n ; i ++) {
//			for (int  j = 1 ; j <= n-i ; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 1 ; j <= n ; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		// Qn. number pyramid 
		
//		int n = 5 ; 
//		for( int i = 1 ; i <= n ; i ++) {
//			for ( int j = 1 ; j<= n-i ; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 1 ; j <=i ; j++) {
//				System.out.print(i + " ");
//			}
//			System.out.println("");
//		}
		
		// Palinddrom numbers
		
//		int n = 5 ;
//		
//		for ( int i = 1 ; i <= n ; i++) {
//			for(int j = 1 ; j <= n - i ; j++){
//				System.out.print(" ");
//			}
//			for(int j = i ; j >= 1 ; j --) {
//				System.out.print(j);
//			}
//			for (int j = 2 ; j<=i ; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//			
//		}
		
		//  Qn. Diamond Pattern
//		int n = 4 ;
//		
//		for( int i = 1 ; i <= n ; i++) {
//			for(int j = 1 ; j <= n - i ; j++) {
//				System.out.print(" ");
//			}
//			for( int j = 1 ; j <= 2*i-1 ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		 
//		for( int i = n ; i >= 1 ; i--) {
//			for(int j = 1 ; j <= n - i ; j++) {
//				System.out.print(" ");
//			}
//			for( int j = 1 ; j <= 2*i-1 ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		int [] marks = new int[3];
		
		marks[0] = 54;
		marks[1] = 78;
		marks[3] = 98;
		System.out.println("maths marks " + marks[0]);
		System.out.println("physics marks " + marks[1]);
		System.out.println("English marks " + marks[2]);
		  
		 
		
		
	} 
	

}
