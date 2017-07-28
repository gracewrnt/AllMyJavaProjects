import java.util.Scanner;

public class p132num1functionpow {

	public static double power(double a, int b) {
		double sum = 1;
		for (int i = 1; i <= b; i++) {
			sum = sum * a;
		}

		return sum;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		int y = sc.nextInt();
		double z;
		z = power(x, y);
		System.out.print(z);
	}

}
