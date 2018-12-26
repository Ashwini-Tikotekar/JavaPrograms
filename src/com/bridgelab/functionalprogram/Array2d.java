package com.bridgelab.functionalprogram;

import java.util.Scanner;

import com.bridgelab.util.FunctionalUtility;

public class Array2d {
	public static void main(String[]args) {
		FunctionalUtility u=new FunctionalUtility();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the rows");
		int m=s.nextInt();
		System.out.println("enter the coloumns");
		int n=s.nextInt();
	
		int[][] a=u.arrayInt(m, n);
		double[][] b=u.arrayDouble(m, n);
		boolean[][] c=u.arrayBoolean(m, n);
		u.display(a, b, c, m, n);
		
				
	}

	

}
