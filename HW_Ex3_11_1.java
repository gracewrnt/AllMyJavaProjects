import java.util.Scanner;

public class HW_Ex3_11_1
{

	public static void main(String[] args)
	{
		double S,w,h;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input weight, height");
		w=sc.nextDouble();
		h=sc.nextDouble();
		S=Math.sqrt(w*(h))/Math.sqrt(3600);
		System.out.println(S);
		

	}

}
