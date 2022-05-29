package com.OOP;

import java.util.Arrays;
import java.util.*;

/*
 * inheritance -> allow classes to use data & methods from other classes..
 * dynamic binding
 * super keyword
 * Method overriding
 */

class Employee implements Comparable<Employee>{ //base class,super class,parent class
	
	private String name;
	private double salary;
    Employee(String n,double s){
		this.name = n;
		this.salary = s;
	}
  
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
    
	void raisedSalary(double percent) {
		salary += salary*percent/100;//salary = salary + salary * percent/100
	}
	
	public boolean equals(Object obj) {
		if(this == obj)
		return true;
		
		if (obj == null)
			return false;
		
		if(this.getClass() != obj.getClass())
			return false;
		
		Employee e = (Employee) obj;
		return this.name.equals(e.name) && this.salary == (e.salary); //salary = get salary
		//salary used by directly it's in same class
		
	}

	@Override
	public int compareTo(Employee e) { //obj1.compareTo(obj.2) obj1 - obj2
		
		if(salary == e.salary)
		return 0;
		
		if(salary < e.salary)
		return -1;
		
		return 1;
	}
	
}

class Manager extends Employee{ //derived class,sub class,child class
    double bonus;
	Manager(String n, double s,double bonus) {
		super(n, s);
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getSalary() {  //Method overriding --> polymorphism
		return super.getSalary() + bonus;
	}
	
	
}

public class Inheritance_Mo_Db_Super {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Veera",30000);
		System.out.println(e1.getSalary());
		e1.raisedSalary(10); //to check object class un comment it
		System.out.println(e1.getSalary());
		System.out.println("---------------");
		
		
		Employee e3 = new Employee("Veera",30000);
		System.out.println(e1.equals(e3));
		System.out.println("---------------");


		Employee e2 = new Manager("Sakthivel",50000,0); //Employee "is A" Manager
		System.out.println(e2.getSalary());		
		System.out.println("---------------");
		
        Manager m1 = new Manager("Virat",40000,0.0);
		System.out.println(m1.getSalary());
		m1.setBonus(5000);
		System.out.println(m1.getSalary());
		System.out.println("---------------");
		
		Employee employees[] = new Employee[4];
		employees[0] = new Employee("Veera0",30000);
		employees[1] = new Employee("Veera1",40000);
		employees[2] = new Employee("Veera2",90000);	
		employees[3] = new Manager("Veera3",3000,0.0);
		
		employees[3].setSalary(75000);
		Manager m2;
		if(employees[3] instanceof Manager) {
			m2 = (Manager) employees[3]; //type casting
			m2.setBonus(20000);
		}
		
		for (Employee e : employees) {  //dynamic binding
			//we can't set bonus here exception on Overriding..
			System.out.println(e.getName() + " " + e.getSalary());
		}
		
		System.out.println("--------------");
		
		Arrays.sort(employees);
		
		for (Employee e : employees) {  //dynamic binding
			//we can't set bonus here exception on Overriding..
			System.out.println(e.getName() + " " + e.getSalary());
		}

	}

}
