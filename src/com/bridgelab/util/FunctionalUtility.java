package com.bridgelab.util;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FunctionalUtility {

	public void replacestring(String s) {
		if (s.length() >= 3) {
			System.out.println(s.replaceAll("username", "ash"));

		} else
			System.out.println("please enter more than three characters");
	}

	public void LeapYear() {
		int year = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter any year");
		year = s.nextInt();
		s.close();

		if (String.valueOf(year).length() == 4) {
			if (year % 4 == 0 && year % 400 == 0) {
				System.out.println("year is leap year");
			} else if (year % 100 == 0) {
				System.out.println("year is not leap year");
			} else {
				System.out.println("year is not leap year");
			}
		}
	}
	public void power()
	{

		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int count=0;
		if(n>0 && n<31)
		{
			for(int i=0;i<n;i++)
			{
				System.out.println(Math.pow(2,count));
				count++;

			}

		}

		else{
			System.out.println("out of range");




		}
	}


	public void harmonic()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int i;
		float sum=0;




		for(i=1;i<=n;i++)
		{
			sum=sum+(float)1/i;
		}

		System.out.println(sum);
	}

	public void Prime(){    

		int i,m=0,flag=0;      
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();   
		m=n/2;      
		if(n==0||n==1){  
			System.out.println(n+" is not prime number");      
		}else{  
			for(i=2;i<=m;i++){      
				if(n%i==0){      
					System.out.println(n+" is not prime number");      
					flag=1;      
					break;      
				}      
			}      
			if(flag==0)  { System.out.println(n+" is prime number"); }  
		}
		System.out.print("Factors of " + n + " are: ");
		for(int i1 = 1; i1 <= n; ++i1) {
			if (n % i1 == 0) {
				System.out.print(i1 + " ");

			}
		}
	}

	public void FlipCoin(int count)
	{
		int head=0;
		int tail=0;
		int i=count;
		Random result=new Random();
		while(count>0){
			int r=result.nextInt(2);
			if(r==0)
				tail++;
			else
				head++;
			count--;
		}

		System.out.println("Number of heads="+head*100/i);
		System.out.println(head);
		System.out.println(tail);

		System.out.println("Number of tails="+tail*100/i);
	}

public void Gambler()
{
int win=0;
int loss=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the goal");
int goal=s.nextInt();
System.out.println("Enter the stake");
int stake=s.nextInt();
System.out.println("Enter the no of times");
int n=s.nextInt();
for(int i=1;i<=n;i++){
	int cash=stake;
	while(cash>0 && cash<goal)
	{
		if(Math.random()<0.5)
		{
			cash++;
		}
		else{
			cash--;
	}
	if(cash==goal){
		win++;
	}
	else
		loss++;
		
	
	}

	System.out.println(100*win/n);
	System.out.println(100*loss/n);
}
}

	
public void Anagram(String string1, String string2) 
{  
	


	String s1 = string1.replaceAll("\\s", "");  
    String s2 = string2.replaceAll("\\s", "");  
    boolean status = true; 
	        if (s1.length() != s2.length()) {  
	            status = false;  
	        } else {  
	            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
	            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
	            Arrays.sort(ArrayS1);  
	            Arrays.sort(ArrayS2);  
	            status = Arrays.equals(ArrayS1, ArrayS2);  
	        }  
	        if (status) {  
	            System.out.println(s1 + " and " + s2 + " are anagrams");  
	        } else {  
	            System.out.println(s1 + " and " + s2 + " are not anagrams");  
	        }  
	    }  
	   
}
	 
	
		
		
		
		
		
		
		
		
		
		
		
		
		






