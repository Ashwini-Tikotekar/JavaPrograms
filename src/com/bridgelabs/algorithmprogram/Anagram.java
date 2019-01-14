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

import com.bridgelab.util.AlgorithmUtility;

public class Anagram {
	public static void main(String[] args) {
		System.out.println("Enter the first string");
		String str1 = AlgorithmUtility.StringValue();
		System.out.println("Enter the second string");
		String str2 = AlgorithmUtility.StringValue();
		boolean b1 = AlgorithmUtility.anagram(str1, str2);
		System.out.println();
		if (b1 == true) {
			System.out.println("the given two strings " + str1 + " and " + str2 + " are anagram");
		} else
			System.out.println("the given two strings " + str1 + " and " + str2 + " are not an anagram");
	}
}






