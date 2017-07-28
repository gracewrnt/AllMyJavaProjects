import java.util.Scanner;

public class Loop5_1
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Please input your number");
		a = sc.nextInt();

		int k = 1;

		while (k <= a)
		{
			if (a % k == 0)
			{
				System.out.println(k);
			}

			k++;

		}

	}

}
