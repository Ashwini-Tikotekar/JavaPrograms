package com.bridgelabs.datastructureprogram;

import com.bridgelab.util.StackLinkedList;

import com.bridgelab.util.DataStructureUtility;
import com.bridgelab.util.Node;


public class BalancedParenthesis {
	public static void main(String[] args){
		StackLinkedList stack=new StackLinkedList();

		/* Accepting expression */
		System.out.println("Enter expression: ");
		String exp =DataStructureUtility.StringValue();        
		int len = exp.length();
		System.out.println("Matches and Mismatches: ");
		for(int i = 0; i < len; i++)
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
					Object p =stack.pop();
					System.out.println("balanced");
					}catch(Exception e){
					System.out.println("unbalanced");
					}
				}            
			}
		while (!stack.isEmpty() )
		{
		System.out.println("unbalanced");
		break;
		}                          
    }
 }

   