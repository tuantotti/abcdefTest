package run;


import model.*;

public class Main {

	public static void main(String[] args) {
		AdminAccount list=new AdminAccount();
		UserAccount u1=new UserAccount("Tuan","Ha Noi","012345678",1000000000,123000);
		UserAccount u2=new UserAccount("Dat","Hai Phong","099999999",200000000,222000);
		
//		list.add(u1);
//		list.add(u2);
		u1.tranfer(u2, 9000000, "Tuan chuyen khoan");
		u1.deposit(7000000, "");
		u1.withdraw(8000000, "");
		
		u2.tranfer(u1, 2000000, "Dat chuyen khoan");
		u2.deposit(3000000, "");
		u2.withdraw(4000000, "");
		
		System.out.println("--------------dat-----------");
		u2.displayHistory();
		System.out.println("---------------tuan----------");
		u1.displayHistory();
//		System.out.println("-----------------------------");
//		list.display();
	}

}
