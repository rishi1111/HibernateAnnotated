package lti.ex2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;

public class TestCustomer {

	@Test
	public void testAddCustomer() {

		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction txn = session.getTransaction();

		Customer c1 = new Customer();
		c1.setCustName("Johnny1123");
		c1.setCreditLimit(5000);

		txn.begin();
		session.save(c1);
		txn.commit();
		factory.close();

	}

	@Test
	public void testDeleteCustomer() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction txn = session.beginTransaction();

		Customer c = (Customer) session.get(Customer.class, 2);
		session.delete(c);
		txn.commit();
		factory.close();
	}

	@Test
	public void testUpdateCustomer() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction txn = session.beginTransaction();

		Customer c = (Customer) session.get(Customer.class, 102);
		c.setCreditLimit(2000);

		txn.commit();
		factory.close();
	}

	@Test
	public void testFetchCustomer() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction txn = session.beginTransaction();


		Customer c = (Customer) session.get(Customer.class, 101);
		System.out.println(c.getCustId() + " " + c.getCustName() + " " + c.getCreditLimit());
		factory.close();
	}

}
