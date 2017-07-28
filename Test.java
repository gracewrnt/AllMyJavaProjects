
public class Test 
{

	public static void main(String[] args) 
	{
		
		Car aCar = new Car ( ) ;
		SportCar myCar = new SportCar ( "GREEN" , 16) ;
		
		System.out.println ( aCar + " : " + aCar.color + " with size = " + aCar.engineSize ) ;
		System.out.println ( myCar + " : " + myCar.color + " with size = " + myCar.engineSize ) ;
		System.out.println( "SportCar is an instance of Car is " + (myCar instanceof Car)) ;
		System.out.println( "Car is an instance of SportCar is " + (aCar instanceof SportCar)) ;
		myCar.showMaxSpeed ( ) ;
		SportCar.showMaxSpeed ( ) ;

		
		myCar.showColor( ) ;
		
	}

}
