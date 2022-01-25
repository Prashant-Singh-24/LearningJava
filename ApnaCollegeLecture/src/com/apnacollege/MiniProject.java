package com.apnacollege;
import java.util.Scanner;

public class MiniProject {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int myNumber = (int)(Math.random()*100);
		
		int userNumber = 0 ;
		
		do {
			
			System.out.println("Guess my number : ");
			
			 userNumber = sc.nextInt();
			
			if(userNumber == myNumber);
			System.out.println("YOU GOT THE NUMBER CONGO !");
			break;
			else if (userNumber < myNumber ) {
				System.out.println("The number is bigger then your number !");
			}
			else  {
				System.out.println("The number is smaller then your number !");
				
			}
		}

	}

}
