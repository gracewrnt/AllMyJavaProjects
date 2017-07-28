import java.util.Scanner;

public class hw18 
{

	public static void main(String[] args) 
	{
		int x[] = new int[3];
		System.out.println("Please enter your: ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Num 1 = ");
		x[0]=sc.nextInt();
		System.out.print("Num 2 = ");
		x[1]=sc.nextInt();
		System.out.print("Num 3 = ");
		x[2]=sc.nextInt();
		
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length-1;j++)
			{
				if(x[j]>x[j+1])
				{
					int temp;
					temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}

			}
			
		}
		
		
		System.out.println("Minimun number is " + x[0]);
		
		System.out.println("Minimun to Maximum is " +x[0] + " " + x[1] + " " + x[2]);
		

	}
	
}
