import java.util.Scanner;

public class HW_Ex3_14
{

	public static void main(String[] args)
	{
		
		double avg;
		double A,B,C,D,F;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please input the number of students who get A,B,C,D,E");
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		D=sc.nextInt();
		F=sc.nextInt();
		avg=((4*A)+(3*B)+(2*C)+(1*D)+(0*F))/(A+B+C+D+F);
		
		System.out.println("The average of the students is "+avg);
		
		
		

	}

}
