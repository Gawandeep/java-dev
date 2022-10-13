package com.designPatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

	private String name;
	private List<String> empList = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getEmpList() {
		return empList;
	}

	public void setEmpList(List<String> empList) {
		this.empList = empList;
	}

	public void loadData() {
		
		System.out.println("in LoadData");
		// read all employees from database and put into the list
		empList.add("Pankaj");
		empList.add("Raj");
		empList.add("David");
		empList.add("Lisa");
	}
	
	@Override
	protected Employees clone() throws CloneNotSupportedException{
		Employees emp=new Employees();
		for(String e:getEmpList()) {
			emp.empList.add(e);
		}
		return emp;
	}

}
