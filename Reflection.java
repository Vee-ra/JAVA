package com.OOP;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

	public static void main(String[] args) {
		
		Employee e = new Employee("mahi",7); //same package class access using reflection
		
		Class cls = e.getClass();
		System.out.println(cls);
		
		Method[] method = cls.getMethods();
		
		for(Method m : method) {
			System.out.println(m.getName());
		}
		
		try {
			System.out.println(method[0].invoke(e,null));
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
