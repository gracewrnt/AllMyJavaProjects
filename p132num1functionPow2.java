import java.util.Scanner;
public class p132num1functionPow2 
{
	public static double power(double a,int b)
	{
		double sum = 1;
		int i = b;
		while(i>0)
		{
		if(i%2==1)
		{
			sum = sum*a;
			i--;
		}
			
		else
		{
			a = a*a;
			i = i/2;
		}
			
		}
		
		
	return sum;	
		
	}

	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double x=sc.nextDouble();
		int y = sc.nextInt();
		double z;
		z = power(x,y);
		System.out.print(z);
	}

}
