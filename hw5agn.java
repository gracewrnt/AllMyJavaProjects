public class hw5agn 
{
	public static void main(String[] args) 
	{
		
		for(int i=0;i<100;i++)
		{	
			double hw1;
			hw1=(double) (Math.random()*10);
			System.out.println("Homework ( " + (i+1) + " ) = " + hw1);
			
			double hw2;
			hw2=(double) (Math.random()*10);
			System.out.println("Homework ( " + (i+1) + " ) = " + hw2);
			
			double hw3;
			hw3=(double) (Math.random()*10);
			System.out.println("Homework ( " + (i+1) + " ) = " + hw3);
			
			double hw4;
			hw4=(double) (Math.random()*10);
			System.out.println("Homework ( " + (i+1) + " ) = " + hw4);
			
			double hw5;
			hw5=(double) (Math.random()*10);
			System.out.println("Homework ( " + (i+1) + " ) = " + hw5);
			
			double mid;
			mid=(double) (Math.random()*100);
			System.out.println("Midterm Score ( " + (i+1) + " ) = " + mid);
			
			double fin;
			fin=(double) (Math.random()*100);
			System.out.println("Final Score ( " + (i+1) + " ) = " + fin);
			
			double score;
			score=(0.04*hw1)+(0.04*hw2)+(0.04*hw3)+(0.04*hw4)+(0.04*hw5)+(0.3*mid)+(0.5*fin);
			System.out.println("Score = " + score);
					
			System.out.print("\n\n\n");
		}			
	}
}
