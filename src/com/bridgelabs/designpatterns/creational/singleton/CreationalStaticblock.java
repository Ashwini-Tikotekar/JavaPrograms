package com.bridgelabs.designpatterns.creational.singleton;

public class CreationalStaticblock {
	public static void main(String[] args)
	{  
		System.out.println("Welcome to static block");
		StaticBlockSingleton staticinstance1=StaticBlockSingleton.getInstance();
        System.out.println(staticinstance1);
    	StaticBlockSingleton staticinstance2=StaticBlockSingleton.getInstance();
		System.out.println(staticinstance2);
	}
}
