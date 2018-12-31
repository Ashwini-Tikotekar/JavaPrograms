package com.bridgelab.functionalprogram;
/******************************************************************************
 *  Compilation:  javac -d bin   StopWatch   .java
 *  Execution:    java -cp bin com.bridgelabz.util.StopWatch 
 *  
 *  Purpose:  measuring the time that elapses between the start and end clicks



 *  @author  Ashwini Tikotekar
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************/


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
		startTimer=FunctionalUtility.start();
		System.out.println("enter a number to start");
		startChoice=sc.nextInt();
	    System.out.println("enter a number to Stop");
		stopChoice=sc.nextInt();
		stopTimer=FunctionalUtility.stop();			
		System.out.println("elapsed time = "+(FunctionalUtility.getElapsedTime(startTimer,stopTimer)/1000)+" sec");
		
		
		
		}
		
	
	}
	
	
	
	

		
		
		
	
