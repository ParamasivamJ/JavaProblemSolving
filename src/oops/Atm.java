package oops;
import java.util.Scanner;

public class Atm {
	private int money;
	private int pin;
	
	Atm(){
		
	}
	
	Atm(int money,int pin){
		setMoney(money);
		this.pin=pin;
	}
	
	private void setMoney(int money){
		this.money=money;
		}
	
	void setMoney(int money, int pin){		//Deposit
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the PIN: ");
		pin=sc.nextInt();
		
		if(this.pin==pin) {
			this.money+=money;
			System.out.println("Money deposited Successfully");
			}
		else {
			System.out.println("Ivalid pin");
			}
		}
	
	int getMoney() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the PIN: ");
		int pin=sc.nextInt();
		
		if(this.pin==pin) {
			return money;
			}
		else {
			System.out.println("Ivalid pin");
			return 0;
			}
	}
}
