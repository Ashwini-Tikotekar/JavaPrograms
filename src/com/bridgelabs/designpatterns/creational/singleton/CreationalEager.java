package com.bridgelabs.designpatterns.creational.singleton;



public class CreationalEager {

	public static void main(String[] args) {
		
		System.out.println(EagerInitialization.getInstance());
		System.out.println(EagerInitialization.getInstance());
		
	}
}