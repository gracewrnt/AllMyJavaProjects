import java.util.Random;
public class num2 {
	public static void main(String[] args) {
		Random rn = new Random();
		int[] num = new int[50];
		int swap;
		for (int i = 0; i < num.length; i++) {
			num[i] = rn.nextInt();
			System.out.println("num[ " + i + " ] = " +  num[i] );
		}
		for (int i = 0; i < num.length; i++) {
			swap = num[i];
			num[i] = num[i + 1];
			num[i + 1] = swap;
			i++;
		}
		
		System.out.println("\n\n-------------------------------------------------\n\n");
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("num[ " + i + " ] = " +  num[i] );
		}
	}
}
