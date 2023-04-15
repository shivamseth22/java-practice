package Shivu;

public class addition {

	public static void main(String[] args) {
		for(int i=0; i<=5 ; i++) {
			for(int j=i; j<=4;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			for(int k=0;k<=i;k++) {
				
				System.out.print(" ");
			}
		}
		for(int i=0; i<=5 ; i++) {
			for(int k=4;k>=i;k--) {
				if(k==5) {
					continue;
				}
				System.out.print(" ");
			}
			
			for(int j=0; j<i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			
			
			
		}
		
		
	}

}
