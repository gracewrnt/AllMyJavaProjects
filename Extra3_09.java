import java.util.Scanner;
public class Extra3_09
{

	public static void main(String[] args) 
	{
		int k ;
		int i=0;
		int[] x = new int [100];
		double[] y = new double[100];
		int max_power=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input max power");
		max_power = sc.nextInt();
		while(true)
		{
			System.out.print("Input coef (or -999)");
			k=sc.nextInt();
			if(k==-999)
			{
				break;
			}
				
				x[i]=k;
				i++;
		}
		
		double a,b;
		System.out.print("Input border a,b");
		a=sc.nextInt();
		b=sc.nextInt();
		
		for(int j=0;j<i;j++)
		{
			if(max_power - j!= -1)
			{
				y[j] = (double) x[j]/(max_power + i+ j);
			}
			
			else
			{
				y[j] = (double) x[j];
			}
			
			
		}
		

		double sum_a,sum_b;
		sum_a=0;
		sum_b=0;
		for(int j=0;j<i;j++)
		{
			if(max_power - j != -1)
			{
				sum_a += y[j] * Math.pow(a,max_power + 1-j);
				sum_b += y[j] * Math.pow(b,max_power + 1-j);
			}
			
			else
			{
				sum_a += y[j] * Math.log(a);
				sum_b += y[j] * Math.log(b);
			}
			
		}
		
		System.out.print(sum_b - sum_a);
		
	}

}
