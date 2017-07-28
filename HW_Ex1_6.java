import java.util.Scanner;

public class HW_Ex1_6
{

	public static void main(String[] args)
	{
		double A,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please input the area");
		A = sc.nextDouble();
		r=Math.sqrt(A)/Math.sqrt(Math.PI);
System.out.println(r);
	}

}
