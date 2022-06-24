package com.pe.apps.service;

import java.util.List;

import com.pe.apps.entity.Employee;

public interface EmployeeService {
	public List<Employee> getListEmployee();
	public boolean addEmployee(Employee employee);
	public List<Employee> getListEmployeXName(String name);

}
