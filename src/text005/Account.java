package text005;

/*
 * 账户类
 * 	账号
 * 	余额
 */
public class Account {
	private String actno;// 账户
	private double balance;// 余额

	public Account() {

	}

	public Account(String s, double d) {
		actno = s;
		balance = d;
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

}
