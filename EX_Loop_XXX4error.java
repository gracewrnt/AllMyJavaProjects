
public class EX_Loop_XXX4error
{

	public static void main(String[] args)
	{
	
		int n=6;
		
		for(int j=1; j<=n;j++)
		{
			
		for(int i=1;i<=n*2;i++)
				{
			
			if(i==j+(n/2) || i==j-(n/2) || i==n-j+1 || i==n-j+1+(n/2))
			{
				System.out.println("x");
			}
			
			else
			{
				System.out.println(" ");
			}
			
				}
			
		}
		

	}

}
