import java.util.Scanner;

public class ScannerWithIfElse
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k;
		k = sc.nextInt(); // key anything and it will keep in "k".
		if (k < 7)
		{
			System.out.println("Hello");
		} else
		{
			System.out.println("Good bye");
		}
	}

}
