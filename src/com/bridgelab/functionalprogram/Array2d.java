package com.bridgelab.functionalprogram; 
/******************************************************************************
 *  Compilation:  javac -d bin  Array2d .java
 *  Execution:    java -cp bin com.bridgelabz.util. Array2d 
 *  
 *  Purpose: 2d Array
 *
 *  @author  Ashwini Tikotekar
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************/

import java.util.Scanner;

import com.bridgelab.util.FunctionalUtility;

public class Array2d {
	public static void main(String[]args) {
		 FunctionalUtility u=new FunctionalUtility();
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int n = sc.nextInt();
       
        //calling methods
        int [][] a = u.arrayInt(m,n);
        double [][] b = u.arrayDouble(m,n);
        String [][] c = u.arrayBoolean(m,n);
               
        //calling method
        FunctionalUtility.display(a,b,c,m,n);

       
    }
				
	}

	


