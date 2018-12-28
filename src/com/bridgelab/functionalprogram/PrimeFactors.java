package com.bridgelab.functionalprogram;
/******************************************************************************
 *  Compilation:  javac -d bin PrimeFactors  .java
 *  Execution:    java -cp bin com.bridgelabz.util.PrimeFactors  
 *  
 *  Purpose: Computes the prime factorization of N using brute force.

 *  @author  Ashwini Tikotekar
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************/

import com.bridgelab.util.FunctionalUtility;

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