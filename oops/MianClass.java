package oops;

class Cat{
	boolean hasFur;
	String color ,breed;
	
	int legs , eyes;
	
	public void walk() {
		System.out.println("Cat is Walking");
	}
	public void eat() {
		System.out.println("Cat is eating");
	}
	public void description() {
		System.out.println("my cat has "+ legs + "legs and " + eyes + "Eyes");
	}
}
class Dog{
	
}
public class MianClass {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		cat1.legs=3;
		cat1.eyes=2;
		
		cat2.legs=3;
		cat2.eyes=1;
		cat1.description();
		cat2.description();

	}

}
