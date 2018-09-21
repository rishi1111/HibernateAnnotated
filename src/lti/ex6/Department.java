package lti.ex6;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "department_jpa")
public class Department {
	@Id
	@GeneratedValue
	private int deptno;
	private String name;
	private String location;
	@OneToMany(mappedBy = "dept", cascade = { CascadeType.ALL })
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Set<Employee> employees;

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public Department(int deptno, String name, String location, Set<Employee> employees) {
		super();
		this.deptno = deptno;
		this.name = name;
		this.location = location;
		this.employees = employees;
	}

	public Department() {
		// TODO Auto-generated constructor stub
	}

}
