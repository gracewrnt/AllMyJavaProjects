import java.util.Scanner;

public class TypeOfTriangle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("input 3 number");
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int max, x, y; // ������������������������ ���
						// ��Ҵ�ҹ�����ش2��Һǡ�ѹ��ͧ���¡��Ҵ�ҹ����ҡ�ش
		if (a >= b && a >= c)
		{
			max = a;
			x = b;
			y = c;
		} else if (b >= c && b >= a)
		{
			max = b;
			x = a;
			y = c;
		} else
		{
			max = c;
			x = a;
			y = b;
		}
		if (x + y <= max)
		{
			System.out.println("is not triangle");
		}
		
		return;
		
		int m,n;
		m = max * max;
		n = (x * x) +( y * y);
		if (m > n)
		{
			System.out.println("��ҹ");
		} else if (m < n)
		{
			System.out.println("����");
		} else
		{
			System.out.println("�ҡ");
		}
		if (a == b && b == c)
		{
			System.out.println("��ҹ���");
		} else if (a == b || b == c || a == c)
		{
			System.out.println("˹�Ҩ���");
		} else
		{
			System.out.println("������");
		}
	}
}
