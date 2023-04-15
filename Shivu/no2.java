package Shivu;

import java.util.Scanner;



public class no2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number :");
		int n =sc.nextInt();
		int sum = n;
		if(n>=0) {
			for(int i = 1 ; i<=n ;i++ ) {
				sum++;
			}
		}else{
			for(int i=n ; i<0 ;i++) {
				sum--;
			}
		}
		System.out.println(sum);
	}
}
