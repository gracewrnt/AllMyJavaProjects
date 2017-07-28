import java.util.Scanner;

public class HW_Ex1_14
{

	public static void main(String[] args)
	{

		double money; // so as below
		double interest; // input from keyboard
		double sum=0;
		int year = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input money,interest(%)");
		money = sc.nextDouble();
		interest = sc.nextDouble();

		while (year <= 10)
		{

			sum = sum + (money * (interest / 100.0));
			money = money + sum;
			System.out.println("Total = " + sum);
			
			
			year++;

			// System.out.println("year " + year);
			// System.out.println("money+interest = " + money);
		}

		System.out.println("Total = " + sum);

	}

}

