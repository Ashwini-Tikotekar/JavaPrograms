package com.bridgelab.util;

public class Dequeue<E> {
		
	    public E data;
	    Dequeue<E>next;
	    Dequeue<E>pre;
	    Dequeue<E> front;
	    Dequeue<E> rear;
	    int size=0;

	    public Dequeue(E val)
	    { 
	        this.data=val;
	        this.next=null;
	        this.pre=null;
	    }
	   
	    public void addFront(E c)
	    {
	        if(front==null)
	        {
	        	Dequeue<E>tNode=new Dequeue<>(c);
	            front=tNode;
	            rear=front;
	        }
	        else 
	        {
	        	Dequeue<E>tNode=new Dequeue<>(c);
	            front.pre=tNode;
	            tNode.next=front;
	            front=tNode;
	        }
	        size++;
	    }
	   

	    public void addRear(E c)
	    {
	        if(front==null)
	        {
	        	Dequeue<E>tNode=new Dequeue<E>(c);
	            front=tNode;
	            rear=front;
	        }
	        else 
	        {
	        	Dequeue<E>tNode=new Dequeue<>(c);
	            rear.next=tNode;
	            tNode.pre=rear;
	            rear=tNode;
	        }
	        size++;
	    }
	   

	    public E removeFront()
	    {
	        E val=null;
	        if(front==null)
	        {
	            System.out.println("No elements to delete");
	        }
	        else
	        {
	            val=front.data;
	            front=front.next;
	        }
	        size--;
	        return val;
	    }
	   

	    public E removeRear()
	    {
	        E val=null;
	        if(front==null)
	        {
	            System.out.println("No element to delete");
	        }
	        else
	        {
	            val=rear.data;
	            rear=rear.pre;
	            rear.next=null;
	        }
	        size--;
	        return val;
	    }
	   

	    public boolean isEmpty()
	    {
	        if(front==null)
	            return true;
	        else
	            return false;
	    }
	 
	    public int size()
	    {
	        return size;
	}
	}





