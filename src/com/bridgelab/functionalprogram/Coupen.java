package com.bridgelab.functionalprogram;

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
