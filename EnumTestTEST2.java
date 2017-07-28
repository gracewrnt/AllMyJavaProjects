public class EnumTestTEST2 
{
	public static void main(String[] args) 
	{
		EnumTest oneDay = new EnumTest(EnumTest.Day.FRIDAY);///เพิ่มเองงง
		for(EnumTest.Day myDay : EnumTest.Day.values())
		{
			oneDay.day = myDay;
			oneDay.like();
			System.out.print("************************");
		}
	}
}
