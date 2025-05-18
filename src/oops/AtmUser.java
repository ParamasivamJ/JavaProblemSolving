package oops;

public class AtmUser {

	public static void main(String[] args) {
		Atm user1=new Atm(1000,123);
		//System.out.print(user1.getMoney());
		user1.setMoney(12000);
		System.out.print(user1.getMoney());
	}

}
