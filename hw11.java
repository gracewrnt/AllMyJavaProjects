
public class hw11 {

	public static void main(String[] args) {

		int i, j;
		int x[] = new int[100];
		{
			for (i = 0; i < 5; i++) {
				System.out.print("\n");
				for (j = 0; j < 20; j++) {

					x[j] = (int) (Math.random() * 100);
					if (x[j] % 2 == 1) {
						System.out.print(x[j] + " ");
					}

					else if (x[j] % 2 == 0) {
						System.out.print((x[j] + 1) + " ");
					}

				}
			}

		}

	}

}
