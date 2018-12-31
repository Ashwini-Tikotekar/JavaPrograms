package com.bridgelabs.algorithmprogram;
/******************************************************************************
 *  Compilation:  javac -d bin  VendingMachine .java
 *  Execution:    java -cp bin com.bridgelabz.util.VendingMachine 
 *  Purpose:   to calculate the minimum number of Notes as well as 
 *  the Notes to be returned by the Vending Machine as a Change
 *  @author  Ashwini Tikotekar
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************/

import java.util.Scanner;
import java.util.Stack;

import com.bridgelab.util.AlgorithmUtility;
import com.bridgelab.util.FunctionalUtility;

public class VendingMachine {
	

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the money in Rs");
        int money=in.nextInt();
        int[] notes = { 2000,500,100,50,10,5,2,1};
        System.out.println("the different notes present is");
        AlgorithmUtility.calculate(money, notes);

	}
}
	