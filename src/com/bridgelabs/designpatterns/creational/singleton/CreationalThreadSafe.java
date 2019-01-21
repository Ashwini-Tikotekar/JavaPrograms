package com.bridgelabs.designpatterns.creational.singleton;

public class CreationalThreadSafe {
	public static void main(String[] args) {
		ThreadSafeSingleton thread1=ThreadSafeSingleton.getInstance();
		System.out.println(thread1);
		ThreadSafeSingleton thread2=ThreadSafeSingleton.getInstance();
		System.out.println(thread2);
		ThreadSafeSingleton thread3=ThreadSafeSingleton. getInstanceUsingDoubleLocking();
		System.out.println(thread3);
		
	}
}
