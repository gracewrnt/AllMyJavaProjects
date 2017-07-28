import java.util.Scanner;

public class num6
{

	public static void main(String[] args) 
	{
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input number:");
		System.out.print("num 1 : ");
		x=sc.nextInt();
		System.out.print("num 2 : ");
		y=sc.nextInt();
		System.out.print("num 3 : ");
		z=sc.nextInt();

		if( x!=y && y!=z && x!=z)
		{
			System.out.print("NO");
		}
		

		else
		{
				System.out.print("YES");	
		}
		

	}

}
