package com.oop;

public class Manager {
	String name;
	String role;
	double salary;
	double workingHours;

	public Manager() {
	}

	public Manager(String name, String role, double salary, double wh) {
		this.name = name;
		this.role = role;
		this.salary = salary;
		this.workingHours = wh;
	}

	void displayDetails() {
		System.out.println(name + " " + role + " " + salary + " " + workingHours);
	}

	class Employee extends Manager {
		public Employee(){
			
		}
		public Employee(String name, String role, double salary, double wh) {
			super(name, role, salary, wh);
		}

		String getDetails() {
			return name + " " + role;
		}
	}

	class AssistatManger extends Employee{
		 AssistatManger(Manager manager){
			 manager = new Manager();
		 }
		 
		 static void create() {
			  Employee emp = new AsstatManger(new Manager()).new Employee();
		 }
	}

}
