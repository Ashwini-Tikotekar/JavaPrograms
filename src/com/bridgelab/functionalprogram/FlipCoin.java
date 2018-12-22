package com.bridgelab.functionalprogram;

import java.util.Scanner;

import com.bridgelab.util.FunctionalUtility;

public class FlipCoin {
	public static void main(String[] args){

		Scanner s=new Scanner(System.in);
		System.out.println("enter number of times the coin has to be flipped");
		int count=s.nextInt();
		FunctionalUtility fp=new FunctionalUtility();
		fp.FlipCoin(count);
	}

}
