package lti.ex1;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="product") // table name is product in database
@NamedQuery(name="getAll",query="from Product order by code")
@NamedNativeQuery(name="code1",query="select * from product where p_code=3")
public class Product {

	@Id
	@GeneratedValue
	@Column(name="p_code")  //since it is p_code in table (product)
	private int code;
	@Column(name="p_name",length=30)
	private String name;
	private double price;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


}
