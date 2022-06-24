package com.pe.apps.dao;
import java.util.List;

import com.pe.apps.entity.Employee;

public interface EmployeeDao {
	
	public List<Employee> getListEmployee();
	public boolean addEmployee(Employee employee);
	public List<Employee> getListEmployeXName(String name);

}
