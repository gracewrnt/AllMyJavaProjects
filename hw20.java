import java.util.Scanner;

public class hw20 {

	public static void main(String[] args) {

		int x, num;
		System.out.println("Please enter your number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for (int i = 0; i < 5; i++) {
			System.out.print("\n");

			for (int j = 0; j < 25; j++) {
				x = (int) (Math.random() * num);
				System.out.print(x + " ");

			}

		}

	}

}
