package mainexercise8;

import java.util.ArrayList;
import java.util.Date;

public class Account {
	private String name;
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	protected ArrayList<Transaction> transactions = new ArrayList<>();

	Account() {
	}

	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	Account(String name, int id, double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccount() {
		return id;
	}

	public void setAccount(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setAccount(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public ArrayList<Transaction> getTransactions() {
		return this.transactions;
	}

	private double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}

	public void withdraw(double amount) {
		balance -= amount;
		Transaction transaction = new Transaction('W', amount, balance, "withdrawal");
		transactions.add(transaction);
	}

	public void deposit(double amount) {
		balance += amount;
		Transaction transaction = new Transaction('D', amount, balance, "deposit");
		transactions.add(transaction);
	}
}
