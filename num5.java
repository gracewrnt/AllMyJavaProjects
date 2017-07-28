import java.util.Scanner;

public class num5 
{

	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		double x = sc.nextDouble();
		System.out.print(absolute(x));
	}

	
	public static double absolute(double x)
	{
		if(x >= 0)
			return x;
		return x* -1;
	}
}
