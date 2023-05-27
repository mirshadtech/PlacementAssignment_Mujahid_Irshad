package in.ineuron.Question10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Number Of Elements u Want to Store::");
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		while (n > 0) {
			al.add(sc.nextInt());
			n--;
		}
		Collections.sort(al);
		System.out.println(al);
		System.out.println("Second Largest Element:: " + al.get(al.size() - 2));
		System.out.println("Second Smallest Element:: " + al.get(1));
		
	}

}
