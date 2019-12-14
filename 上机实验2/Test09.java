package 上机实验2;

import java.util.Calendar;
import java.util.Date;

class Account {
	Calendar c = Calendar.getInstance();
	private int _id = 0;
	private double _balance = 0;
	private double _annualInterestRate = 0;
	private String _dateCreated = c.get(Calendar.YEAR) + "/" + c.get(Calendar.MONTH) + "/" + c.get(Calendar.DATE);
	Account(){}
	public int getId() {
		return _id;
	}
	public void setId(int id) {
		_id = id;
	}
	public double getBalance() {
		return _balance;
	}
	public void setBalance(double balance) {
		_balance = balance;
	}
	public double getAnnualInterestRate() {
		return _annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		_annualInterestRate = annualInterestRate;
	}
	public double getMonthlyInterestRate() {
		return _annualInterestRate / (double)12;
	}
	public void withDraw(double money) {
		_balance -= money;
	}
	public void deposit(double money) {
		_balance += money;
	}
	public void print() {
		System.out.println("余额：" +_balance+ " 月利率：" +getMonthlyInterestRate()+ " 开户日期：" +_dateCreated);
	}
}

public class Test09 {
	public static void main(String[] args) {
		Account a = new Account();
		a.setId(1122);
		a.setBalance(2000);
		a.setAnnualInterestRate(4.5);
		a.print();
	}
}
