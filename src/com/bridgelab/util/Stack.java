package com.bridgelab.util;

public  class Stack {
		private long[] stackArray;
		private int top;

		//for size  
		public Stack()
		{
			stackArray = new long[100];
			top = -1;
		}
		//for push   
		public void push(long j)
		{
			stackArray[++top] = j;
		}
		//for pop   
		public long pop() 
		{
			return stackArray[top--];
		}
		//for peek   
		public long peek() 
		{
			return stackArray[top];
		}
		//to check whether stack is empty	   
		public boolean isEmpty()
		{
			return (top == -1);
		}  
	
	}




