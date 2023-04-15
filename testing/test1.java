package testing;
import java.util.*;
public class test1 {
	public static void main(String [] args) {
		
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int c=facorialOfNumber(num);
        System.out.print(c);
        
        
       
    
}

	private static int facorialOfNumber(int num) {
		// TODO Auto-generated method stub
		int factorial = 1 ;
		int fact=factorial*facorialOfNumber(num-1);
		return fact ;
		
	}
}
