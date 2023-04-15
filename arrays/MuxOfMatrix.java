package arrays;

import java.util.Scanner;

public class MuxOfMatrix {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int a [][] = new int[1][2];
			int b [][] = new int[2][2];
			
			System.out.println("enter mtx a");
			
			for(int i= 0 ; i <= 1 ; i++) {
				for(int j= 0 ;j<=2 ; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("enter mtx b");
			
			for(int i= 0 ; i <= 2 ; i++) {
				for(int j= 0 ;j <=2 ; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			int c [][] = new int[1][2];
			for(int i= 0 ; i <= 1 ; i++) {
				for(int j= 0 ;j <=2 ; j++) {
					c[i][j]=(a[i][j]) *(b[i][j]);
				}
			}
			System.out.println("mtx c is");
			for(int i= 0 ; i <= 3 ; i++) {
				for(int j= 0 ;j <=2 ; j++) {
					System.out.println(c[i][j]+" ");
				}
			}	

	}

}
