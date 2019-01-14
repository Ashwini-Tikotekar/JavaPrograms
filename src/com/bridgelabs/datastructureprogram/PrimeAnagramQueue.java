package com.bridgelabs.datastructureprogram;

import java.util.ArrayList;
import java.util.List;

import com.bridgelab.util.DataStructureUtility;
import com.bridgelab.util.Queue;

public class PrimeAnagramQueue {
	public static void main(String[] args) {
		Queue<Integer> queue=new Queue<Integer>(1000);
		List<Integer> list2 = new ArrayList<Integer>();
		list2 = DataStructureUtility.findPrime(0,1000); //finding prime
		queue = DataStructureUtility.primeAnagramqueue(list2); //finding anagram
		System.out.println(queue.size()+" is the size of queue");
		System.out.println("Elements in a queue are :");
		while(!queue.isQueueEmpty())
		{
			queue.dequeue();
			queue.dequeue();
			System.out.println();
		}
	}


}
