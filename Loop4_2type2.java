import java.util.Scanner;

public class Loop4_2type2
{

	public static void main(String[] args)
	{


		
Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("Please input your number");
a=sc.nextInt();
b=sc.nextInt();
	
int k=a;

while(true)
{
	if(a%k==0 && b%k==0)
	{
		break; //ไม่คิดตรงk-- ข้ามไป println เลย
	}
	
	
k--;
		
}

System.out.println(k);




	}

}
