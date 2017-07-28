import java.util.Scanner;
public class Array_2
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
				System.out.println( x[i] + " ");
		}
		
	

	}

}
