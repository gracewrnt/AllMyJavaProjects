import java.util.Scanner;
public class Student_Test 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student [] s = new Student[10];
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Please input name,surname,score of student");
			s[i] = new Student();
			s[i].name = sc.nextLine();
			s[i].surname = sc.nextLine();
			s[i].score = sc.nextInt();
			sc.nextLine(); //เก็บ enter 1 ครั้ง
		}

		Student max = new Student();
		max.score = Integer.MIN_VALUE;
		for(int i=0;i<s.length;i++)
		{
			if(max.score<s[i].score)
			{
				max = s[i];
			}
		}
		System.out.print(max.name + " " +max.score);
	}

}
