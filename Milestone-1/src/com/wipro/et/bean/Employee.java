package com.wipro.et.bean;

import java.util.Arrays;
import java.util.List;

public class Employee {
	private int id;
	private String name;
	private List<Integer> cellNumbers;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee(int id, String name, List<Integer> list) {
		super();
		this.id = id;
		this.name = name;
		this.cellNumbers = list;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", cellNumbers=" + cellNumbers + "]";
	}
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
	public List<Integer> getCellNumbers() {
		return cellNumbers;
	}
	public void setCellNumbers(List<Integer> cellNumbers) {
		this.cellNumbers = cellNumbers;
	}
	
	
	
	
	

}
