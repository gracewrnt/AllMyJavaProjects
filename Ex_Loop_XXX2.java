public class Ex_Loop_XXX2
{

	public static void main(String[] args)
	{
		
		int n=10;
		
		for(int r=1;r<=n;r++)
		{
		
			for(int c=1;c<=n*2;c++)
		{
			if(c>=r && c<=2*n-r)
			{
			System.out.print("x");	
			}
			else
			{
			System.out.print(" ");	
			}
			
		}
			System.out.println();
		
		}

		
		
		
	}

}
