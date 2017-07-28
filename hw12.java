import java.util.Scanner;
public class hw12 
{

	public static void main(String[] args) 
	{
		double x[] = new double[5];
		System.out.println("Please enter youre number");
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<x.length ; i++)
		{
			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextDouble(); 
			
		}
		
		double sum=0;
		double avg;
		for(int i=0 ; i<x.length ; i++)
		{
			sum=x[i]+sum;
		}
		
		avg=sum/x.length;
		
		System.out.println("Sum is " + sum );
		
		System.out.println("Average is " + avg );

	}

}
 