package com.bridgelabs.algorithmprogram;

import java.util.Scanner;
import java.util.Stack;

import com.bridgelab.util.AlgorithmUtility;

public class DecimaltoBinary {
	public static void main(String[] args) {
		

		System.out.println("Enter the number");
        int num = AlgorithmUtility.intValue();
        int[] binary = AlgorithmUtility.toBinary(num);// to call method
        for (int i = binary.length - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }

    }
		}
	


