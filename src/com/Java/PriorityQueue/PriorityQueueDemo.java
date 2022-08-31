package com.Java.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public PriorityQueueDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public void PriorityQueueApplications() {
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		
		priorityQueue.add(500);
		priorityQueue.add(300);
		priorityQueue.add(200);
		priorityQueue.add(100);
		priorityQueue.add(-800);
		
		//directly this is not sorted
		System.out.println("The elements in priority Queue"+priorityQueue);
		
		
		//when we poll it gets sorted and queue is empty
		while(!priorityQueue.isEmpty()) {
			System.out.println(priorityQueue.poll());
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueueDemo d = new PriorityQueueDemo();
		d.PriorityQueueApplications();

	}

}
