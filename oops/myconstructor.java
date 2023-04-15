package oops;

class Vehicle{
	int wheels;
	 int scooty; 
	
	Vehicle(int noOfWheels){
		wheels = noOfWheels ;
	}
}

public class myconstructor {
		myconstructor(){
			System.out.println("object is now created");
		}
	public static void main(String[] args) {
		
	Vehicle car = new Vehicle(4);
	Vehicle scooty = new Vehicle(2);
	System.out.println(car.wheels + "wheels"+car.scooty+"wheels" );
	}

}
