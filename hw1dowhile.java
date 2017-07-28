import java.util.Scanner;

public class hw1dowhile {

	public static void main(String[] args) {

		int x, sum = 0;

		x = 2;
		do {
			System.out.print(x + " ");
			x += 2;
		} while (x <= 100);

		x = 2;
		do {
			sum = sum + x;
			x += 2;
		} while (x <= 100);
		System.out.println("\nThe answer is " + sum);

	}

}
