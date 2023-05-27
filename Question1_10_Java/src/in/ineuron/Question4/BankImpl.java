package in.ineuron.Question4;

import java.util.Scanner;

public class BankImpl implements Bank {

	private String accno;
	private String name;
	private long balance;
	Scanner sc = new Scanner(System.in);

	public String getAccno() {
		return this.accno;
	}

	public void setAccno(String accno) {
		this.accno = accno;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBalance() {
		return this.balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	@Override
	public void Deposit() {
		long amt;
		System.out.println("Enter the amount you want to deposit: ");
		amt = sc.nextLong();
		this.balance = this.balance + amt;

	}

	@Override
	public void Withdraw() {
		long amt;
		System.out.println("Enter the amount you want to withdraw: ");
		amt = sc.nextLong();
		if (this.balance >= amt) {
			this.balance = this.balance - amt;

		} else {
			System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!");
		}

	}

	@Override
	public boolean search(String acc) {
		if (accno.equals(acc)) {
			chckBalance(acc);
			;
			return (true);
		}
		return (false);
	}

	@Override
	public void chckBalance(String acc_number) {

		System.out.println(getBalance());

	}

}
