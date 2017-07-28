import java.util.Scanner;

public class HW_Ex2_4
{

	public static void main(String[] args)
	{
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input number");
		num = sc.nextInt();

		if (num%2==0)
		{
			System.out.println("เป็นเลขคู่");
		}

		else
		{
			System.out.println("เป็นเลขคี่");
		}

		

	}

}
