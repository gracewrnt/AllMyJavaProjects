import java.util.Scanner;

public class HW_Ex1_5
{

	public static void main(String[] args)
	{
		double inch, foot,cm,yard;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the length(inch)");
		inch = sc.nextDouble();
		foot = inch / 12;
		System.out.println(inch + " inch(es) = " + foot+" foot(feet)");
		
		cm = inch * 2.54;
		System.out.println(inch + " inch(es) = " + cm+" centimeter(s) ");

		yard = inch/36;
		System.out.println(inch + " inch(es) = " + yard+" yard(s) ");
	}

}

