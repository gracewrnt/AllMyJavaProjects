
public class Loop2_5
{

	public static void main(String[] args)
	{

		
		
		int i=1;
		while(i<10)
		{
			
			int j;
			j = 1;
			while (j <= 10-i)
			{
				System.out.print("_");
				j++;	
			}
			
			j=1;
			while(j<=i)
			{
				System.out.print("x");
				j++;
			}

			System.out.println();
			i++;
		}


	
	}

}
