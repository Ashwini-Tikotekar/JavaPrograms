package com.bridgelab.util;

import java.util.Scanner;

//import com.bridgelabs.datastructureprogram.BalancedParenthesis.Node;


public class DataStructureUtility
{
	static Scanner sc = new Scanner(System.in);

	public static int intValue()
	{


		return sc.nextInt();
	}


	public static double doubleValue()
	{
		return sc.nextDouble();
	}


	public static String StringValue()
	{

		return sc.next();
	}
	public static boolean booleanvalue()
	{
		return sc.hasNextBoolean();
	}

}