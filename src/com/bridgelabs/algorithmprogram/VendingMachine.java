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

public class VendingMachine {
	

	public static void main(String[] args)
	{
		AlgorithmUtility au= new AlgorithmUtility();
		//ask the user enter the money
		int[] notes= { 1000,500,100,50,10,5,2,1};
		System.out.print("Enter the Amount:");
		
		int money =AlgorithmUtility.intValue();
		
		
		 
	// Creating The Object of Vending MAchine class
	 
	 au.calculate(money, notes);	//System.out.println("Total Number of Notes are :"+total);
	}
	
	//decimaltobinary
public void decimaltobinary() {
	Scanner in = new Scanner(System.in);
	 
    // Create Stack object
    Stack<Integer> stack = new Stack<Integer>();
 
    // User input 
    System.out.println("Enter decimal number: ");
    int num = in.nextInt();
 
    while (num != 0)
    {
      int d = num % 2;
      stack.push(d);
      num /= 2;
    } 
 
    System.out.print("\nBinary representation is:");
    while (!(stack.isEmpty() ))
    {
      System.out.print(stack.pop());
    }
    System.out.println();
  }
	
	
	
	
	
}
	