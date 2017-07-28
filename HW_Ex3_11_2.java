import java.util.Scanner;

public class HW_Ex3_11_2
{

	public static void main(String[] args)
	{
		
		
		
		double S,w,h;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input weight, height");
		w=sc.nextDouble();
		h=sc.nextDouble();
		S=(71.84*Math.pow(w, 0.425)*Math.pow((h), 0.725))/10000;
		System.out.println(S);
		
		

	}

}
