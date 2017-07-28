import java.util.Scanner;

public class HW_Ex3_7
{

	public static void main(String[] args)
	{
double a1,b1,c1,a2,b2,c2,x,y;
Scanner sc= new Scanner(System.in);
System.out.println("Please input a1,b1,c1,a2,b2,c2");
a1=sc.nextDouble();
b1=sc.nextDouble();
c1=sc.nextDouble();
a2=sc.nextDouble();
b2=sc.nextDouble();
c2=sc.nextDouble();

x=( (c1*b2)-(b1*c2) )/( (a1*b2)-(a2*b1) );
		System.out.println("x is "+x);

y=(c2-(a2*x))/b2;
System.out.println("y is "+y);
		
		
	}

}
