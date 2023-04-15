package operators;

public class BitwiseOperator {

	public static void main(String[] args) {

		
//	Or gate	10 -> 1010
//		    13 -> 1101
//		
//		    15 -> 1111
		
		int l = 10;
		int m=  13;
		
		int n = l|m;
		
		System.out.println(n);
		
//And gate	5 ->   101
//          6  ->  110
//
//          4	   100
		
		
		
		   int a = 5 ;
		   int b = 6;
		   
		   int c =  a&b;
		   
		   System.out.println(c); 
		   
		   
//		  Right shift -->  No 2 se Divide ho ja raha hai
		   
//		 (13) 1101 -> 0110 (6)
//		 (6) 0110 -> 0011 (3)
//		 (3) 0011 -> 0001  (1)
//		 (1)  0001 -> 0000 (0)
		   
		   int j = 15;
		   
		   int k = j>>2;  // right Shift 2 Times 
		   
		   System.out.println(k);
		   
//		   Left shift -->  Isme no double ho jata hai
		     int f = 10;
		     
		     int d = f<<2;
		     
		     System.out.println(d);
	}

}
