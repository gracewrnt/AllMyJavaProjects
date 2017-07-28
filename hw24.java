import java.util.Scanner;

public class hw24

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
		
		
		minmax(x);
				
		
		System.out.println("The minimum number is " + x[0]);
		
		System.out.println("The maximum number is " + x[9]);
				
		
		avg(x);
		
	}


	
	public static void minmax(int x[]) 
	{
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
	}
	
	
	public static void avg(int x[])
	{
		int avg;
		int sum=0;
		for(int k=0;k<10;k++)
		{
			
			sum=sum+x[k];
		}
		
			avg=sum/10;
			System.out.println("The average is " + avg);
	}
	
		
	
}
