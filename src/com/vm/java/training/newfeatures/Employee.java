package com.vm.java.training.newfeatures;

import java.awt.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employee {

	private int id;
	private String name;
	private String dept;
	private int salary;
	private int age;
	
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public Employee(int id, String name, String dept, int salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.age = age;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee(1, "siddik", "software developer",50000,23));
		employees.add(new Employee(2, "akshay", "manager",90000,22));
		employees.add(new Employee(3, "ravi", ".net developer",60000,24));
		employees.add(new Employee(1, "chaitanya", "pega developer",40000,23));
		employees.add(new Employee(1, "ramakrishna", "java developer",50000,25));
		
		employees.forEach(System.out::println);
		long count=employees.stream().count();
		System.out.println("total employees:"+count);
		
		employees.stream().filter(m->m.getDept().equalsIgnoreCase("manager")).forEach(System.out::println);// using stream filter printing manager role
		
		employees.stream().filter(s->s.getName().startsWith("s")).forEach(System.out::println);// printing the employee names starts with s
		long empabv5=employees.stream().filter(c->c.getSalary()>50000).count();//counitng
		
		System.out.println("salary greaterThan 50000 is:"+empabv5);
		
		employees.stream().map(m->m.getId()+" "+m.getName()+" "+m.getName().length()).forEach(System.out::println);
		
		employees.stream().map(s->s.getSalary()*0.20 + s.getSalary()+" "+s.getName()).forEach(System.out::println);
		
		java.util.List<Employee> uniqueEmp = employees.stream().distinct().collect(Collectors.toList());// distinct is filter stream prints unique elemets
		uniqueEmp.forEach(System.out::println);
		System.out.println("unique elements:"+uniqueEmp);
		employees.stream().limit(empabv5); //limit is the filter operation 
		employees.stream().skip(count); // skip is the filter which is skiping the methods
		employees.stream().sorted((s1,s2)->
		{
			if(s1.getSalary()==s2.getSalary())
				return 0;
			else if(s1.getSalary()>s2.getSalary())
				return 1;
			else
				return -1;
		}).forEach(System.out::println);
		
		/*
		 * List<Employee> es = employees.stream().sorted((o1,o2)->{ return
		 * o1.getName().compareTo(o2.getName()); }).collect(Collectors.toList());
		 * System.out.println("sorting by name");
		 * 
		 * es.forEach(System.out::println);
		 */
		
		System.out.println("sort by salary");
		employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
		
		employees.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);
		
		long sum=employees.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
		System.out.println("summarizing:"+sum);
		
		
	}

}
