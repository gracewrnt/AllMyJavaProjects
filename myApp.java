package testttttee;

import java.util.*;

public class myApp {

	public static void main(String[] args) {
		String name, id, vision;
		int i, attend, hos;

		ArrayList students = new ArrayList();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Please input\nstudent id : ");
			id = sc.nextLine();

			if (id.compareToIgnoreCase("exit") == 0)
				break;

			System.out.println("name : ");
			name = sc.nextLine();

			Data st = new Data(id, name);
			students.add(st);

			System.out.println("\n*****************************");
			System.out.println("  List of all good student");

			for (int i = 0; i < students.size(); i++) {
				s.prnBehaveScore();
			}

		}
	}
}