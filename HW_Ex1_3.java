import java.util.Scanner;

public class HW_Ex1_3
{
	public static void main(String[] arcs)
	{
		double Y,A, B, C, m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input A");
		A = sc.nextDouble();
		System.out.println("Please input B");
		B = sc.nextDouble();
		System.out.println("Please input C");
		C = sc.nextDouble();
		System.out.println("Please input m");
		m = sc.nextDouble();

		if(m>5)
		{
			Y=(A*m*2)+(B*m)+C;
		System.out.println(Y);
				
		}
		
		else
			
		{
			
			if(m<5)
			{
				Y=(A*m*2+(B*m)-C);
						System.out.println(Y);
			}
			
			else
			{
				Y=(A*m*2)+(B*m);
				System.out.println(Y);
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
