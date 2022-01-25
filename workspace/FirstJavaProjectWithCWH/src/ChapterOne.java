import java.util.Scanner;

class ChapterOne {

	public static void main(String[] args) {
		
//		int marks = 18;
//		float avgMarks = 19.22f;
//		char grade = 'A';
//
//		boolean isValid = false;
//		long bigNumber = 965135431l;
//
//		System.out.println(avgMarks);
//		
//		int firstNumber = 1234;
//	int secNumber =  234;
//	 
//	    double div =	(double)firstNumber / (double)secNumber;		
//	    System.out.println(div);

		
//		int a = 12 ;
//		System.out.println(a++);
//		
//		a--;
//		System.out.println(a);
		
//		Taking user input !
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your age: ");
//		int age = sc.nextInt();
//		
//		System.out.println(2 * age);
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your name : ");
//		String name = sc.nextLine();
//		
//		System.out.println(name);
		
		
		// Conditional Statement 
		

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your age: ");
//		int age = sc.nextInt();
//		
//		System.out.println(age);
//		
//		if(age > 18) {
//			System.out.println("You can drive");
//		}
		
//		boolean isEqual = 18 ==18;
//		System.out.println(18>654);
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your grade between A-E => ");
//     	String grade = sc.nextLine();
//		
//		if(grade == 'A') {
//			System.out.println("Wha bete Mauj Kardi");
//			
//		}
//		else if (grade == 'B') {
//			System.out.println("Papa bhut marenge");
//		}
//		else if (grade == 'C') {
//			System.out.println("Kiya padhai karega re tu !");
//		}else if(grade == 'D') {
//			System.out.println("Padhte rho");
//		}
//		else {
//			System.out.println("Padhai chor do beta tumse nhi ho payega");
//		}
	
     	
     	// switch case
		
//		char grade ='A';
//		switch(grade) {
//		case 'A':
//			System.out.println("Wha bete mauj kardi");
//			break;	
//		case 'B':
//			System.out.println("Papa bhut marenge ");
//			break;
//		case 'C':
//		System.out.println("Kiya padhai karegare tu !");
//		break;
//		case 'D':
//			System.out.println("Padhte rho !");
//			break;
		
			
//		}
//		
//	   int age = 12;
//	   if(age > 18 && age < 50) {
//			System.out.println("You can drive");
//		}else {
//			System.out.println("You can not drive !");
//		}
	   
	   
		
//		LOOPS IMPOPRTANT !
		
		// For Loops
		
//		for(int i=0; i<10 ; i++) {
//			System.out.println("Prashant" + i);
//		
//		}
//		
//	   int a = 23;
//		while(true) {
//			System.out.println(a);
//			a++;
//			if(a>100) {
//				break;
//			}
			
//		}
//		int a = 23;
//		
//		do {
//			System.out.println(a);
//			a++;
//		}while(a<=100);
//		
//	
       // Array 
		// 24 , 23, 56, 54, 94
		
//		int marks[] = new int[5];
//		marks[0] = 24;
//		marks[1] = 23;
//		marks[2] = 56;
//		marks[3] = 54;
//		marks[4] = 94;
		
//		int marks[] = {23 ,23,54,56,86,41,86,21};
//		
//		
//		for(int i= 0 ; i<marks.length; i++  ) {
//			System.out.println(marks[i]);
//		}
		
//		int a[][] = {{12,12},{45,56}};
//		System.out.println(a[1][1]);
		
//		average(3,1);
		
		
		
//		//Method

		// returType functionName (argument){}
		
		System.out.println(average(3,5));
			
		
	}
		
	 int average(int firstNumber ,int  secondNumber) {
			int sum = firstNumber + secondNumber ;
			return sum/2;
			
			
	 }

}
