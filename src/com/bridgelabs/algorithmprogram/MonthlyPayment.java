package com.bridgelabs.algorithmprogram;
/******************************************************************************
 *  Compilation:  javac -d bin   MonthlyPayment  .java
 *  Execution:    java -cp bin com.bridgelabz.util. MonthlyPayment 
 *  Purpose:   monthlyPayment that reads in three command-line arguments
 *   P, Y, and R 
 *  @author  Ashwini Tikotekar
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************/

import com.bridgelab.util.AlgorithmUtility;

public class MonthlyPayment {
	public static void main(String[] args) {
		System.out.println("enter the value of p");
		int P=AlgorithmUtility.intValue();
		System.out.println("enter the value of r");
		double R=AlgorithmUtility.doubValue();
		System.out.println("enter the value of y");
		int Y=AlgorithmUtility.intValue();
		AlgorithmUtility.monthlyPayment(P, R, Y);
	}

}
