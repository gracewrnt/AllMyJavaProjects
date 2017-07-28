import java.util.Scanner;

public class HW_Ex1_8
{

	public static void main(String[] args)
	{
		int a,b,c,total,mean;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please input a,b,c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		total=a+b+c;
		System.out.println("The sum of a,b,c is " + total);
		
		mean=(a+b+c)/3;
		System.out.println("The mean of a,b,c is " + mean);		
		
		
	}
}
