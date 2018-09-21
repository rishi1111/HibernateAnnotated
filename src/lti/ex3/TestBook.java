package lti.ex3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;

public class TestBook {

	@Test
	public void testSaveBook() {

		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction txn = session.beginTransaction();

		Book b1 = new Book(12346578,"The Alchemist 23 ", "John Doe 12", 350);
		
		session.save(b1);
		txn.commit();
		

	}
	
	@Test
	public void testGetBook() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Book bk = (Book) session.get(Book.class, 1);
		System.out.println(bk.toString());
	}
	
	@Test
	public void testGetByIsbn() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Book bk = (Book) session.bySimpleNaturalId(Book.class).load(123465);
		System.out.println(bk.toString());
	}
}
