package com.OOP;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
 * set - only for unique value
 * 
 */

public class HashSetdemo {

	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<>(); //order maintain ,only unique value
		h.add("abi");
		h.add("Veera");
		h.add("Sakthivel");
		h.add("ele");
		h.add("ele");

		
		System.out.println(h);
		System.out.println("---------------");
		
		LinkedHashSet<Integer> lh = new LinkedHashSet<>(); //maintains order but no duplicates = same num again
		lh.add(1);
		lh.add(-55);
		lh.add(34);
		lh.add(3);
		lh.add(3);

		
		System.out.println(lh);
		System.out.println("---------------");

		TreeSet<Integer> ts = new TreeSet<>(); //alphabet - asc order
		ts.add(34);
		ts.add(98);
		ts.add(65);
		ts.add(4);
		ts.add(4);

		
		System.out.println(ts);
		System.out.println("---------------");

		
	
		

	}

}
