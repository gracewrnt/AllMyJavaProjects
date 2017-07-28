import java.util.Scanner;
public class hw9 
{

	public static void main(String[] args) 
	{
	
		int num,x,total;
		System.out.println("Please enter your number: ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		for(x=1;x<=12;x++)
		{
			System.out.println(num + "x" + x + "=" + (num*x) );
			
		}
		

	}

}
