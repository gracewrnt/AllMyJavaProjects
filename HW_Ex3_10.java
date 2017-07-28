import java.util.Scanner;

public class HW_Ex3_10
{

	public static void main(String[] args)
	{
		double n,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input n!");
		n=sc.nextDouble();
		result=Math.sqrt(2*Math.PI*n) * Math.pow(n, n)/(Math.pow( Math.E, n));
		
		System.out.println(n+"! = "+result);
		

	}

}
