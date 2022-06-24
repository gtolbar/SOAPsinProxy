package com.pe.apps.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pe.apps.entity.Employee;

@Repository("employeeDao")
@Transactional
public class EmployeeDaoImpl implements EmployeeDao{

	Logger logger = Logger.getLogger(EmployeeDaoImpl.class);
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Employee> getListEmployee() {
		// TODO Auto-generated method stub
		return (List<Employee>)sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
	}

	public boolean addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		boolean flagcomplete=false;
		sessionFactory.getCurrentSession().save(employee);
		flagcomplete=true;
		logger.info("Insert new Employee : "+flagcomplete);
		return flagcomplete;
	}

	@Override
	public List<Employee> getListEmployeXName(String name) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Employee.class);
		criteria.add(Restrictions.like("empname", "%"+name+"%"));
		return criteria.list();
	}

}
