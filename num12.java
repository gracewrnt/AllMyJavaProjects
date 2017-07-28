import java.util.Scanner;
public class num12 
{

	public static void main(String[] args) 
	{
		int a,b,c;
		System.out.println("Please input your number: ");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a+b==c)
		{
			System.out.print(a + " + " + b + " = " + c);
		}
		
		else if(a-b==c)
		{
			System.out.print(a + " - " + b + " = " + c);
		}
		
		else if(a*b==c)
		{
			System.out.print(a + " x " + b + " = " + c);
		}
		
		else if(a/b==c)
		{
			System.out.print(a + " / " + b + " = " + c);
		}
		
		else
		{
			System.out.print("No relation");
		}
		
		
		
		

	}

}
