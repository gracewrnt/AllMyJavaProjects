
public class hw7 
{

	public static void main(String[] args) 
	{
		
		int inpart4;
		int cpn[][] = new int[3][5];
		for (int branch = 0; branch < cpn.length; branch++) 
		{
			for (int part = 0; part < cpn[0].length; part++) 
			{
				cpn[branch][part] = (int) (Math.random() * 100000);
				System.out.println(
						"Income ( Branch " + (branch + 1) + " Part " + (part + 1) + " ) = " + cpn[branch][part]);
			}

		}
		System.out.println("\n\n");

		
		
		
		inpart4=cpn[0][3]+cpn[1][3]+cpn[2][3];
		System.out.println("Income part 4 of every branch is " + inpart4);
		System.out.println("\n\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
