package review;

import java.util.Scanner;

public class ForStar1 
{

	public static void main(String[] args) 
	{
		
		int i,j,size;
		System.out.println("Please enter your size: ");
		Scanner sc = new Scanner(System.in);
		size=sc.nextInt();
		
		for(i=1;i<=size;i++)
		{
		
			for(j=1;j<=size*2;j++)
			{
				if(j>=i && j<=2*size-i)
				{
					System.out.print("X");
				}
				
				else
				{
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
			
		}
			

	}

}
