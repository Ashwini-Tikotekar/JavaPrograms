package com.bridgelab.functionalprogram;
/******************************************************************************
 *  Compilation:  javac -d bin  Triplet   .java
 *  Execution:    java -cp bin com.bridgelabz.util.Triplet
 *  
 *  Purpose:  Read in N integers and counts the   number 
 *  of triples that sum to exactly 0.
 *  @author  Ashwini Tikotekar
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgelab.util.FunctionalUtility;

public class Triplet {
	public static void main(String[] args)
	{
		   
		int n;
		List<String> tripletList=new ArrayList<>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the value of n");
		n = scanner.nextInt();
				
		
		int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        System.out.println("Enter the array element at position "+ i);
		        arr[i]=scanner.nextInt();
            
		    }
		    
		    tripletList = FunctionalUtility.sumOfThree(arr);   
		    if(tripletList.isEmpty()) {
		    	System.out.println("no elements found");	
		    }
		    else
		    System.out.println(tripletList);

	}
	
     

}
