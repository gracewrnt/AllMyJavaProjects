
public class CoolingMachines 
{
	public void startMachine()
	{
		System.out.println("Starting");
	}
	
	public void stopMachine()
	{
		System.out.println("Stopping");
	}
}


class Refrigerator extends CoolingMachines
{
	public void startMachine()
	{
		System.out.println("Refrigerator Starts");
	}
	
	public void stopMachine()
	{
		System.out.print("Refrigerator Stops");
	}
	
	public void tuning()
	{
		System.out.print("TuningRefrigerator");
	}
}


class AirConditioner extends CoolingMachines
{
	public void startMachine()
	{
		System.out.println("AC Starts");
	}	
}




