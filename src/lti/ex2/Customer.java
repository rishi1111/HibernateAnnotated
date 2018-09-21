package lti.ex2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="customer")
@SequenceGenerator(name="seqgen",sequenceName="cust_seq")
//we use a sequence defined in database to generate cust_id
public class Customer {

	@Id
	@GeneratedValue(generator="seqgen")
	@Column(name="CUST_ID")
	private int custId;
	@Column(name="cust_name")
	private String custName;
	@Column(name="credit_limit")
	private double creditLimit;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	
	
}
