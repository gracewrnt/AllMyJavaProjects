
public class TRY
{
	public static void main(String[] args)
	{
		int n = 10;
		for (int a = 1; a <= n; a++)
		{
			for (int b = 1; b <= n; b++)
			{
				if (b == n - (n/2) - a || b == n + (n / 2) - a || b == n - (n / 2) + a - 1|| b == n - (n / 2) +a - 9) // x w y z
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
