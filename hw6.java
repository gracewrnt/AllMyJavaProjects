
public class hw6 
{

	public static void main(String[] args) 
	{
		int inbranch = 0;
		int incpn = 0;
		int cpn[][] = new int[7][2];
		for (int branch = 0; branch < cpn.length; branch++) 
		{
			for (int part = 0; part < cpn[0].length; part++) 
			{
				cpn[branch][part] = (int) (Math.random() * 1000);
				System.out.println(
						"Income ( Branch " + (branch + 1) + " Part " + (part + 1) + " ) = " + cpn[branch][part]);
			}

		}
		System.out.println("\n\n");

		
		
		
		System.out.println("Income ( Branch 1 ) = "  + (cpn[0][0]+cpn[0][1]));
		System.out.println("Income ( Branch 2 ) = "  + (cpn[1][0]+cpn[1][1]));
		System.out.println("Income ( Branch 3 ) = "  + (cpn[2][0]+cpn[2][1]));
		System.out.println("Income ( Branch 4 ) = "  + (cpn[3][0]+cpn[3][1]));
		System.out.println("Income ( Branch 5 ) = "  + (cpn[4][0]+cpn[4][1]));
		System.out.println("Income ( Branch 6 ) = "  + (cpn[5][0]+cpn[5][1]));
		System.out.println("Income ( Branch 7 ) = "  + (cpn[6][0]+cpn[6][1]));
		System.out.println("\n\n");

		

		
		for (int branch = 0; branch < cpn.length; branch++) 
		{
			for (int part = 0; part < cpn[0].length; part++) 
			{
				incpn = cpn[branch][part] + incpn;
			}
		}
		System.out.println("Income of this company is " + incpn);

		
	
	}
}
