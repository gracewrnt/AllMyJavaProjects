import java.util.Scanner;

public class Resistance
{

	public static void main(String[] args)
	{
	double R,p,l,A;
	p=1.59E-8;
	Scanner sc = new Scanner(System.in);
	System.out.println("input Area and Length");
	A=sc.nextDouble();
	l=sc.nextDouble();
	R=(p*l)/A;
	System.out.println(R);
	}

}
