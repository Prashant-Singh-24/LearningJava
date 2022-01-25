package basics;

import basics.Person.Developer;

public class MainClass {

	public static void main(String[] args) {
		
//		Person p1 = new Person(0, null);
//		p1.age = 24;
//		p1.name = "Prashant";
		
		Person p2 = new Person(45, "Babu");
//		p2.age = 34;
//		p2.name =  "LALA";
		
				
				
//	    System.out.println(p1.age + "  " + p1.name );
//	    System.out.println(p2.age + "  " + p2.name );
//	     
//        p1.walk();
//	    p1.walk(4);
//	    p2.talk(); 
//	    
//	    System.out.println(Person.count);
		Developer d1 = new Developer(24 , "Prashant");
		d1.walk();
		
	}

}


class Person{
	
	String name;
	int age;
	
	static int count;
	
	
	// METHODS =>
//	public Person() {
//		count++;
//		System.out.println("creating an object"); 
//	}
	
	

	class Developer extends Person{

		public Developer(int age, String name) {
			super(age, name); 
			
		}
		
		
		
	}
	
	
	
	public Person ( int age , String name) {
		
		this.name = name ;
		this.age = age ; 
		
	} 
	
	void walk() {
		System.out.println(name + " is walking");
		}
	void talk()
	{
		System.out.println(name + " is talking");
	}
	
	void walk( int steps) {
		
		System.out.println(name + " walked " + steps);
	}
	void doWork() {
		System.out.println("Person is working");
		
	}
		
		
	}


