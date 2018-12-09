package com.wipro.et.service;

import java.util.List;

import com.wipro.et.bean.Employee;
import com.wipro.et.dao.EmployeeDao;

public class EmployeeTracker {
	
	EmployeeDao employeeDao = new EmployeeDao();


	public EmployeeTracker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeTracker(List<Employee> employees) {
		employeeDao.setEmployees(employees);
	}
	public String createEmployeeProfile(Employee emp) {
		if(employeeDao.getEmployees().contains(emp))
			return "unable to create profile";
		else {
			List<Employee> employees = employeeDao.getEmployees();
			employees.add(emp);
			employeeDao.setEmployees(employees);
		    return "SUCCESS";
		}
	}
	public Employee getEmployeeById(int id) {
		
		List<Employee> employees = employeeDao.getEmployees();
		for(Employee emp : employees)
		{
			if(emp.getId() == id)
				return emp;
		}
			return null;
		}
	public Employee getEmployeeByName(String name) {
		List<Employee> employees = employeeDao.getEmployees();
		for(Employee emp : employees)
		{
			if(emp.getName().equals(name))
				return emp;
		}
			return null;
	}
	public List<Integer> getEmployeeCellNumbers(int empid) {
		List<Employee> employees = employeeDao.getEmployees();
		for(Employee emp : employees)
		{
			if(emp.getId() == empid)
				return emp.getCellNumbers();
		}
			return null;
	}
	public List<Employee> getEmployees(){
		List<Employee> employees = employeeDao.getEmployees();
        return employees;
		
	}
		

}
