package in.ineuron.Question6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();

		Random rd = new Random();
		
		for (int i = 0; i < 500; i++) {
			int randomNumber = rd.nextInt(1000);
			arrayList1.add(randomNumber);
		}

	
		Stream<Integer> arrayStream = arrayList1.stream();
		List<Integer> filteredList = arrayStream.filter(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println("Size of Array List-1 Before Filtering :: " + arrayList1.size());
		System.out.println("Size of Array List-2 After Filtering :: " + filteredList.size());

		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

	
		for (int i = 0; i < 200; i++) {
			int randomNumber = rd.nextInt(1000);
			arrayList2.add(randomNumber);
		}
		Stream<Integer> arrayStream2 = arrayList2.stream();
		Integer maxElement = arrayStream2.max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Max Element From Array List-II ::  " + maxElement);
	}

}
