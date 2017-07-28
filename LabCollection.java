package labcollection;

import java.util.*;

public class LabCollection {
	public static void main(String[] args) {
		String[] array = { "T", "E", "S", "T", "I", "N", "G", "S" };
		ArrayList a1 = new ArrayList();
		for (String s : array)
			a1.add(s);

		System.out.println("Original content of a1: ");
		Iterator itr = a1.iterator();
		while (itr.hasNext()) {
			Object elem = itr.next();
			System.out.print(elem + "");
		}
		System.out.println();
		ListIterator litr = a1.listIterator();

		System.out.println("Show by ListIterator : ");
		while (litr.hasNext())
			System.out.print(litr.next() + "");
		System.out.println();
		litr = a1.listIterator();
		while (litr.hasNext()) {
			Object elem = litr.next();
			litr.set(elem + "+");
		}

		System.out.println("Modified content of a1 : ");
		itr = a1.iterator();
		while (itr.hasNext())
			{
			System.out.print(itr.next() + "");
			}
		System.out.println();

		System.out.println("Now, Look for where is the litr point to???> ");
		
		
		System.out.println("Modified list backwards : ");
		while (litr.hasPrevious())
			System.out.print(litr.previous() + "");
		
		String t = "t+";
		List<String> removeList = Arrays.asList("E+","I+");
		a1.removeAll(removeList);
		System.out.println();
		System.out.println("After removing \"t+\"");
		itr = a1.listIterator();
		while (itr.hasNext())
			System.out.print(itr.next() + "");
	}
}
