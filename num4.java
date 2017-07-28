
public class num4 {

	public static void main(String[] args) {
		int x;
		for ( x = 100000000; x <= 100000000; x--) {

			int count = 0;
			for (int k = 1; k <= x; k++) {
				if (x % k == 0) {
					count++;
				}
			}

			if (count == 2)
				break;
		}

		System.out.print(x);
	}

}
