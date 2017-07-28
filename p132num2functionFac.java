
public class p132num2functionFac {
	
	
	public static double power(double a, int b) {
		double sum = 1;
		for (int i = 1; i <= b; i++) {
			sum = sum * a;
		}

		return sum;
	}

	
	
	public static double fac(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}

		return n * fac(n - 1);

	}
	
	

	public static double sin(double x) {
		double result = 0;
		for (int i = 1; i <= 17; i = i + 2) {
			if (i % 4 == 1) {
				result = result + power(x, i) / fac(i);
			}

			else {
				result = result - power(x, i) / fac(i);
			}

			return result;
		}

	}

	
	
	public static void main(String[] args) 
	{

	}

	
	
}
