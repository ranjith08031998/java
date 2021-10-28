package com.cg.oct12.batch3;
class Hdfc{
	static String ifsc;
	double balance;
	void checkbalance() {
		System.out.println(this.balance);
	}
}
public class Bankdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hdfc obj=new Hdfc();
obj.balance=1000;
obj.checkbalance();

	}

}
