
import java.util.Scanner;

public class hw13 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		double A, B = 0;
		System.out.println("Enter the number : ");
		for (int count = 0;; count++) {
			A = sc.nextInt();
			B = B + A;
			if (A == 0) {
				break;
			}
		}
		System.out.println("Sum is : " + B);
	}
}
