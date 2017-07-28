
public class EnumTestTEST 
{

	public static void main(String[] args) 
	{
		EnumTest firstDay = new EnumTest(EnumTest.Day.MONDAY);
		firstDay.like();
		EnumTest fifthDay = new EnumTest(EnumTest.Day.FRIDAY);
		fifthDay.like();
	}

}
