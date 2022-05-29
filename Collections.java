package com.OOP;

import java.util.*;

public class Collections { //used to store & processing data efficiently

	public static void main(String[] args) {
		
		int a[] = new int[5]; //fixed sixe
		
		ArrayList<Integer> alist = new ArrayList<Integer>(); //flexible,supports redundancy pgm int,string..
		
		for(int i =1;i <= 10;i++)
		alist.add(i);
		alist.add(10);
		alist.add(20);
		alist.add(30);
		System.out.println(alist);
		System.out.println("-------");
		
		alist.set(0,200);
		System.out.println(alist);
		System.out.println("-------");
		
		int k = alist.get(4);
		System.out.println(k);
		System.out.println("-------");
		
		alist.remove(3);
		System.out.println(alist);
		System.out.println("-------");
		
		for(int i : alist) {
			System.out.println(i);
		}
		System.out.println("-------");
		
		ArrayList all = new ArrayList();
		all.add(18);
		all.add("Veera");
		all.add('$');
		System.out.println(all);
		System.out.println("-------");
		
		Iterator<Integer> ite = alist.iterator(); //without written i =1;....
		System.out.println("using iterator");
		int g = ite.next(); //gets index value using iterator
		System.out.println(g);
		System.out.println("-------");
		
		Iterator<Integer> i = alist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next()); //iterate using while lopp with "hasNext"
		}
		System.out.println("-------");


		ArrayList<String> alist1 = new ArrayList<String>();
		alist1.add("Veera");
		alist1.add("Virat");
		alist1.add("Kohli");
		System.out.println(alist1);
		System.out.println("-------");
		
		LinkedList l1 = new LinkedList();
		l1.add(alist);
		l1.add("Linkedin");//LIFO
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		System.out.println(l1.pollFirst());
		
	}

}
