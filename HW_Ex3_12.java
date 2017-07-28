import java.util.Scanner;

public class HW_Ex3_12
{

	public static void main(String[] args)
	{

		int sec1, sec2, sec3, sec4, sec5, sec, min, hour, day, month, year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input sec");
		sec = sc.nextInt();
		
		
		year=sec/31536000;
		sec1=sec%31536000;
		month=sec1/2592000;
		sec2=sec1%2592000;
		day = sec2 / 86400;
		sec3=sec2%86400;
		hour = sec3 / 3600;
		sec4 = sec3 % 3600;
		min = sec4 / 60;
		sec5 = sec4 % 60;
		
		System.out.println(year+" year(s) "+month+" month(s) "+day+" day(s) "+hour+" hour(s) "+min+" minute(s) "+sec5+" second(s) ");

	}

}
