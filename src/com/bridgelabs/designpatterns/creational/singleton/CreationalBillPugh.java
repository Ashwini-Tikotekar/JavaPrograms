package com.bridgelabs.designpatterns.creational.singleton;

public class CreationalBillPugh {
	public  static void main(String[] args) {
		BillPughSingleton billpugh1=BillPughSingleton.getInstance();	
		System.out.println(billpugh1);
		BillPughSingleton billpugh2=BillPughSingleton.getInstance();	
		System.out.println(billpugh2);

	}
}
