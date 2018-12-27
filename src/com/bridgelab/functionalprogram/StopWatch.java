package com.bridgelab.functionalprogram;

import java.util.Scanner;

import com.bridgelab.util.FunctionalUtility;

public  class StopWatch {
	public static void main(String[] args)
	{
		long startTimer=0;
		long stopTimer=0;
		int startChoice=1;
        int stopChoice=0;
		
    	
		Scanner sc= new Scanner(System.in);
		
        	
		System.out.println("enter 1 to start");
		startChoice=sc.nextInt();
		 if(startChoice==1) {	
	    startTimer=FunctionalUtility.start();
         }
	    else {
	     System.out.println("enter the valid choice");
	    }
		
	    System.out.println("enter 2 to Stop");
		stopChoice=sc.nextInt();
			stopTimer=FunctionalUtility.stop();
		
		
		
		long n=FunctionalUtility.getElapsedTime(startTimer, stopTimer);
		System.out.println("value of n"+n);
		}
		
	
	}
	
	
	
	

		
		
		
	
