import java.util.Scanner;

public class Loop3_1
{

	public static void main(String[] args)
	{
		System.out.println("Please input");
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int sum=0;
		int i=1;
		
		while(i<=n)
		{
		sum=sum+i	;
		i++;
		}
		
		System.out.println(sum);
		
	}

}
