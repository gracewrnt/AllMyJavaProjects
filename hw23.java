import java.util.Scanner;

public class hw23
{

	public static void main(String[] args) 
	{

		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter num 1 : ");
		num1=sc.nextInt();
		System.out.println("Please enter num 2 : ");
		num2=sc.nextInt();
		if(num1>=num2)
		{
			for(int i=num2;i<=num1;i++)
			{
				System.out.print(i + " ");
			}
		}
		
		else
		{
			System.out.print(" ");
		}

	}

}
