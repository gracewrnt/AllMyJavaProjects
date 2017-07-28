import java.util.Scanner;

public class hw81 
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
		int sum;
		sum = a + b + c;
		System.out.println("Sum is " + sum);	
 
	}

}
