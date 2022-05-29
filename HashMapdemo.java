package com.OOP;

import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/*
 * Entry = key+value
 * 
 * each key appears only once
 * each key have only one value
 * same value with multiple keys are allowed
 */

public class HashMapdemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Virat", 18);
		hm.put("Mahi", 07);
		hm.put("Sachin", 10);
		hm.put("Yuvi", 12);
		hm.put("Virat", 27);
		
		
		HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
		hm2.putAll(hm);
		System.out.println(hm2);
		
		Set s = hm.entrySet();//{} - []
		System.out.println(s);
		
		Collection c = hm.values();
		System.out.println(c);
		
		System.out.println(hm.keySet());
		System.out.println("------------------");

		System.out.println(hm.get("Virat"));
		System.out.println(hm.containsKey("Mahi"));
		System.out.println(hm.containsValue(07));
		System.out.println(hm.isEmpty());
		System.out.println(hm.size());//length in array = size in map
		System.out.println(hm.hashCode());
		hm.remove("Sachin");
		System.out.println(hm.getClass());
		System.out.println(hm);
		System.out.println(hm.remove("Virat", 27));
		System.out.println(hm);

		hm.clear();
		System.out.println(hm);

	}

}
