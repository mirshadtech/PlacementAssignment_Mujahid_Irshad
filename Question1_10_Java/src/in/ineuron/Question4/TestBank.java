package in.ineuron.Question4;

import java.util.Scanner;

public class TestBank {

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		// create initial accounts
		System.out.print("How many number of customers do you want to input? ");
		int n = sc.nextInt();
		BankImpl C[] = new BankImpl[n];
		for (int i = 0; i < C.length; i++) {
			C[i] = new BankImpl();
			System.out.print("Enter Account No: ");

			C[i].setAccno(sc.next());
			System.out.print("Enter Name: ");

			C[i].setName(sc.next());
			System.out.print("Enter Balance: ");

			C[i].setBalance(sc.nextLong());
			
		}

		int ch;
		do {
			System.out.println("\n ***Banking System Application***");
			System.out.println(" 1.Check Balance\n 2. Deposit the amount \n 3. Withdraw the amount \n 4.Exit ");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			switch (ch) {

			case 1:
				System.out.print("Enter account no. you want to search: ");
				String ac_no = sc.next();
				boolean found = false;
				for (int i = 0; i < C.length; i++) {
					found = C[i].search(ac_no);
					if (found) {
						break;
					}
				}
				if (!found) {
					System.out.println("Search failed! Account doesn't exist..!!");
				}
				break;
			case 2:
				System.out.print("Enter Account no. : ");
				ac_no = sc.next();
				found = false;
				for (int i = 0; i < C.length; i++) {
					found = C[i].search(ac_no);
					if (found) {
						C[i].Deposit();
						break;
					}
				}
				if (!found) {
					System.out.println("Search failed! Account doesn't exist..!!");
				}
				break;
			case 3:
				System.out.print("Enter Account No : ");
				ac_no = sc.next();
				found = false;
				for (int i = 0; i < C.length; i++) {
					found = C[i].search(ac_no);
					if (found) {
						C[i].Withdraw();
						break;
					}
				}
				if (!found) {
					System.out.println("Search failed! Account doesn't exist..!!");
				}
				break;
			case 4:
				System.out.println("ThankYou for Using Our Application...");
				break;
			}
		} while (ch != 4);
		
		sc.close();
	}
}
