
public class eieiei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}




String engineType;
int engineSize;
String gearType;
String color;
int seats;

Car myCar = new Car(); 

public void setEnginetype(String engineType)
{

	this.engineType="Diesel";
	
}

public void setEngineSize(int engineSize)
{

	this.engineSize=2500;
	
}

public void setGearType(String gearType)
{

	this.gearType="Automatic";
	
}

public void setColor(String color)
{

	this.color="Black";
	
}

public void setSeats(int seats)
{

	this.seats=5;
	
}


public void showDetail()
{
System.out.print(	"My car is " + seats + " seats " + color + "cars. Its engine is " + engineType + "type with size "+ engineSize + " cc. and" + gearType + " transmission."
);

}