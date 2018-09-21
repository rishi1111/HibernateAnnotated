package lti.ex8.tps;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="bankaccount_details_jpa2")
public class BankAccount extends BillingDetails {

	
	private String bankName;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	
	
}
