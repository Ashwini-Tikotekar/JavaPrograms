package com.bridgelab.functionalprogram;

import java.util.Scanner;

import com.bridgelab.util.FunctionalUtility;

public class Gambler {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the player stack"); 
        int stack=sc.nextInt();
        System.out.println("Enter the Goal");
        int goal=sc.nextInt();
        System.out.println("Enter the totalTimes");
        int totalTimes=sc.nextInt();
        FunctionalUtility utility = new FunctionalUtility();
      //calling the method
        utility.Gambler(stack, goal, totalTimes);   
        
		
	}

}
