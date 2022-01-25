package com.apnacollege;

import java.util.Arrays;


import java.util.Scanner;

public class Main {
	
	public static void printName(String name) {
		
		System.out.println(name);
	}
	
	public static void printSum(int a , int b) {
		int sum = a + b ;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
//	
//		byte - 1 [ -128 to 1227 ]
//	    short - 2 bit
//	    int - 4 bit 
//	    long - 8 bit 
//	    float - 4 bit ==> 3.14
//	    double - 8 bit 
//	    char - 2 bit   a,s,d,f
//	    boolean - 1 true/false 
//	    
//		byte age = 30;
//		long phone = 3546313543l ;
//		float pi = 3.14f ;
////		char letter = "@";
//		boolean isAdult = true;
//		
//		
//		// NoN-Primitive type
//		
//		String name = "Prashant";
//		System.out.println(name.length());
		
		// STRING 
		//CONCATENATE
		
     	String name1 = "Prashnt";
		String name2 = "Pallavi";
		String name3 = name1 +" " +  name2;
		System.out.println(name3);
		
		// CharAt
		
//		String name = "Prashant";
//		System.out.println(name.charAt(7));
		
		// Length
		
//		String name = "Prashant";
//		System.out.println(name.length());
		
        // replace
		
//		String name = "Prashant";
//		String name2 = name.replace('a', 'b');
//		System.out.println(name2);
//		System.out.println(name);
		
		// SubStrings
		
//		String name = "Mera nam Prashant hai";
//		System.out.println(name.substring(0,4));
//		
		
       // Arrays
		
//		int[] marks = new int[3];
//		
//		marks[0] = 95;
//		marks[1] = 93;
//		marks[2] = 97;
//		System.out.println(marks[0]);
//		
//		//sort
//		
//		Arrays.sort(marks);
//		System.out.println(marks[0]);
//		

		
//		int[] marks = {98,56,65};
		
		
		
		// Very Important 
		
//		int[][] finalMarks = {{96,51,56},{51,54,78}};
//		
//		System.out.println(finalMarks[0][2]);
		
		// Casting 
		
//		double price = 100.00;
//		double finalPrice = price + 18 ;
//		System.out.println(finalPrice);
//
//		int p = 3154;
//		int fp = p + (int)2163.65;
//		System.out.println("fp");
		
		// CONSTANT
		
		//Important and Easy 
		
//		float PI = 3.14; 
		
	/*	final float PI = 3.14F;
		System.out.println(PI); */
		
		// OPERATors
//		
//		int a = 1;
//		int b = 2;
//		float div = a % b ;
//		System.out.println(div);
//		
		
//		int numb = 21 ;
////		numb++;
//		System.out.println(numb++);
//		System.out.println(numb);
		
		// Maths 
		
		
//		System.out.println(Math.min(21,32));
//		System.out.println((int)(Math.random()*100));
		
		// How to take input !
		
		// very very IMPORTANT
//		
//		Scanner sc = new Scanner(System.in);
//	
//		System.out.println("What is your name : ");
//		
//		String name = sc.nextLine();
//		
//		System.out.println(name);

		
		// COMPARISION OPERATORS
		
		// a==b
		// a!=b
		// a>b
		// a<b
		// a<=b
		// a>=b
		
		// Conditional Statement 
		
//		boolean isSunUp = false;
//		if(isSunUp == true)
//			System.out.println("Day");
//		else
//			System.out.println("Night");
		
//		int age = 35;
//		if(age>18)
//			System.out.println("Can Vote");
//		else
//			System.out.println("Can't Vote");
//		
		
		
		//logical Operators 
		
		// &&
		
//		int a = 54;
//		int b = 78;
//		
//		if(a < 100 && b < 100)
//			System.out.println("Both less then 100");
//		
//		if (a > 50 || b < 70)
//			System.out.println("YE BADIYA THA GURU");
		
		//Logical Operators
		
//		boolean isAdult = false;
//		if(!isAdult)
//			System.out.println("Is Adult");
//		else 
//			System.out.println("Is not Adult");
		
		
		// CONDITIONAL OPERATOR 
		
//		Scanner sc  = new Scanner(System.in);
//		
//		// pen = 10 ; notebook = 40;
//		
//		System.out.println("Enter the amount that you have :");
//		
//		int cash = sc.nextInt();
//		
//		if (cash < 10) {
//			
//			System.out.println("You can not buy anything ");
//			System.out.println("Get some more cash !");
//		}
//		else if(cash<10 && cash < 50) {
//			System.out.println("You can only buy one thing ");
//			
//		}
//		else {
//			System.out.println("You can buy both ! ");
//		}
		
//		System.out.println("The world is mine !");
		
		
		// SWITCH 
		
//		System.out.println("Enter the case :");
//		Scanner sc = new Scanner(System.in);
//		int day = sc.nextInt();
//		
//		
//		switch(day) {
//		case 1 : 
//			System.out.println("Monday");
//			break;
//		case 2 : 
//			System.out.println("Tuesday");
//			break;
//		case 3 : 
//			System.out.println("Wednesday");
//			break;
//		default : 
//			System.out.println("Thusday - Sunday");
			
		
		
		// LOOPS
		
		

//		for(int i = 100 ; i >= 1 ; i--){
//			System.out.println(i);
//		}
		
		// While loops
		
//		int i = 100;
//		while( i >= 1) {
//			System.out.println(i);
//			i--;
//		}
		
		
		// DO WHILE
		
//		int k = 100;
//		do {
//			System.out.println(k);
//		}while(k>=1);
		
		
		
		// IMPORTANT TOPIC 
//		Scanner sc = new Scanner(System.in);
//		
//		int number = 0 ;
//		
//		
//		do {
//			System.out.println("Input a number :");
//			number = sc.nextInt();
//			System.out.println("Here is your number :");
//			System.out.println(number);
//		}while(number >= 0);
//		
//		System.out.println("The End");
		
		// BREAK AND CONTINUE
		
//		int i = 0;
//		while(true) {
//			if(i==3) {
//				i = i++;
//				continue;
//			}
//			System.out.println(i);
//			i = i++;
//			if(i>5) {
//				break;
//			}
//		}
		
		// TRY - CATCH in Exception Handling
		
//		int[] marks = {46, 45, 51};
//		try {
//		System.out.println(marks[5]);
//		
//		}catch(Exception exception) {
//			// Do something after catching !
//			System.out.println("LALALA");
//		}
//		System.out.println("My name is Prashant");
		
	
		// METHODS
	
//		printName("Prashant");
//		printName("lala");
//		printName("Babu");
//		
//		printSum(1 , 3 );
		
		// MINI PROJECT
		
		
//		IT IS IN THE NEW PACKAGE 
		
		class Vet<Animal> {
			public void giveShot(Animal a) { 
			// do horrible things to the Animal at
			// the other end of the ‘a’ parameter
			((Object) a).makeNoise();
			}
			}
			class PetOwner {
			public void start() {
			Vet v = new Vet();
			Dog d = new Dog();
			Hippo h = new Hippo();
			v.giveShot(d);
			v.giveShot(h);
			}
			}
	}

}
