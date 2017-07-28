import java.util.Scanner;
public class num1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("input 2 numbers");
		int x,y,z;
		x = sc.nextInt();
		y = sc.nextInt();
		z = sum(x,y);
		System.out.print("Sum is "+ z);
	}
	
	
	
	public static int sum(int a , int b)
	{
		int r = a+b;
		return r;
	}

}
