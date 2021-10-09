package model;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class History {
	private long accountBanking;
	private double money;
	private Date date;
	private String note;
	private double balance;
	private String typeBanking;
	
	public History(long accountBanking, double money, Date date, String note,double balance,String typeBanking) {
		this.accountBanking = accountBanking;
		this.money = money;
		this.date = date;
		this.note = note;
		this.balance=balance;
		this.typeBanking=typeBanking;
	}
	public String dateToString(Date date) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("hh:mm dd/MM/yyyy");
		return dateFormat.format(date);
	}
	public long getAccountBanking() {
		return accountBanking;
	}
	public void setAccountBanking(long accountBanking) {
		this.accountBanking = accountBanking;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getTypeBanking() {
		return typeBanking;
	}
	public void setTypeBanking(String typeBanking) {
		this.typeBanking = typeBanking;
	}
	public String moneyToString(double money) {
		NumberFormat formatter= NumberFormat.getInstance();
		String balanceStr=formatter.format(money);
		
		return balanceStr+" VND";
	}
	public void display() {
		if(typeBanking.equalsIgnoreCase("tranfer")) {
			System.out.println("Money : "+"- "+moneyToString(money));
			System.out.println("Note : Tranfer to "+accountBanking+" "+note);
			System.out.println("Time : "+dateToString(date));
			System.out.println("Balance : "+moneyToString(balance));
		}
		else if(typeBanking.equalsIgnoreCase("withdraw")) {
			System.out.println("Money : "+"- "+moneyToString(money));
			System.out.println("Note : Withdraw ");
			System.out.println("Time : "+dateToString(date));
			System.out.println("Balance : "+moneyToString(balance));
		}
		else if(typeBanking.equalsIgnoreCase("deposit")) {
			System.out.println("Money : "+"+ "+moneyToString(money));
			System.out.println("Note : Deposit");
			System.out.println("Time : "+dateToString(date));
			System.out.println("Balance : "+moneyToString(balance));
		}
		else if(typeBanking.equalsIgnoreCase("receive")) {
			System.out.println("Money : "+"+ "+moneyToString(money));
			System.out.println("Note : From "+accountBanking+" "+note);
			System.out.println("Time : "+dateToString(date));
			System.out.println("Balance : "+moneyToString(balance));
		}
	}
	
}
