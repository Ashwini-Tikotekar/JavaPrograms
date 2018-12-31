package com.bridgelabs.algorithmprogram;

import java.util.Scanner;

import com.bridgelab.util.AlgorithmUtility;

public class MergeSort {
	 public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of your array");
         int n=sc.nextInt();
         String arr[]=new String[n];
         System.out.println("Enter the elements");

         for( int i=0;i<n;i++)
         {   
             arr[i]=sc.next();
         }
        
         AlgorithmUtility.mergeSort(arr,0,n);
         System.out.println("Elements after sorting");
         for(int i=0;i<n;i++)
         {
             System.out.print(arr[i]+" ");
             System.out.println();
         }

     }

 }
	


