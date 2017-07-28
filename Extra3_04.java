import java.util.Arrays;
import java.util.Scanner;
public class Extra3_04 
{

	public static void main(String[] args) 
	{
		int [] x = new int [10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<x.length ; i++)
		{
			System.out.print("Input: ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("Input V : ");
		int V = sc.nextInt();
		int index = -1;
		
		for(int i = 0 ; i<x.length ; i++)
		{
			if(x[i] == V)
			{index = i; break;}
		}
		
		if(index == -1)
			return;
		
		for(int i = index ;i<x.length-1;i++)
		{
			x[i] = x[i+1];
		}
		
		x [x.length - 1] = 0;
		System.out.println(Arrays.toString(x));
	}

}
