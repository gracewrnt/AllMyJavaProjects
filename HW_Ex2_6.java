import java.util.Scanner;

public class HW_Ex2_6
{

	public static void main(String[] args)
	{
		
		
		
		double a, b, c, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a , b , c (1/2/3/4)");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
			
		if(c==1)
		{
			result=a+b;
			System.out.println(result);
		}
		
		else
		{
			
			if(c==2)
			{
				result=a-b;
				System.out.println(result);
			}
			
			else
			{
				if(c==3)
				{
					result=a*b;
					System.out.println(result);	
				}
			
				else
				{
					if(c==4)
					{
						result=a/b;
						System.out.println(result);	
					}
				}
			
			}
			
			
		}
			
		
		
		
		
		
		
		
	}

}
