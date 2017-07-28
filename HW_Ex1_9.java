import java.util.Scanner;

public class HW_Ex1_9
{

	public static void main(String[] args)
	{
		double a,b,c,total,avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please input a,b,c");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		
		total=a+b+c;
		System.out.println("The sum of a,b,c is " + total);
		
		avg=(a+b+c)/3;
		System.out.println("The average of a,b,c is " + avg);		
		
		
	}
}
