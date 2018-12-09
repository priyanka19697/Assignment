package com.wipro.et.dao;
import java.util.List;

import com.wipro.et.bean.*;

public class EmployeeDao {
	
	private static List<Employee> employees;
	
	public static List<Employee> getEmployees() {
		return employees;
	}

	public static void setEmployees(List<Employee> employees) {
		EmployeeDao.employees = employees;
	}

	String saveEmployee(Employee emp) {
		employees.add(emp);
		return null;
		
	}

}
