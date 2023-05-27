package in.ineuron.Question3;

import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");

		int number = sc.nextInt();

		try {
			checkNumberIsNegativeOrNot(number);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

	private static String checkNumberIsNegativeOrNot(Integer number) throws ArithmeticException {
		if (number < 0) {
			throw new ArithmeticException("Negative Number");
		} else {
			return "Entered number is a positive number";
		}
	}
}
