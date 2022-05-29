package com.OOP;

import java.lang.*;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queuedemo {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		
		q.add(18);
		q.add(1);
		q.add(45);
		q.add(-2);
		
		System.out.println(q.peek()); //Head
		System.out.println(q.poll()); //remove - pop FIFO
		System.out.println(q.peek()); //Head changed to new one
		System.out.println("-----------------");
		
		PriorityQueue<Integer> q1 = new PriorityQueue<>();
		
		q1.add(188);
		q1.add(100);
		q1.add(495);
		q1.add(-2);
		
		System.out.println(q1.peek()); //Head - -2,100,188,495
		System.out.println(q1.poll()); //remove - pop FIFO - removes -2
		System.out.println(q1.peek()); //Head changed to new one - relocate 100 here

	}

}
