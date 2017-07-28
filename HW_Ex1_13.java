
public class HW_Ex1_13
{
	public static void main(String[] args)
	{

		double money = 500, interest = 0;
		int year = 0;

		while (money <= 20000)
		{

			interest = money * (3 / 100.0); //¶éÒà¢ÕÂ¹á¤è 3/100¨Ðä´é0à¾ÃÒÐ int·Ñé§¤Ùèloop¨ÐÇ¹äÁèËÂØ´  µéÍ§·Óà»ç¹intËÒÃdouble
			money = money + interest;
			year++;
			System.out.println("year " + year);
			System.out.println("money+interest = " + money);
		}

		System.out.println("You have to wait for " + year + " years then you can buy an Iphone.");

	}

}
