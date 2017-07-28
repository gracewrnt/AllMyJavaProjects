import java.util.Arrays;
import java.util.Scanner;

public class Extra3_07 {

	public static void main(String[] args) 
	{
		int [] a = new int [10];
		Scanner sc = new Scanner(System.in);
for(int i=0;i<a.length;i++)
{
	System.out.print("Input a: ");
	a[i] = sc.nextInt();
}
		
		int [] b = new int [10];
		for(int i =0 ; i <b.length;i++)
		{
			System.out.print("Input b:");
			b[i] = sc.nextInt();
		}
		
		
		int [] c = new int[20];
		for(int i=0;i<a.length;i++)
		{
			c[i] = a[i];
		}
		
		
		for(int i=0;i<b.length;i++)
		{
			c[i+10]=b[i];
		}
	
		System.out.println(Arrays.toString(c));
		
	}

}
