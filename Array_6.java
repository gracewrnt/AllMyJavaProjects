import java.util.Scanner;
public class Array_6 
{

	public static void main(String[] args) 
	{
		int x[] = new int [10];
		Scanner sc = new Scanner(System.in);
		int i,a;
		int sum=0;
		System.out.println("Please input number: ");
		
		for(i=0;i<x.length;i++)
		{
			System.out.println("x[" + i + "] = ");
			x[i]=sc.nextInt();
		}
		
		for(i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		System.out.print("Sum is " + sum );

	}

}
