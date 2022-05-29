package com.OOP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashUserDefined {

	public static void main(String[] args) {
		
		Mobiles m1 = new Mobiles("Sammsung",1,10000);
		Mobiles m2 = new Mobiles("iPhone",2,50000);
		Mobiles m3 = new Mobiles("Sammsung",3,15000);
		Mobiles m4 = new Mobiles("Sammsung",4,19000);
		
		HashMap<Integer,Mobiles> hm = new HashMap<Integer,Mobiles>();
		hm.put(123,m1);
		hm.put(124, m2);
		hm.put(124, m3);
		hm.put(125,m4);
		System.out.println(hm);
		
		Set s = hm.entrySet();
		System.out.println(s);
		
		Iterator i = s.iterator();
		
		while(i.hasNext()) {
		
		Object o = i.next();
		System.out.println(o);
		
		Map.Entry m = (Map.Entry) o;//type cating object o
		
		Object o1 = m.getKey();
		System.out.println(o1);
		Object o2 = m.getValue();
		System.out.println(o2);
		
//		Mobiles mob = (Mobiles)o2;
//		if(o1.equals(123))
//			System.out.println(o2);
		
		}

}


}
