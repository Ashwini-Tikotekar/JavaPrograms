package com.bridgelabs.datastructureprogram;

import java.util.NoSuchElementException;

import com.bridgelab.util.DataStructureUtility;


public class Queue {
	class Node1
	{
		protected int data;
	    protected Node1 link;
	 
	    /*  Constructor  */
	    public Node1()
	    {
	        link = null;
	        data = 0;
	    }  
	    
	    /* Parameterized Constructor  */
	    public Node1(int d,Node1 n)
	    {
	        data = d;
	        link = n;
	    }  
	    
	    /*  Function to set data to current Node  */
	   	public void setData(int d)
	    {
	        data = d;
	    }   
	    
	   	/*  Function to get link to next node  */
	   	public Node1 getLink()
	    {
	     	return link;
	    }  
	    
		/*  Function to set link to next Node  */
	    public void setLink(Node1 n)
	    {
	        link = n;
	    }  

	    /*  Function to get data from current Node  */
	    public int getData()
	    {
	        return data;
	    }
	}
	 
	/*  Class linkedQueue  */
	public class CashCounterLogic
	{
		public Node1 front, rear;
	    public int size;
	 
	    /* Constructor */
	    public CashCounterLogic()
	    {
	        front = null;
	        rear = null;
	       int size =0;
	    }    
	    
	    /*  Function to check if queue is empty */
	    public boolean isEmpty()
	    {
	        return front == null;
	    }   
	    
	    /*  Function to get the size of the queue */
	    public int getSize()
	    {
	        return size;
	    }    
	    
	    /*  Function to insert an element to the queue */
	    public void insert(int data)
	    {
	        Node1 node = new Node1(data, null);
	        if (rear == null)
	        {
	            front = node;
	            rear = node;
	        }
	        else
	        {
	            rear.setLink(node);
	            rear = rear.getLink();
	        }
	        size++ ;
	    }   
	    
	    /*  Function to remove front element from the queue */
	   	public int remove()
	    {
	        if (isEmpty())
			{
	        	throw new NoSuchElementException("Underflow Exception");
			}
	        Node1 ptr = front;
	        front = ptr.getLink();        
	        if (front == null)
			{
	            rear =null;
				size-- ; 
			}       
	        return ptr.getData();
	    }    
	    
	    /*  Function to check the front element of the queue */
	    public int peek()
	    {
	        if (isEmpty())
			{
	            throw new NoSuchElementException("Underflow Exception");
			}
	        return front.getData();
	    }    
	    
	    /*  Function to display the status of the queue */
	    public void display()
	    {  
			int ptr1=0;
	        System.out.print("Available Balance = ");
	        if (size == 0)
	        {
	            System.out.print("Empty");
	            return ;
	        }
	        Node1 ptr = front;
	        while (ptr != rear.getLink() )
	        { 
	        	ptr1=ptr1+ptr.getData();
	        	System.out.println(ptr1);
	            ptr = ptr.getLink();
	        }
	        System.out.println();        
	    }
	}

}


