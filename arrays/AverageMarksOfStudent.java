package arrays;

import java.util.Scanner;

public class AverageMarksOfStudent {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number Of Student");
		int n = sc.nextInt();
		
		System.out.println("Enter The MArks");
		int marks [] = new int[n];
		
		for(int i=0 ; i<=n ; i++) {
			marks [i] = sc.nextInt();
		}
		
		int averageMarks = 0 ; 
		
		for(int i = 0 ; i<=n ; i++) {
			averageMarks += marks[i];
		}
		
		averageMarks /= n;
		
		System.out.println("The Average Marks is "+averageMarks);

	}

}
