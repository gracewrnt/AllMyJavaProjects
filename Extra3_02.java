import java.util.Scanner;
public class Extra3_02 
{

	public static void main(String[] args) 
	{
		int [] x = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<x.length ; i++)
		{
			System.out.print("Input : ");
			x[i] = sc.nextInt();
		}
		
		int V;
		int count = 0;
		System.out.print("Input V: ");
		V = sc.nextInt();
		for(int i = 0 ; i<x.length ; i++ )
		{
			if(x[i] == V)
			{
				count++;
				break;
			}
		}
		
		if(count == 0)
		{
			System.out.print("Is not in array");
		}
		
		else
		{
			System.out.print("Is in array");
		}
		
	
		

	}

}
