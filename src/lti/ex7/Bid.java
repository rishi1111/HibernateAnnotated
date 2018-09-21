package lti.ex7;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="a_bids")
public class Bid {
@Id
@GeneratedValue

	private int id;
	private double amount;
	
	@ManyToOne
	@JoinColumn(name="item_id")
	private Item item;//many to one
	@ManyToOne
	@JoinColumn(name="cust_id")
	private Customer customer;//many to one
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	@Override
	public String toString(){
	return "Bid [id="+id+", amount="+amount+"]";	
	}
	
	
	
}
