import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {

		int i;
		System.out.println("\tNo.\t\t\tTotal Sales(Baht)\t\t\tSales Commission(Baht)");
		int x[] = new int[1000000];

		for (i = 0; i < x.length; i++) 
		{
			double total, com;
			Scanner sc = new Scanner(System.in);
			System.out.print("Please input Total Sales Of " + (i + 1) + " : ");
			total = sc.nextDouble();

			
				if (total < 10000 && total >=0) 
				{
					com = total;
					System.out.println("\t" + (i + 1) + "\t\t\t" + total + "\t\t\t\t\t" + com);
				}

				else if (total >= 10000 && total < 25000) 
				{
					com = 0.07 * total;
					System.out.println("\t" + (i + 1) + "\t\t\t" + total + "\t\t\t\t\t" + com);
				}

				else if (total >= 25000) 
				{
					com = 0.1 * total;
					System.out.println("\t" + (i + 1) + "\t\t\t" + total + "\t\t\t\t\t" + com);
				}

				else if (total < 0) 
				{
					break;
				}
			

		}

		System.out.println("\n\t\t\t\t\tEnd of the program");

	}
}
