import java.util.Scanner;

public class hw10 {

	public static void main(String[] args) {

		int num;
		System.out.print("Please enter your number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int x[] = new int[num];
		int i;
		int sum = 0;

		for (i = 0; i < num; i++) {

			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextInt();

			if (x[i] != 0) {
				sum = sum + x[i];

			}

			else if (x[i] == 0) {
				System.out.println("Sum is " + sum);
				System.out.print("Average is " + (sum / x.length) );
			}

		}

	}

}
