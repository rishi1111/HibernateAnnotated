import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.ex4.Person;
import lti.util.HibernateUtil;

public class TestPerson {

	
	@Test
	public void testSavePerson() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		
		Transaction txn=session.beginTransaction();
		
		Person p = new Person(new Person.Id("India1", 12341),"Polo1",21);
		session.save(p);
		txn.commit();
	}
	
}
