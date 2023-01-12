package oop.keyword5;

public class Deposit {
	private String name;
	private static double basicRate = 1.2;
	private double preferRate;
	private int balance;
	
	public Deposit(String name, double preferRate, int balance) {
		this.setName(name);
		this.setPreferRate(preferRate);
		this.setBalance(balance);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static double getBasicRate() {
		return basicRate;
	}
	public static void setBasicRate(double basicRate) {
		Deposit.basicRate = basicRate;
	}
	public double getPreferRate() {
		return preferRate;
	}
	public void setPreferRate(double preferRate) {
		this.preferRate = preferRate;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void output() {
		System.out.println("이름: " + this.getName());
		System.out.println("기본이율: " + getBasicRate());
		System.out.println("우대이율: " + this.getPreferRate());
		System.out.println("잔액: " + this.getBalance());
	}
}
