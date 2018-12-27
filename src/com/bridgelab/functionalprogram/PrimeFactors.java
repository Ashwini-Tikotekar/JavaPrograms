package com.bridgelab.functionalprogram;

import java.util.Scanner;

import com.bridgelab.util.FunctionalUtility;

public class PrimeFactors {
	
	public static void main(String args[])
	 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any Number to find Prime Factors ");   //
	int number=sc.nextInt();
	System.out.println("Given Number is : " + number);
	System.out.print("Prime Factors are : " );
	FunctionalUtility.primeFactors(number);

}
}