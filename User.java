package com.jdbc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class User {
	
	private int id;
	private String name;
	private String address;
	private String email;
	
	public User(int id, String name, String address, String email) {
		//super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
	}
	public int getid() {
		return id;
	}
	public void setid(int iD) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
public static void main(String[] args) {
	
	User user1 = new User(1,"Veera","Tenkasi","abc.com");
	User user2 = new User(1,"Veera","Tenkasi","abc.com");
	User user3 = new User(1,"Veera","Tenkasi","abc.com");
	User user4 = new User(1,"Veera","Tenkasi","abc.com");
	User user5 = new User(1,"Veera","Tenkasi","abc.com");
	
	user1.setEmail("bbc.com");
	
	HashMap hmL = new HashMap();
	hmL.put(131, user1);
	hmL.put(132, user2);
	hmL.put(133, user3);
	hmL.put(134, user4);
	hmL.put(135, user5);


	List list = new ArrayList();
	list.add(hmL);
//	list.add(user2);
//	list.add(user3);
//	list.add(user4);
//	list.add(user5);
	
//	for(User user : list) {
//		System.out.println(user);
//	}	
	
	System.out.println(hmL.values());
	
//	HashMap hm = new HashMap();
//	hm.put(123,list);
//	System.out.println(list);
		
	
//		HashMap<String, Integer> hm = new HashMap<String, Integer>();
//		hm.put("Veera",123);
//		hm.put("Sakthi",124);
//		hm.put("Vel",125);
//		hm.put("Virat",126);
//		
//		System.out.println(hm);
//		
//		HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
//		hm1.putAll(hm);
//		
//		Set s= hm1.entrySet();
//		System.out.println(s);
//		
//		Collection<Integer> cls =hm1.values();
//		System.out.println(cls);
//		
//		Object obj = hm1.keySet();
//		System.out.println(obj);
//		
//		System.out.println(hm1.isEmpty());
//		System.out.println(hm1.containsKey("Veera"));
//		System.out.println(hm1.containsValue(125));
//		System.out.println(hm1.size());
//		System.out.println(hm1.getClass());
//		
//		HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
//		
//		hm2.putAll(hm1);
//		
//		Set s1 = hm2.entrySet();
//		
//		 Iterator i = s1.iterator();
//		 
//		 while(i.hasNext()) {
//			 
//			 Object o = i.next();
//			 System.out.println(o);
//			 
//			 Map.Entry me = (Map.Entry) o;
//			 
//			 Object name = me.getKey();
//			 
//			 System.out.println(name);
//			 
//			 Object num = me.getValue();
//			 System.out.println(num);
//	      }
		
		
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + "]";
}

}
