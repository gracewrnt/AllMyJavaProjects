import java.util.Scanner;

public class Loop5_2
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Please inout your number");
		a = sc.nextInt();
		int count = 0;
		int k = 1;

		while (k <= a)
		{
			if (a % k == 0)
			{
				count++;
			}

			k++;
			System.out.println(k);

		}

		System.out.println("There are " + count + " numbers");

	}

}
