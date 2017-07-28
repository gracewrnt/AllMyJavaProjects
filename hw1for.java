import java.util.Scanner;

public class hw1for {

	public static void main(String[] args) {

		int x, sum;
		sum = 0;
		for (x = 2; x <= 100; x += 2) {
			System.out.print(x + " ");

		}

		for (x = 2; x <= 100; x += 2) {
			sum = sum + x;

		}
		System.out.print("\nThe answer is ");
		System.out.println(sum);

	}
}
