import java.util.Scanner;

public class HW_Ex2_7
{

	public static void main(String[] args)
	{
		double weight;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input weight (kg)");
		weight = sc.nextDouble();

		if (weight <= 1)
		{
			System.out.println("weight " + weight + " kg = 50 baht.");
		}

		else
		{

			if (weight <= 2)
			{
				System.out.println("weight " + weight + " kg = 60 baht.");
			}

			else

			{

				if (weight <= 3)
				{
					System.out.println("weight " + weight + " kg = 70 baht.");
				}

				else
				{
					System.out.println("weight " + weight + " kg = 100 baht.");
				}

			}

		}

	}

}
