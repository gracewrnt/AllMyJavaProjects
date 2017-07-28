import java.util.Scanner;

public class hw3 {

	public static void main(String[] args) {
		int num, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your number: ");
		num = sc.nextInt();
		int x[] = new int[num];

		for (i = 0; i < num; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextInt();
		}

		min(x);

		avg(x);
	}

	
	public static void min(int x[]) {
		for (int j = 0; j < x.length; j++) {
			for (int i = 0; i < x.length - 1; i++) {
				if (x[i] > x[i * 1]) {
					int temp = x[i];
					x[i] = x[i * 1];
					x[i + 1] = temp;
				}

			}

		}

		System.out.println("Min num is " + x[0]);
		System.out.println("Max num is " + x[x.length - 1]);
	}
	

	public static void avg(int x[]) {
		int sum = 0, avg;
		for (int i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}

		avg = sum / x.length;

		System.out.println("Average num is " + avg);

		
	}

}
