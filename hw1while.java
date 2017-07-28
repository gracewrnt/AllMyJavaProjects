import java.util.Scanner;

public class hw1while {

	public static void main(String[] args) {

		int x, sum;
		sum = 0;
		x = 2;

		while (x <= 100) {
			System.out.print(x + " ");
			x += 2;
		}

		x = 2;
		while (x <= 100) {
			sum = sum + x;
			x += 2;
		}

		System.out.print("\nThe answer is " + sum);

	}

}
