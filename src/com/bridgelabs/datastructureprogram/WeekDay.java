package com.bridgelabs.datastructureprogram;

import com.bridgelab.util.AlgorithmUtility;
import com.bridgelab.util.FunctionalUtility;
import com.bridgelab.util.QueueLinkedList;

public class WeekDay {
	
	
	 public static void main(String[] args) {
	        int month = Integer.parseInt(args[0]);
	        int year = Integer.parseInt(args[1]);
	        String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
	                "October", "November", "December" };
	        int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	        
	        //Method 1- using function of FunctionalUtility class of
	        //com.bridgelabz.util package
	        
	        if (month == 2 )
	        {
	        	if(FunctionalUtility.leapYear())
	        	{
	        		days[month] = 29;
	        	}
	        }
	        	
	        System.out.println("\t\t " + months[month] + " " + year);
	        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
	        
	        //Method 2- using function of AlgorithmUtility class of
	        //com.bridgelabz.util package
	        int d = AlgorithmUtility.dayOfWeek(month, 1, year);
	        
	        //Customized Queue
	        QueueLinkedList<QueueLinkedList<Integer>>customQueue = new QueueLinkedList<QueueLinkedList<Integer>>();
	        QueueLinkedList<Integer> queue = new QueueLinkedList<Integer>();
	        
	        for (int i = 0; i < d; i++)
	            System.out.print("\t");
	        for (int i = 1; i <= days[month]; i++) {
	            
	            //Method 3- using function of Queue class of
	            //com.bridgelabz.util package
	            queue.enqueue(i);
	            if (((i + d) % 7 == 0) || (i == days[month])) {
	                customQueue.enqueue(queue);
	                queue = new QueueLinkedList<Integer>();
	                continue;
	            }
	        }
	        
	        //Method 4- using function of Queue class of
	        //com.bridgelabz.util package
	        for (int i = 0; i < customQueue.getSize(); i++) {
	            
	            //Method 5- using function of Queue class of
	            //com.bridgelabz.util package
	            QueueLinkedList<Integer> week = customQueue.dequeue();
	            
	            for (int j = 0; j < week.getSize(); j++) {
	                System.out.print(week.dequeue() + "\t");
	            }
	            System.out.println();
	        }

	    }
	}

