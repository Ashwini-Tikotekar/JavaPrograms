package com.bridgelab.util;
import java.util.Scanner;
public class AlgorithmUtility {
	

	public void Prime()
	{
	   
	        
		int start=1, end=1000, i, j, count=0;

        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter the Range :\n");
		
        System.out.print("Enter Starting Number : ");
        start = scan.nextInt();
        System.out.print("Enter Ending Number : ");
        end = scan.nextInt();
	        System.out.print("Prime Numbers Between " + start + " and " +end+ " is :\n");
	        for(i=start; i<=end; i++)
	        {
	            count = 0;
	            for(j=2; j<i; j++)
	            {
	                if(i%j == 0)
	                {
	                    count++;
	                    break;
	                }
	            }
	            if(count == 0)
	            {
	                System.out.print(i + " ");
	            }
	        }
	}
   
	 public int[] bubbleSort(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i = 0; i < n; i++) 
	            for (int j = i+1; j < n; j++) 
	                if (arr[i] > arr[j]) 
	                { 
	                    // swap arr[j+1] and arr[i] 
	                    int temp = arr[i]; 
	                    arr[i] = arr[j]; 
	                    arr[j] = temp; 
	                } 
	        return arr;
	    } 	        
	        

public static void countCurrency(int amount) 
{ 
    int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10, 5, 1 }; 
    int[] noteCounter = new int[9]; 
   
    // count notes using Greedy approach 
    for (int i = 0; i < 9; i++) { 
        if (amount >= notes[i]) { 
            noteCounter[i] = amount / notes[i]; 
            amount = amount - noteCounter[i] * notes[i]; 
        } 
    } 
   
    // Print notes 
    System.out.println("Currency Count ->"); 
    for (int i = 0; i < 9; i++) { 
        if (noteCounter[i] != 0) { 
            System.out.println(notes[i] + " : "
                + noteCounter[i]); 
        } 
 }
}
}