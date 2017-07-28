import java.util.Scanner;

public class Loop_while_to_for2
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Please inout your number");
		a = sc.nextInt();
		int count = 0;

		for (int k = 1; k <= a; k++)
		{
			if (a % k == 0)
			{
				count++;
			}

			System.out.println(k);

		}

		System.out.println("There are " + count + " numbers");

	}

}
