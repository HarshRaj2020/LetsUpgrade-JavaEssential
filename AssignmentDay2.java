package com.employee;

public class Employee {
	
	int age;
	String name;
	String city;
	
	static void display(Employee e)
	{
		System.out.println("Employee name is : "+ e.name);
		System.out.println("The Age is : " + e.age);
		System.out.println("City name : "+ e.city);
	}
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.name="Harsh";
		e1.age=22;
		e1.city="Delhi";
		
		Employee e2=new Employee();
		e2.name="Raj";
		e2.age=22;
		e2.city="Noida";
		
		
		display(e1);
		display(e2);
	}

}
