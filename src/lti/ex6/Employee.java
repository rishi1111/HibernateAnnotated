package lti.ex6;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee_jpa")
public class Employee {

	@Id
	@GeneratedValue
	private int empno;
	private String name;
	private double salary;
	@ManyToOne
	@JoinColumn(name="deptno")
	private Department dept;
	
	public Employee(int empno, String name, double salary, Department dept) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
}
