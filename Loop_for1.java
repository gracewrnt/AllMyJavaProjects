
public class Loop_for1
{

	public static void main(String[] args)
	{
		
		
		int i, sum = 0;
		for (i = 1; i <= 100; i++)
		{
			if (((i % 3) == 0) || ((i % 5) == 0))
			{
				System.out.println(i + " ");
				sum=sum+i;
			}
		}
		System.out.println();
		System.out.println("sum= " + sum);
	
	
	
	}

}
