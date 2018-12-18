package com.bridgelab.util;

import java.util.Scanner;

public class FunctionalUtility {

	public void replacestring(String s) {
		if (s.length() >= 3) {
			System.out.println(s.replaceAll("username", "ash"));

		} else
			System.out.println("please enter more than three characters");
	}

	public void LeapYear() {
		int year = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter any year");
		year = s.nextInt();
		s.close();
		
		if (String.valueOf(year).length() == 4) {
			if (year % 4 == 0 && year % 400 == 0) {
				System.out.println("year is leap year");
			} else if (year % 100 == 0) {
				System.out.println("year is not leap year");
			} else {
				System.out.println("year is not leap year");
			}
		}
	}
}
