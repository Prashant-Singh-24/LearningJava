class Base(

public Base(){

System.out.print("Base");

}

public class Derived extends Base { public Derived(){

System.out.print("Derived");

}

public Derived (String s) {

this();

System.out.print(s);

}

public static void main(String[] args) { new Derived ("Manipal");