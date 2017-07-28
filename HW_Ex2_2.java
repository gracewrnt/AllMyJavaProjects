import java.util.Scanner;

public class HW_Ex2_2
{

	public static void main(String[] args)
	{
		double score;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your score");
		score = sc.nextDouble();

		if (score >= 90)
		{
			System.out.println("A");
		}

		else
		{

			if (score >= 80)
			{
				System.out.println("B");

			}

			else
			{

				if (score >= 70)
				{
					System.out.println("C");
				}

				else
				{

					if (score >= 60)
					{
						System.out.println("D");

					}

					else
					{
						System.out.println("F");
					}

				}

			}

		}

	}

}
