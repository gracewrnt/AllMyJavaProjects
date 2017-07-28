
public class Ex_Loop_XXX3
{

	public static void main(String[] args)
	{

		int n = 7;

		for (int j = 1; j <= n; j++)
		{

			for (int i = 1; i <= n * 2; i++)
			{
				if (i == j || i == n - j + 1)
				{
					System.out.print("x");
				} else
				{
					System.out.print(" ");
				}

			}
			System.out.println();

		}

	}

}
