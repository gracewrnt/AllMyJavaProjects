import java.util.Scanner;

public class HW_Ex3_9
{

	public static void main(String[] args)
	{
		
		
		System.out.println("Please input n");
		Scanner sc=new Scanner(System.in);
		double n;
		n=sc.nextDouble();
		double sum=0;
		double i=1;
		
		while(i<=n)
		{
		sum=sum+1.0/i	;
		i++;
		}
		
		System.out.println("Hn = "+sum);
		
		
		
		
		
		
	}

}
