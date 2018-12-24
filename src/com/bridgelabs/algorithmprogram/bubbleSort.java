package com.bridgelabs.algorithmprogram;

import java.util.Scanner;

import com.bridgelab.util.AlgorithmUtility;

public class bubbleSort {
	public static void main(String[] args) {
		
		AlgorithmUtility b= new AlgorithmUtility();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n=s.nextInt();
		int array[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{
			array[i]=s.nextInt();
		}
		
		int[] arr=b.bubbleSort(array);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
