package javaCourse;
import java.util.Scanner;

public class PracticeLoop {
	
	public static void main (String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
//		for(int i  = 1 ; i <= num ; i ++ ) {
//			
//			for(int j  = 1 ; j <= num ; j++) {
//				
//				System.out.print(" " + i);
//				
//			}
//			System.out.println(" "); 
//		}
		
//		int c = 0 ;
//		for(int i = 1 ; i <= num ; i ++ ) {
//			
//			for(int j = 1 ; j <= num ; j++) {
//				
////				int sum = i + j ;
//				 c++ ;
//				
//				System.out.print("  " + c );
//				
//			}
//			System.out.println(" ");
//		}
		
		int c = 0 ;
		
		
		for(int i = 1 ; i <= num   ; i++) {
			
			for(int j = 1 ; j <= num    ; j++) {
				 
				if(i+j>num) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");   
		}
		
		
		
	}

}
