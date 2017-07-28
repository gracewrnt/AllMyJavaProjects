import java.util.Scanner;

public class Array_10 
{

	public static void main(String[] args) 
	{
		int x[] = new int[10];
		System.out.println("Please enter your number: ");
		Scanner sc = new Scanner(System.in);
		
		for (int a = 0; a < 10; a++) 
		{
			System.out.print("x[ " + a + " ] = ");
			x[a] = sc.nextInt();
		}
		
		
		
		for (int i = 0; i < 10; i++) 
		{
			for (int j = 0; j < 9; j++) 
			{
				int temp;
				if (x[j] > x[j + 1]) 
				{
					temp = x[j];
					x[j] = x[j + 1];
					x[j + 1] = temp;
				}
			}
		}
			
		System.out.println("Min num is " + x[0]);
		
	}

}












