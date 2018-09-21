package lti.ex8.tps;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;

public class TestBillingDetails {

	@Test
	public void testCase1() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		BankAccount bankAcc=new BankAccount();
		bankAcc.setHolder("Polo");
		bankAcc.setNumber("12345");
		bankAcc.setBankName("ICICI Bank");
		
		CreditCard creditcard = new CreditCard();
		creditcard.setHolder("LILI");
		creditcard.setNumber("412901234567890");
		creditcard.setType("VISA");
		creditcard.setExpiry("12/2019");
		
		session.save(bankAcc);
		session.save(creditcard);
		tx.commit();
	}
}
