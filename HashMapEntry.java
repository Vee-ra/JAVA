package com.OOP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.ietf.jgss.Oid;


public class HashMapEntry {

	public static void main(String[] args) {
		
		HashMap<String, Double> hm = new HashMap();
		hm.put("Pothigai exp", 21.10);
		hm.put("Vaigai exp", 21.10);
		hm.put("Nellai exp", 20.10);
		hm.put("Pandian exp", 17.00);
		hm.put("Mannai exp", 22.00);
		
		System.out.println(hm);
		Set s = hm.entrySet();
		System.out.println(s);
		
		System.out.println("----------------");
		
		System.out.println("Before changing time" + s);
		System.out.println("--------------");
		
		Iterator i = s.iterator();
		
			while(i.hasNext()) 
			 {
			Object o = i.next();
			System.out.println(o);
			System.out.println("----------------");
			

			Map.Entry e = (Map.Entry) o ;  //type casting
			
			
			Object time = e.getValue(); //20.1,value
			System.out.println(time);
			
			Object exp = e.getKey(); //key,train
			System.out.println(exp);
			
			System.out.println("----------------");

			 
			if(time.equals(17.00)) {
				e.setValue(16.00);
				//System.out.println(exp); //Pandian exp
				System.out.println("----------------");
			}
		
			 }
				System.out.println("After changing time" + s);
	
	}

}
