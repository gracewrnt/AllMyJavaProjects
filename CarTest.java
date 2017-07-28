
public class CarTest 
{

	public static void main(String[] args) 
	{
		Car myCar = new Car();
		Car yourCar = new Car();
	myCar.maxSpeed = 170;
		Car.maxSpeed += 100;
		
		System.out.println(myCar.maxSpeed);
		System.out.println(yourCar.maxSpeed);
		
		myCar.setSeatNumber(15) ;
		Car.setSeatNumber(2) ;
		System.out.println( "My car has " + myCar.seats + " seats." );
		
		Car.setMaxSpeed(180) ;
		myCar.setMaxSpeed(200) ;
		System.out.println( "My car is limited at " + myCar.maxSpeed + " km./hr." );
		System.out.println( "Your car is limited at " + yourCar.maxSpeed + " km./hr." );

		
		String [ ] color = { "White", "Red", "Blue", "Yellow", "Black", "Silver" };
		Car [ ] carArray = new Car [ color.length ] ;
		int k = 0;
		for ( String c : color ) { carArray [ k++ ] = new Car ( c ) ; }

		for ( Car aCar : carArray )
		{ 
			System.out.println ("This car is " + aCar.color ) ;
			System.out.println ( "Now, we have " + Car.carMember + " cars." );
		}
	}
}
