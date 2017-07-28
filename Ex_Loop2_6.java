
public class Ex_Loop2_6
{

	public static void main(String[] args)
	{
		
		
		

		int j = 1;
		while (j <= 10)
		{
			int i = 1;
			while (i <= 11 - j)
			{
				System.out.print("_");
				i++;
			}

			i = 1;
			while (i <= j-1)
			{
				System.out.print("x");
				i++;
			}

			i = 1;
			while (i <= j)
			{
				System.out.print("x");
				i++;
			}

			System.out.println();
			j++;

		}

		
		
		
		
	}

}
