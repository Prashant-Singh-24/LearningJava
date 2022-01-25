package javaCourse;
import java.util.*;
import java.util.Scanner;

public class Arrays {
	
	public static void main (String args[]) {
		
//		int [] marks = new int [3];
//		marks[0] = 45 ;
//		 marks[1] = 78 ;
//		 marks[2] = 98;
//		 System.out.println("Maths marks is " + marks[0]);
//		 System.out.println("English marks is "  + marks[1]);
//		 System.out.println("Physics marks is " + marks[2]);
		 
//		Scanner sc = new Scanner(System.in);
//		int size = sc.nextInt();
//		int number[] = new size[size]  
	
		
		int a[] = {45 , 21, 56 , 78 , 32};
		for(int i = 0 ; i < a.length ; i++ )
		{
			System.out.println(a[i]);
		}
		
		System.out.println("/////////////////////////");
		
		for(int  x : a) {
			System.out.println(x);
		}
		
		
	}

}
