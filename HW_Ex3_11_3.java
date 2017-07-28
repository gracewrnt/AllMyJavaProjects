import java.util.Scanner;

public class HW_Ex3_11_3
{

	public static void main(String[] args)
	{
		
		double S,w,h;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input weight, height");
		w=sc.nextDouble();
		h=sc.nextDouble();
		S=0.0003207*Math.pow((h), 0.3)*Math.pow(1000*w,0.7285-(0.0188*(3+Math.log10(w))));
		System.out.println(S);
		
		
	
		
	}

}
