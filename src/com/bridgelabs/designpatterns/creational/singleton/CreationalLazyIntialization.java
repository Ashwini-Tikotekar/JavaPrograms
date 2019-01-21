package com.bridgelabs.designpatterns.creational.singleton;

public class CreationalLazyIntialization {
	public static void main(String[] args) 
	{
		LazyInitializedSingleton instance1=LazyInitializedSingleton.getInstance();
		System.out.println(instance1);

		LazyInitializedSingleton instance2=LazyInitializedSingleton.getInstance();
		System.out.println(instance2);
	}

}
