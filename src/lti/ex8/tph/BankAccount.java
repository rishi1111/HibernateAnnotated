package lti.ex8.tph;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="bank_account_details_jpa3")
public class BankAccount extends BillingDetails {

	
	private String bankName;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	
	
}
