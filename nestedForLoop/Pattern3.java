package nestedForLoop;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {

	     Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			
			for(int j= 1; j<=n; j++) {
			for(int i = n ; i>=j ; i--) {
				System.out.print("* ");
			}  System.out.println();
			}
	}

}
