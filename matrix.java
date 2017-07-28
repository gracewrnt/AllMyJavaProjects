import java.util.Scanner;
public class matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] matrix = new int[size][size];
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++) {
				matrix[i][j] = 0 + (int) (Math.random() * 2);
				System.out.print(matrix[i][j] + " ");
				if (j == size - 1)
					System.out.print("\n");
			}
		for (int a = 0, count1; a < size; a++) {
			/*
			 * if (matrix[a][b] == matrix[a + 1][b]) { for (int z = 0; z < size;
			 * z++) { if (z == size - 1) { System.out.println("ALL " +
			 * matrix[a][z] + "s on collum " + ++z); } if (matrix[z][a] ==
			 * matrix[z+1][a]) continue; else break;
			 * 
			 * } }
			 */
			for (int b = 0; b < size; b++) {
				if (b == size - 1) {
					count1 = a + 1;
					System.out.println("All " + matrix[a][b] + "s on row " + count1);
					count1++;
					break;
				}
				if (matrix[a][b] == matrix[a][size - 1]) {
					continue;
				} else
					break;

			}
		}

		for (int c = 0, count; c < size; c++)
			for (int d = 0; d < size; d++) {
				if (d == size - 1) {
					count = c + 1;
					System.out.println("ALL " + matrix[c][d] + "s on column " + count);
					count++;
					break;
				}
				if (matrix[d][c] == matrix[size - 1][c]) {
					continue;
				} else
					break;
			}
		for (int f = 0; f < size; f++) {
			if (f == size - 1) {
				System.out.println("ALL " + matrix[f][f] + "s on LINE ");
				break;
			}
			if (matrix[f][f] == matrix[f + 1][f + 1])
				continue;
			else
				break;
		}
		for (int g = 0, h = 1; g < size - 1; g++, h++) {
			if (g == size - 2) {
				System.out.println("ALL " + matrix[g][h] + "s on UPPER LINE ");
				break;

			}
			if (matrix[g][h] == matrix[g + 1][h + 1])
				continue;
			else
				break;
		}
		for (int g = 1, h = 0; h < size - 1; g++, h++) {
			if (h == size - 2) {
				System.out.println("ALL " + matrix[g][h] + "s on LOWER LINE ");
				break;

			}
			if (matrix[g][h] == matrix[g + 1][h + 1])
				continue;
			else
				break;
		}

	}
}
