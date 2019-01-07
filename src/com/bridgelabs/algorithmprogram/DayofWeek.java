package com.bridgelabs.algorithmprogram;

import java.util.Scanner;

import com.bridgelab.util.AlgorithmUtility;

public class DayofWeek {
	public static void main(String[] args)
	{
		String[] day= {"sunday","monday","tuesday","wednesday","thrusday","friday","saturday"};
		Scanner s=new Scanner(System.in);
		System.out.println("enter the date d");
		int m=AlgorithmUtility.intValue();
		System.out.println("enter the month m");
		int d=AlgorithmUtility.intValue();
		System.out.println("enter the year y");
		int y=AlgorithmUtility.intValue();
		System.out.println();
		
		int days=AlgorithmUtility.dayOfWeek(d, m, y);
		System.out.println("the day of week is " + day [days]);
		
	}
}
