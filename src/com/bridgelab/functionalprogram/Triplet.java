package com.bridgelab.functionalprogram;

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
				
		 int n1 = 0;
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
