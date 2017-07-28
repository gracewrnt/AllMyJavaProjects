

public class show {

	public static void main(String[] args) {
		Car myCar = new Car("Red");
		
		myCar.engineType = EngineType.BENZYL;
		myCar.engineSize = 2500;
		myCar.gearType = Car.GearType.MANUAL;
		//myCar.color = "Black";
		myCar.seats = 5;
		
		
		System.out.print(	"My car is " + myCar.seats + " seats " + myCar.color + " cars. Its engine is " + myCar.engineType + " type with size "+ myCar.engineSize + " cc. and " + myCar.gearType + " transmission."
				);

		Car yourCar = new Car("Silver",EngineType.DIESEL,Car.GearType.MANUAL,3000,7);
		
		System.out.print(	"\nYour car is " + yourCar.seats + " seats " + yourCar.color + " cars. Its engine is " + yourCar.engineType + " type with size "+ yourCar.engineSize + " cc. and " + yourCar.gearType + " transmission."
				);
		
	}

}
