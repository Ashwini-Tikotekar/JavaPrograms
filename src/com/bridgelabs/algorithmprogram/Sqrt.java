package com.bridgelabs.algorithmprogram;

/******************************************************************************
 *  Compilation:  javac -d bin  Sqrt.java
 *  Execution:    java -cp bin com.bridgelabz.util. Sqrt
 *  Purpose:    sqrt  to compute the square root of a 
 *  nonnegative number c given in the input using Newton's method:
 *  @author  Ashwini Tikotekar
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************/


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
