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
	public static void main(String[] args)
    {
       
            AlgorithmUtility u = new AlgorithmUtility();
            System.out.println("Enter any Number:");
            int n= AlgorithmUtility.intValue();
            int range=(int)(Math.pow(2,n-1));             
            System.out.println("Take number between 1 to "+range);
        int    count=0, low=0;
        String value=null;
        int up=range;
        int mid=(low+up/2);   
       
          u.findNumber(value,low,  up,  mid, count, n);
        }
	
	

}
