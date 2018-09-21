package lti.ex4;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="persons")
public class Person {

	@EmbeddedId //composite primary key
	private Person.Id id;
	private String name;
	private int age;

	public Person(Id id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Person.Id getId() {
		return id;
	}

	public void setId(Person.Id id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person() {

	}

	@Embeddable
	public static class Id implements Serializable {
		private String country;
		@Column(name="medicare_number")
		private int medicareNumber;

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public int getMedicareNumber() {
			return medicareNumber;
		}

		public void setMedicareNumber(int medicareNumber) {
			this.medicareNumber = medicareNumber;
		}

		public Id(String country, int medicareNumber) {
			this.country = country;
			this.medicareNumber = medicareNumber;
		}

	}
}