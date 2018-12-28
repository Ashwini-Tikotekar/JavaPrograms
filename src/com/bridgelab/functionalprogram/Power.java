package com.bridgelab.functionalprogram;
/******************************************************************************
 *  Compilation:  javac -d bin power.java
 *  Execution:    java -cp bin com.bridgelabz.util.power
 *  
 *  Purpose:This program takes a command-line argument N and prints  
 *  a table of the powers of 2 that are less than or equal to 2^N.

 *  @author  Ashwini Tikotekar
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************/

import com.bridgelab.util.FunctionalUtility;

public class Power {
	public static void main(String[] args){
		FunctionalUtility p= new FunctionalUtility();
		p.power();
	}
}
