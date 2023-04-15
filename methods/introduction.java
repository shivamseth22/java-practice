package methods;

public class introduction {

	public static void main(String[] args) {
		
		int firstNumber = 34;
		int secondNumber = 23;
		
		int result = maxOf(firstNumber , secondNumber);
		
		maxOf(100, 200);
		sayHi();
		
		System.out.println(result);
	}
	static int maxOf(int a , int b) {
		if(a>b) {
			return a ;
			
		}else {
			return b;
		}
	
	}
	static void sayHi() {
		System.out.println("Hi");
		System.out.println("Good Morning");
		
	}
}
