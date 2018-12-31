package com.bridgelab.functionalprogram;
/******************************************************************************
 *  Compilation:  javac -d bin FlipCoin .java
 *  Execution:    java -cp bin com.bridgelabz.util. FlipCoin
 *  
 *  Purpose:  Flip Coin and print percentage of Heads and Tails

 *  @author  Ashwini Tikotekar
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************/


import java.util.Scanner;

import com.bridgelab.util.FunctionalUtility;

public class FlipCoin {
	public static void main(String[] args){

		Scanner s=new Scanner(System.in);
		System.out.println("enter number of times the coin has to be flipped");
		int count=s.nextInt();
		FunctionalUtility fp=new FunctionalUtility();
		fp.flipCoin(count);
	}

}
