package com.bridgelab.functionalprogram; 
/******************************************************************************
 *  Compilation:  javac -d bin  Coupen .java
 *  Execution:    java -cp bin com.bridgelabz.util.  Coupen
 *  
 *  Purpose:  Given N distinct Coupon Numbers, how many random numbers 
 *  do you need to generate distinct coupon number? 
 *  This program simulates this random process.

 *
 *  @author  Ashwini Tikotekar
 *  @version 1.0
 *  @since   27-12-2018
 *
 ******************************************/


import java.util.Scanner;

import com.bridgelab.util.FunctionalUtility;

public class Coupen {
	
	  public static void main(String[] args)
	  {
	      Scanner sc=new Scanner(System.in);
	        System.out.println("Enter total number of coupens");
	        int n=sc.nextInt();
	        FunctionalUtility utility = new FunctionalUtility();       
	        //printing the result
	        System.out.println("total distinct number required are="+ utility.couponNumber(n));
	         sc.close();
	     
	  }


	

}
