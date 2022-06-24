package com.pe.apps.service;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.pe.apps.dao.EmployeeDao;
import com.pe.apps.entity.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	Logger logger = Logger.getLogger(EmployeeServiceImpl.class);
	
	@Autowired
	@Qualifier("employeeDao")
	EmployeeDao employeeDaoImpl;
	
	public List<Employee> getListEmployee() {
		// TODO Auto-generated method stub
		return employeeDaoImpl.getListEmployee();
	}

	public boolean addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDaoImpl.addEmployee(employee);
	}

	@Override
	public List<Employee> getListEmployeXName(String name) {
		// TODO Auto-generated method stub
		return employeeDaoImpl.getListEmployeXName(name);
	}

}
