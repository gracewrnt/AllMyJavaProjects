import java.util.Scanner;

public class HW_Ex2_1
{
	public static void main(String[] args)
	{

		int hour;
		int minute;
		double fee;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input hour(s) , minute(s)");
		hour = sc.nextInt();
		minute = sc.nextInt();

		if (hour <= 1)
		{
			System.out.println("No Parking Fee");
		}

		else
		{
			if (minute == 0)
			{
				fee = (hour * 30) - 30;
				System.out.println(fee);
			}

			else
			{
				fee = (hour * 30);
				System.out.println(fee);
			}

		}

	}

}
