
public class hw16 
{

	public static void main(String[] args) 
	{
		
		int i, j;
		int x[] = new int[100];
		{
			for (i = 0; i < 4; i++) 
			{
				System.out.print("\n");
				for (j = 0; j < 25; j++) 
				{

					x[j] = (int) (Math.random() * 100);
					System.out.print(x[j] + " ");

				}
			}

		}
		
	}

}
