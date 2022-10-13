package com.designPatterns.prototype;

import java.util.List;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emp=new Employees();
		emp.loadData();
		
		Employees emp1=emp.clone();
		Employees emp2=emp.clone();
		
		List<String> list=emp1.getEmpList();
		List<String> list1=emp2.getEmpList();
		
		list.add("Anmol");
		list1.remove("Pankaj");
		
		System.out.println("emp List: "+emp.getEmpList());
		System.out.println("emp1 List: "+list);
		System.out.println("emps2 List: "+list1);
	}

}
