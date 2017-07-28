import java.util.Scanner;

public class hw25 {

	public static void main(String[] args) 
	{
		int num;
		System.out.println("Please enter your number: ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		int x[] = new int[num];
		
		for (int a = 0; a < x.length; a++) 
		{
			System.out.print("x[ " + a + " ] = ");
			x[a] = sc.nextInt();
		}
		
		
		minmax(x);
				
		
		System.out.println("The minimum number is " + x[0]);
		
		System.out.println("The maximum number is " + x[num-1]);
				
		
		avg(x);
		
	}


	
	public static void minmax(int x[]) 
	{
	for (int i = 0; i < x.length; i++) 
	{
		for (int j = 0; j < x.length-1; j++) 
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
		double avg;
		double sum=0;
		for(int k=0;k<x.length;k++)
		{
			
			sum=sum+x[k];
		}
		
			avg=sum/x.length;
			System.out.println("The average is " + avg);
	}
	
		
	
}
