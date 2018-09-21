import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.ex5.Address;
import lti.ex5.User;
import lti.util.HibernateUtil;

public class TestUser {
@Test
public void testCase1() {
	
	SessionFactory factory=HibernateUtil.getFactory();
	Session session = factory.getCurrentSession();
	Transaction tx = session.beginTransaction();
	
	//creating new user object
	User u = new User();
	u.setFirstname("Polo");
	u.setLastname("Molo");
	u.setUsername("polo_molo");
	u.setPassword("polo123");
	//creating an object of address type
	Address address = new Address();
	address.setCity("Mumbai");
	address.setStreet("Powai");
	address.setZipcode("400083");
	//setting address in a user object
	u.setAddress(address);
	//setting user in a address object
	address.setUser(u);
	
	session.save(u);
	tx.commit();
	
	
}
}
