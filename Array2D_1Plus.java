import java.util.Scanner;

public class Array2D_1Plus
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[][] A = new int[3][3];
		int[][] B = new int[3][3];
		int[][] C = new int[3][3];
		int[][] D = new int[3][3];

		// Input A
		for (int i = 0; i < A.length; i++)
		{
			for (int j = 0; j < A[0].length; j++)
			{
				System.out.println("Please input A:");
				A[i][j] = sc.nextInt();
			}
		}

		// Input B
		for (int i = 0; i < B.length; i++)
		{
			for (int j = 0; j < B[0].length; j++)
			{
				System.out.println("Please input B: ");
				B[i][j] = sc.nextInt();
			}
		}

		// Matrix Plus
		for (int i = 0; i < B.length; i++)
		{
			for (int j = 0; j < B[0].length; j++)
			{
				C[i][j] = A[i][j] + B[i][j];
			}
		}

		// Matrix multiply
		for (int i = 0; i < B.length; i++)
		{
			for (int j = 0; j < B[0].length; j++)
			{
				int sum = 0;
				for (int k = 0; k < B.length; k++)
				{
					sum += A[i][k] * B[k][j];
				}
				D[i][j] = sum;
			}
		}

		// Print A
		for (int i = 0; i < B.length; i++)
		{
			for (int j = 0; j < B[0].length; j++)
			{
				System.out.println(A[i][j] + "\t");
			}
			System.out.println();

		}
		System.out.println();

		// Print B
		for (int i = 0; i < B.length; i++)
		{
			for (int j = 0; j < B[0].length; j++)
			{
				System.out.println(B[i][j] + "\t");
			}
			System.out.println("");

		}
		System.out.println();

		// Print C
		for (int i = 0; i < B.length; i++)
		{
			for (int j = 0; j < B[0].length; j++)
			{
				System.out.println(C[i][j] + "\t");
			}
			System.out.println("");

		}
		System.out.println();

		// Print D
		for (int i = 0; i < B.length; i++)
		{
			for (int j = 0; j < B[0].length; j++)
			{
				System.out.println(D[i][j] + "\t");
			}
			System.out.println("");

		}

		System.out.println();

	}

}
