package com.bridgelabs.algorithmprogram;
/******************************************************************************
 *  Compilation:  javac -d bin   Anagram  .java
 *  Execution:    java -cp bin com.bridgelabz.util. Anagram
 *  Purpose: The Two Strings are Anagram or not....

 *  @author  Ashwini Tikotekar
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************/


import java.util.Scanner;

import com.bridgelab.util.FunctionalUtility;

public class Anagram {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string1");
	String s1=s.next();
	Scanner n=new Scanner(System.in);
	System.out.println("Enter the string2");
	String s2=s.next();
	FunctionalUtility a=new FunctionalUtility();
	a.Anagram( s1, s2);
		
}
}
		
	


