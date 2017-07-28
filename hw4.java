import java.util.Scanner;

public class hw4 {

	public static void main(String[] args) {
		int i, num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your number: ");
		num = sc.nextInt();
		int x[] = new int[num];

		for (i = 0; i < num; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextInt();
			
		}
	
		swap(x);

	}

	public static void swap(int x[]) 
	{
		int i;
		for (i = x.length-1 ; i >= 0; i--) 
		{
			System.out.print("\n"+ x[i] + " ");
		}

	}

	
	
}
