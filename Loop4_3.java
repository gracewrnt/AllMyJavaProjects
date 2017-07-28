import java.util.Scanner;

public class Loop4_3
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Please input your number");
		a = sc.nextInt();
		b = sc.nextInt();
		int k = a;
		while (true)
		{
			if (k % a == 0 && k % b == 0)
			{
				break;
			}
			k++;
		}

		System.out.println(k);

	}

}
