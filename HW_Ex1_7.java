import java.util.Scanner;

public class HW_Ex1_7
{

	public static void main(String[] args)
	{
		double C,F;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input Celsius");
		C=sc.nextDouble();
		F=(9*C+160)/(5);
				System.out.println(C + " Celsius = " + F + "Fahrenheit");

	}

}
