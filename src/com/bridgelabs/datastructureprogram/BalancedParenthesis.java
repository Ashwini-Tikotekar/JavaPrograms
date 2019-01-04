package com.bridgelabs.datastructureprogram;

import com.bridgelab.util.Stack;

import com.bridgelab.util.DataStructureUtility;



public class BalancedParenthesis {
	public static void main(String[] args){
		Stack stack=new Stack();

		/* Accepting expression */
		System.out.println("Enter expression: ");
		String exp =DataStructureUtility.StringValue();        
		int len = exp.length();
		System.out.println("Matches and Mismatches: ");
		for (int i = 0; i < len; i++)
		{    
		char ch = exp.charAt(i);

			if (ch == '(')
			{
				stack.push(i);
			}
				else if (ch == ')')
				{
					try
					{
					long p =stack.pop()+ 1 ;
					System.out.println("')' at index "+(i+1)+" matched with '(' at index "+p);
					}catch(Exception e){
					System.out.println("')' at index "+(i+1)+" is unmatched");
					}
				}            
			}
		while (!stack.isEmpty() )
		{
		System.out.println("'(' at index "+(stack.pop() +1)+" is unmatched");
		}                          
    }
 }

   