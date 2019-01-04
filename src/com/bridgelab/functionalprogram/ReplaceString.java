package com.bridgelab.functionalprogram;
/******************************************************************************
 *  Compilation:  javac -d bin   ReplaceString  .java
 *  Execution:    java -cp bin com.bridgelabz.util.ReplaceString  
 *  
 *  Purpose:  User Input and Replace String Template “Hello <<UserName>>
 *   How are you?” 


 *  @author  Ashwini Tikotekar
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************/

import com.bridgelab.util.FunctionalUtility;

public class ReplaceString {

	public static void main(String[] args) {
		  String str ="hello <<username>>,how are you";
	        System.out.println("Enter the username");
	        
	        FunctionalUtility.replaceString(str);
	}

}