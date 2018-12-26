package com.bridgelab.util;
import java.util.Scanner;
public class AlgorithmUtility {
	

	private static String[] args;




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
	 public void tempconversion() {
		  
		    System.out.println("Enter the temperature in Fahrenheit: ");
		    Scanner scanner=new Scanner(System.in);
		    float fahrenheit=scanner.nextFloat();
		    float celsius=(fahrenheit-32)*5/9;
		    System.out.println("Temperature in Celsius: "+celsius);
		  }
	 



//sqrt
public static void sqrt(int n) {
	 double c=n;
     double epsilon = 1e-15;    // relative error tolerance
     double t=c;              // estimate of the square root of c

     // repeatedly apply Newton update step until desired precision is achieved
     while (Math.abs(t - c/t) > epsilon*t) {
         t = (c/t + t) / 2.0;
         System.out.println(t);
     }

     // print out the estimate of the square root of c
    
	
	
	
}
}


