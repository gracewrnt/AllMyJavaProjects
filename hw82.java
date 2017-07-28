import java.util.Scanner;

public class hw82 
{

	public static void main(String[] args) 
	{
		int x,a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your number");	
		x = sc.nextInt();
		a=x%10;
		b=(x/10)%10;
		c=(x/100)%10;
		
		if(a%2==0 && b%2==0 & c%2==0)
		{
			System.out.println("Even num = 3");	
			System.out.println("Odd num = 0");	
		}
		
		else if(a%2==0 && b%2==1 & c%2==1)
		{
			System.out.println("Even num = 1");	
			System.out.println("Odd num = 2");	
		}
		
		else if(a%2==0 && b%2==1 & c%2==0)
		{
			System.out.println("Even num = 2");	
			System.out.println("Odd num = 1");	
		}
		
		else if(a%2==0 && b%2==0 & c%2==1)
		{
			System.out.println("Even num = 2");	
			System.out.println("Odd num = 1");	
		}
		
		else if(a%2==1 && b%2==1 & c%2==1)
		{
			System.out.println("Even num = 0");	
			System.out.println("Odd num = 3");	
		}
		
		else if(a%2==1 && b%2==0 & c%2==0)
		{
			System.out.println("Even num = 2");	
			System.out.println("Odd num = 1");	
		}
		
		else if(a%2==1 && b%2==0 & c%2==1)
		{
			System.out.println("Even num = 1");	
			System.out.println("Odd num = 2");	
		}
		
		else if(a%2==1 && b%2==1 & c%2==0)
		{
			System.out.println("Even num = 1");	
			System.out.println("Odd num = 2");	
		}


	}

}
