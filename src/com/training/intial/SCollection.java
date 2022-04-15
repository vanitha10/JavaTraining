package com.training.intial;

import java.util.HashSet;
	import java.util.Set;

	class Employee {
	  int age;
	  int salary;
	  String name;

	  Employee(String name, int age, int salary) {
	    this.name = name;
	    this.age = age;
	    this.salary = salary;
	  }

	  @Override
	  public boolean equals(Object obj) {
	    if (this == obj) {
	      return true;
	    }

	    if (obj == null || this.getClass() != obj.getClass()) {
	      return false;
	    }

	    Employee emp = (Employee) obj;

	    return this.name.equals(emp.name) && this.age == emp.age && this.salary == emp.salary;
	  }

	  @Override
	  public int hashCode() {
	    return this.name.length() % 10;
	  }

	}

	public class SCollection {

	  public static void main(String[] args) {

	    Employee e1 = new Employee("Sachin", 45, 55000);
	    Employee e2 = new Employee("Sachin", 45, 55000);

	    Employee e3 = new Employee("Dhonii", 40, 30000);

	    //System.out.println(e1.equals(e2));

	    if (e1.hashCode() == e3.hashCode()) {
	      System.out.println(e1.equals(e3));
	    } else {
	      System.out.println("Not Equal");
	    }

	    // System.out.println(e1.equals(e2));

	    Set<Employee> set = new HashSet<>();
	    set.add(e1);
	    set.add(e3);

	    System.out.println(set);

	  }



}
