package com.pe.apps.entity;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="employee",schema="devsoa")
public class Employee implements Serializable{

	  @Id
	  @Column(name="emp_id")
	  @GeneratedValue(strategy=GenerationType.AUTO,generator="sequence")
	  @SequenceGenerator(name="sequence",sequenceName="emp_seq")
	  private Long empid;
	  
	  @Column(name="emp_name")
	  private String empname;
	  
	  @Column(name="emp_alias")
	  private String empalias;
	  
	  @Column(name="emp_password")
	  private String emppassword;
	  
	  @Column(name="emp_dni")
	  private String empdni;
	  
	  @Column(name="emp_email")
	  private String empemail;
	  
	  
	public Long getEmpid() {
		return empid;
	}
	public void setEmpid(Long empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpalias() {
		return empalias;
	}
	public void setEmpalias(String empalias) {
		this.empalias = empalias;
	}
	public String getEmppassword() {
		return emppassword;
	}
	public void setEmppassword(String emppassword) {
		this.emppassword = emppassword;
	}
	public String getEmpdni() {
		return empdni;
	}
	public void setEmpdni(String empdni) {
		this.empdni = empdni;
	}
	public String getEmpemail() {
		return empemail;
	}
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}
	
	
	
}
