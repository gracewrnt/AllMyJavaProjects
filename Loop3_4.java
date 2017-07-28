import java.util.Scanner;

public class Loop3_4
{

	public static void main(String[] args)
	{
		
		System.out.println("Please input");
		Scanner sc=new Scanner(System.in);
		double n;
		n=sc.nextDouble();
		double sum=0;
		double i=1;
		
		while(i<=n)
		{
		sum=sum+1.0/(i*i)	;
		i++;
		}
		
		System.out.println(sum);
		

	}

}
