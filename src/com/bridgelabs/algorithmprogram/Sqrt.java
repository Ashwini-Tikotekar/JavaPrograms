package com.bridgelabs.algorithmprogram;

import java.util.Scanner;

import com.bridgelab.util.AlgorithmUtility;

public class Sqrt {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		AlgorithmUtility.sqrt(n);
		
	}

}
