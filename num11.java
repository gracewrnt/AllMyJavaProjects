
public class num11 {

	public static void main(String[] args) {

		for (int i = 1; i < 500; i++) {
			for (int j = 1; j < 500; j++) {
				for (int k = 1; k <= 500; k++) {
					if (i * i + j * j == k * k) {
						if (i < j)
							System.out.println("a,b,c =" + i + " ," + j + " ," + k);

					}

				}
			}
		}
	}

}
