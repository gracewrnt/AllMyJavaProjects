
public class Loop_while_to_for1
{

	public static void main(String[] args)
	{
		
		
		for(int j=1;j<=10;j++)
		{
			
			for(int i=1;i<=11-j;i++)
			{
				System.out.print("_");
			}
			
			
			for(int i=1;i<=j;i++)
			{
				System.out.print("x");
			}
			
			
			for(int i=1;i<=j-1;i++)
			{
				System.out.print("x");
			}
			
			System.out.println();
			
			
		}
			
		
		

	}

}
