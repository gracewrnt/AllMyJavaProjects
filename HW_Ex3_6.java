import java.util.Scanner;

public class HW_Ex3_6
{
	public static void main(String[] args)
	{
		
		double f1,v;
		double f0=2e10;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please input the frequency");
		f1=sc.nextDouble();
		
		v=(10.7585e8*(f1-f0))/((f1+f0));
		System.out.println("The velocity is "+v+" km/hr");
		
		
	}
}
