package com.bridgelabs.algorithmprogram;
/******************************************************************************
 *  Compilation:  javac -d bin   Number  .java
 *  Execution:    java -cp bin com.bridgelabz.util. Number 
 *  Purpose:    takes a command-line argument N, asks you to 
 *  think of a number between 0 and N-1, where N = 2^n, and always
 *   guesses the answer with n questions.
 *  @author  Ashwini Tikotekar
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************/


import com.bridgelab.util.AlgorithmUtility;

public class Number {
	   public static void main(String[] args) {
	        
		    
		    String i=args[0];
		    int n=Integer.parseInt(i);
//		    System.out.println("Enter any Number:");
//		    int n=AlgorithmUtility.intValue();
		    int range=(int)(Math.pow(2,n-1));                //range calculation for the number
		    System.out.println("Take number between '0' to "+range);
		    int count=0;
		    String input="null";
		    int lower=0;
		    int upper=range;
		    int middle=(lower+upper/2);
		    AlgorithmUtility.binarySearch(lower, upper, middle, count, input, count);


		}
	

}
