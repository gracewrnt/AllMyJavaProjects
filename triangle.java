package review;

import java.util.Scanner;

public class triangle 
{

	public static void main(String[] args) 
	{
	
		int a,b,c,max,x,y;
		System.out.println("Please enter your length: ");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>=b && a>=c)
		{
			max=a;
			x=b;
			y=c;
		}
		
		else if(b>=a && b>=c)
		{
			max=b;
			x=a;
			y=c;
		}
		
		else
		{
			max=c;
			x=a;
			y=b;
		}
		
		if(x+y<=max)
		{
			System.out.println("Not a triangle");
		}
		

		
		
		
		
		
		int m,n;
		m=max*max;
		n=(x*x)+(y*y);
		
		if(m>n)
		{
			System.out.println("Moom Parn Triangle");
		}
		
		else if(m<n)
		{
			System.out.println("Moom Lhame Triangle");
		}
		
		else
		{
			System.out.println("Moom Chark Triangle");
		}
		
		
		if(a==b && b==c)
		{
			System.out.println("Darn Tao Triangle");
		}
		
		else if(a==b || b==c || c==a)
		{
			System.out.println("Nha Jua Triangle");
		}
		
		else
		{
			System.out.println("Darn Mai Tao Triangle");
		}
		
		
		
	}

}
