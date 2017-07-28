import java.util.Scanner;
public class num13 
{

	public static void main(String[] args) 
	{
		int a,b,c,d,difhr,difmin;
		Scanner sc = new Scanner(System.in);
		System.out.println("Start time\nhour: ");
		a=sc.nextInt();
		System.out.println("min: ");
		b=sc.nextInt();
		System.out.println("\nEnd time\nhour: ");
		c=sc.nextInt();
		System.out.println("min: ");
		d=sc.nextInt();
		
		if(d<b)
		{
			difhr=c-a-1;
			difmin=60-b+d;
			System.out.println("The difference between start and end time is " + difhr + " hour(s) " + difmin + " min(s)");
		}
		
		else if(d>=b)
		{
		difhr=c-a;
		difmin=d-b;
		System.out.println("The difference between start and end time is " + difhr + " hour(s) " + difmin + " min(s)");
		}
		
	
		
		
		
	}

}
