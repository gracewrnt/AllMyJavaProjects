import java.util.Scanner;
public class Hithere {

	public static void main(String[] args) 
	{
		Car nextCar = new Car();
		Car yourCar = new Car("Silver" , EngineType.DIESEL , GearType.MANUAL , 3000 , 7);
		System.out.print("Now,Your car is " + yourCar.seats + " seats " + yourCar.color + " cars. Its engine is " + yourCar.engineType + " type with size "+ yourCar.engineSize + " cc. and " + yourCar.gearType + " transmission."
				);
		System.out.println("CHANGE YOUR CAR PROPERTY MENU (input a character in front of your selected choice)\nCOLOR\t B:Blue\t\t G:Green\t S:Silver\t W:White\t R:Red");
		System.out.print("Select new color: ");
		Scanner sc = new Scanner(System.in);
		char Scan1;
		Scan1 = sc.next().charAt(0);
		if(Scan1 == 'B')
			nextCar.setColor("Blue");
		else if(Scan1 == 'G')
			nextCar.setColor("Green");
		else if(Scan1 == 'S')
			nextCar.setColor("Silver");
		else if(Scan1 == 'W')
			nextCar.setColor("White");
		else if(Scan1 == 'R')
			nextCar.setColor("Red");
		
		System.out.println("ENGINE TYPE\t D:DIESEL\t B:BENZYL\t E:ELECTRIC");
		System.out.print("Select new engine type : ");
		Scan1 = sc.next().charAt(0);
		if(Scan1 =='D')
			nextCar.engine(EngineType.DIESEL);
		else if(Scan1 == 'B')
			nextCar.engine(EngineType.BENZYL);
		else if(Scan1 == 'E')
			nextCar.engine(EngineType.ELECTRIC);
		System.out.println("GEARTYPE\t A:AUTOMATIC\t M:MANUAL");
		System.out.print("Select new gear type : ");
		Scan1 = sc.next().charAt(0);
		if(Scan1 =='A')
			nextCar.gear(GearType.AUTOMATIC);
		else if(Scan1 == 'B')
			nextCar.gear(GearType.MANUAL);
		System.out.println("AFTER CHANGING................................................");
		
		System.out.print("Now,Your car is " + nextCar.seats + " seats " + nextCar.color + " cars. Its engine is " + nextCar.engineType + " type with size "+ nextCar.engineSize + " cc. and " + nextCar.gearType + " transmission."
				);
		
		
			
	}

}
