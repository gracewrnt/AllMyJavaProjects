import java.util.Scanner;

public class Array_4 {

	public static void main(String[] args) {
		int x[] = new int[10];
		System.out.println("Please enter your number: ");
		Scanner sc = new Scanner(System.in);
		int a, i;
		for (a = 0; a < 10; a++) {
			System.out.print("x[ " + a + " ] = ");
			x[a] = sc.nextInt();
		}

		for (i = 0; i < 10; i++) {
			if (x[i] % 2 == 0) {
				System.out.print(x[i] + " ");
			}

		}

	}

}
