import java.util.*;
public class Main 
{

	public static void main(String[] args) 
	{
		
		List<CoolingMachines> l = new ArrayList<>();
		CoolingMachines cm = new CoolingMachines();
		Refrigerator rf = new Refrigerator();
		AirConditioner ac = new AirConditioner();
		l.add(cm);
		l.add(rf);
		l.add(ac);
		l.add(new CoolingMachines () );
		l.add(new Refrigerator() );
		l.add(new AirConditioner() );
		
		for(CoolingMachines current : l)
		{
			current.startMachine();
		}
		

	}
}
