package com.bridgelabs.algorithmprogram;
/******************************************************************************
 *  Compilation:  javac -d bin    InsertionSort  .java
 *  Execution:    java -cp bin com.bridgelabz.util. InsertionSort 
 *  Purpose:  Reads in strings from standard input and prints them 
 *  in sorted order.
 *  @author  Ashwini Tikotekar
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************/


import java.util.Scanner;

import com.bridgelab.util.AlgorithmUtility;

public class InsertionSort {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the size of your array");
	        int n=sc.nextInt();
	        String arr[]=new String[n];
	        System.out.println("Enter the elements");

	        for( int i=0;i<n;i++)
	        {   
	            arr[i]=sc.next();
	        }
	       

	        String sortedArray[] = AlgorithmUtility.insertionSort(arr, n);
	        for(int i=0;i<sortedArray.length;i++){
	        System.out.println(sortedArray[i]);
	        }

	    }
		
	}


