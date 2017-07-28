import java.util.Scanner;

public class Array_8 {

	public static void main(String[] args) {
		int x[] = new int [10];
		Scanner sc = new Scanner(System.in);
		int i,a,avg;
		int sum=0;
		System.out.println("Please input number: ");
		
		for(i=0;i<x.length;i++)
		{
			System.out.println("x[" + i + "] = ");
			x[i]=sc.nextInt();
		}
		
		for(i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		
		avg = sum/10;
		System.out.print("Average is " + avg);

	}

}
