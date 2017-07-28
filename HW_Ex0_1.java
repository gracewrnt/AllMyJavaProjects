import java.util.Scanner;

public class HW_Ex0_1
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Please input a,b,c");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a > 3)
		{

			if (b != 6)
			{
				System.out.println("A");

			}

			else
			{

				if (c <= 7)
				{
					System.out.println("B");
				}

				else
				{
					System.out.println("C");
				}

			}

		}
		else
		{
			if (b <= 16)
			{
				System.out.println("D");
			}
			else
			{

				if (c > 6)
				{
					System.out.println("E");
				}

				else
				{
					System.out.println("F");
				}

			}

		}

	}

}
