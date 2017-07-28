import java.util.Scanner;
public class hw21 
{

	public static void main(String[] args) 
	{
		int ran,num;
		ran=(int)(Math.random()*9)+1;
		System.out.print("Please enter your num: ");
		Scanner sc = new Scanner(System.in); 
		num=sc.nextInt();
		
		for(int i=0;i<1000;i++)
		{
			
			if(num<ran)
			{
				System.out.println("\t\t\t\t\tThe answer is greater than your number.");
			}
			
			else if(num>ran)
			{
				System.out.println("\t\t\t\t\tThe answer is less than your number.");
			}
			
			else if(num==ran)
			{
				break;
			}
			
			System.out.print("\nPlease enter again: ");
			num=sc.nextInt();
			
		}
		
		
		System.out.print("\t\t\t\t\t\t\tCorrect!!!");
		
	
	}

}
