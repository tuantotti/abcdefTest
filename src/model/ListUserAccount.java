package model;


import java.util.ArrayList;
import java.util.List;

public class ListUserAccount {
	private List<UserAccount>listUser;
	
	public ListUserAccount() {
		listUser=new ArrayList<UserAccount>();
	}
	public void add(UserAccount u) {
		listUser.add(u);
	}
	public UserAccount search(long accountNumber) {
		UserAccount u=null;
		for(int i=0;i<listUser.size();i++) {
			if(listUser.get(i).getAccountNumber()==accountNumber) {
				u= listUser.get(i);
			}
		}
		return u;
	}
	
	public UserAccount search(String accountName) {
		UserAccount u=null;
		for(int i=0;i<listUser.size();i++) {
			if(listUser.get(i).getAccountName().contains(accountName)) {
				u= listUser.get(i);
			}
		}
		return u;
	}
	public void remove(long accountNumber) {
		for(int i=0;i<listUser.size();i++) {
			if(listUser.get(i).getAccountNumber()==accountNumber) {
				listUser.remove(i);
			}
		}
	}
	public void update(int index,long accountNumber) {
		listUser.set(index, search(accountNumber));
	}
	public void update(int index,UserAccount u) {
		listUser.set(index, u);
	}
	public void display() {
		for(int i=0;i<listUser.size();i++) {
			listUser.get(i).display();
		}
	}
}

