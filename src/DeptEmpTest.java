

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.ex6.Department;
import lti.ex6.Employee;
import lti.util.HibernateUtil;

public class DeptEmpTest {

	@Test
	public void testCase1() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction txn = session.beginTransaction();
		
		Department dept = new Department();
		dept.setDeptno(10);
		dept.setName("Admin");
		dept.setLocation("Andheri,Mumbai");
		session.save(dept);
		txn.commit();
	}
	
	@Test
	public void testCase2() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction txn = session.beginTransaction();
		Department dept=(Department)session.get(Department.class,81);
		Employee emp = new Employee(1001, "John", 3000.0, dept);
		session.save(emp);	
		txn.commit();
	}
	
}
