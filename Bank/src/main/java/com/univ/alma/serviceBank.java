package com.univ.alma;

public class serviceBank {
	
	private double money = 1000;
	
	public double getMoney() {
		return this.money;
	}
	
	public void updateMoney(double newMoney) {
		this.money = newMoney;
	}
	
	public boolean payTransaction(double price) {
		if(getMoney() > price){
			updateMoney(getMoney() - price);
			return true;
		}
		else
			return false;
	}
	
}
