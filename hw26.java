import java.util.Scanner;

public class hw26 {

	public static void main(String[] args) {
		int num;
		System.out.println("Please enter your number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int x[] = new int[num];

		for (int a = 0; a < x.length; a++) {
			x[a] = (int) (Math.random() * 1000);
		}

		int upperindex, lowerindex;
		x[num] = upperindex = sc.nextInt();
		x[num + 1] = lowerindex = sc.nextInt();

		if (lowerindex < upperindex) {
			for (int i = 0; i < num + 1; i++) {
				for (int j = 0; j < num; j++) {
					if (x[j] > x[j + 1]) {
						int temp;
						temp = x[j];
						x[j] = x[j + 1];
						x[j + 1] = temp;
					}
				}

			}

		}

		else {
			System.out.print(" ");
		}

	}

}
