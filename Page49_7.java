import java.util.Scanner;

public class Page49_7
{

	public static void main(String[] args)
	{
		double wA, wB, pA,pB, a, b;
		System.out.println("Input weight,price of A");
		Scanner sc = new Scanner(System.in);
		wA = sc.nextDouble();
		pA = sc.nextDouble();
		System.out.println("Input weight,price of B");
		wB = sc.nextDouble();
		pB = sc.nextDouble();
		
		a=wA/pA;
		b=wB/pB;
		
		if(a>b)
		{
		System.out.println("A ถูกกว่า");	
		}
		else if(a==b)
		{
			System.out.println("เท่ากัน");
		}
		else
		{
			System.out.println("B ถูกกว่า");
		}
	}

}
