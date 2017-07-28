import java.util.Arrays;
import java.util.Scanner;

public class Extra3_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Input size of array: ");
		n = sc.nextInt();
		int[] x = new int[n];
		for (int i = 0; i < n; i++)
		{
			System.out.println("Input: ");
			x[i] = sc.nextInt();
		}

		int[] y = new int[n % 2 == 0 ? n / 2 : (n / 2) + 1];
		for (int i = 0; i < y.length; i++) {
			y[i] = x[i] + x[n - i - 1];
		}

		System.out.print(Arrays.toString(y));
	}

}
