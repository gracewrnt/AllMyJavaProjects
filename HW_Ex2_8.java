import java.util.Scanner;

public class HW_Ex2_8
{

	public static void main(String[] args)
	{

		double x, a, b, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input x");
		x = sc.nextDouble();

		if (x == 1)
		{

			System.out.println("Please input a,b ");
			a = sc.nextDouble();
			b = sc.nextDouble();
			result = a + b;
			System.out.println("The result is " + result);
		}

		else
		{
			if (x == 2)
			{
				System.out.println("Please input a,b ");
				a = sc.nextDouble();
				b = sc.nextDouble();
				result = a * b;
				System.out.println("The result is " + result);
			}

			else
			{
				if (x == 3)
				{
					System.out.println("Please input a,b ");
					a = sc.nextDouble();
					b = sc.nextDouble();
					result = a / b;
					System.out.println("The result is " + result);
				}

				else
				{
					System.out.println("เลือก 1-3 เท่านั้น");
				}

			}
		}

	}

}
