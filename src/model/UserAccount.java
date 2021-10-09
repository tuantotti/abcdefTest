package model;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserAccount extends Account{
	private long accountNumber;
	private double balance;
	private List<History> historyList;
	
	public UserAccount(String accountName, String address, String phoneNumber, double balance, long accountNumber) {
		super(accountName, address, phoneNumber);
		this.balance=balance;
		this.accountNumber=accountNumber;
		historyList=new ArrayList<History>();
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public List<History> getHistoryList() {
		return historyList;
	}

	public void setHistoryList(List<History> historyList) {
		this.historyList = historyList;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String balanceToString(double balance) {
		NumberFormat formatter= NumberFormat.getInstance();
		String balanceStr=formatter.format(balance);
		
		return balanceStr+" VND";
	}
	public void tranfer(UserAccount u ,double money,String note) {
		if(balance>=money) {
			balance-=money;
			History history=new History(u.getAccountNumber(),money,new Date(),"",balance,"tranfer");
			historyList.add(history);
			
			u.setBalance(u.getBalance()+money);
			History historyReceiver=new History(u.getAccountNumber(),money,new Date(),note,u.getBalance(),"receive");
			u.getHistoryList().add(historyReceiver);
		}
	}

	public void withdraw(double money,String note) {
		if(balance>=money) {
			balance-=money;
			
			History history=new History(this.accountNumber,money,new Date(),note,balance,"withdraw");
			historyList.add(history);
		}
	}
	public void deposit(double money,String note) {
		balance+=money;
				
		History history=new History(this.accountNumber,money,new Date(),note,balance,"deposit");
		historyList.add(history);
	}
	public void displayHistory() {
		for(int i=0;i<historyList.size();i++) {
			historyList.get(i).display();
			System.out.println();
		}
	}
	public void display() {
			super.display();
			System.out.println("Account Number : "+accountNumber);
			System.out.println("Balance : "+balanceToString(balance));
			System.out.println();
	}
	
}
