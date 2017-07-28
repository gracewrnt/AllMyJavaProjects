import java.util.Scanner;

public class HW_Ex1_11
{

	public static void main(String[] args)
	{

		double L, W, A, P;
		Scanner sc = new Scanner(System.in);
System.out.println("Please input Length and Width");
L=sc.nextDouble();
W=sc.nextDouble();
A=L*W;
System.out.println("The area is "+ A);

P=(2*W)+(2*L);
System.out.println("The perimeter is "+P);
	}

}
