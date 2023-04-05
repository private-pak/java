package com.bilbil.xuexi;

//import com.bilbil.xuexi.Account.CreditAccount;

public class domText01 {
	public static void main(String[] args) {
		//CreditAccount ca1 = new CreditAccount("");
		Account  at = new Account("余额",1.0);
		System.out.println(at.getActno()+"育儿");
	}

}

class Account {
	private String actno;
	private double balance;

	public Account() {

	}

	public Account(String actno, double balance) {
		// super();
		this.actno = actno;
		this.balance = balance;
	}

	public String getActno() {
		return actno;
	}

	public void setActno(String actno) {
		this.actno = actno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	//
class CreditAccount extends Account {
		private int credit;

		public CreditAccount(String actno, double balance, int credit) {
//			this.actno =  actno;
//			this.balance = balance;
//			this.credit = credit; 
			super(actno, balance);
			this.credit = credit;

		}

		public CreditAccount() {

		}

		public double getCredit() {
			return credit;
		}

		public void setCredit(int credit) {
			this.credit = credit;
		}

	}
}
