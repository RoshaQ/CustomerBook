package pl.spring.demo.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import pl.spring.demo.enumerations.CustomerStatus;

/**
 * 
 * @author MIROSZAK
 *
 */
@Entity
@Table(name = "customers")
public class CustomerEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false, length = 20)
	private String name;
	@Column(nullable = false, length = 25)
	private String surname;
	@Column(length = 25)
	private int age;
//	@Column(nullable = false)
//	private List<Double> weight = new ArrayList<>();
	@Column(nullable = false, length = 40)
	private LocalDate startDate;
	@Column(length = 40)
	private LocalDate finishDate;
	@Column(nullable = false)
	private CustomerStatus customerStatus;
	@Column(length = 12)
	private int phoneNumber;
	@Column(length = 250)
	private String importantInformation;
	@Column(nullable = false, length = 3)
	private int height;

	public CustomerEntity() {
		// TODO Auto-generated constructor stub
	}

	public CustomerEntity(CustomerEntityBuilder builder) {

		this.id = builder.id;
		this.name = builder.name;
		this.surname = builder.surname;
		this.age = builder.age;
//		this.weight = builder.weight;
		this.startDate = builder.startDate;
		this.finishDate = builder.finishDate;
		this.customerStatus = builder.customerStatus;
		this.phoneNumber = builder.phoneNumber;
		this.importantInformation = builder.importantInformation;
		this.height = builder.height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	public List<Double> getWeight() {
//		return weight;
//	}
//
//	public void setWeight(List<Double> weight) {
//		this.weight = weight;
//	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(LocalDate finishDate) {
		this.finishDate = finishDate;
	}

	public CustomerStatus getCustomerStatus() {
		return customerStatus;
	}

	public void setCustomerStatus(CustomerStatus customerStatus) {
		this.customerStatus = customerStatus;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getImportantInformation() {
		return importantInformation;
	}

	public void setImportantInformation(String importantInformation) {
		this.importantInformation = importantInformation;
	}

	public static class CustomerEntityBuilder {
		private Long id;

		private String name;

		private String surname;

		private int age;

		private List<Double> weight = new ArrayList<>();

		private int height;

		private LocalDate startDate;

		private LocalDate finishDate;

		private CustomerStatus customerStatus;

		private int phoneNumber;

		private String importantInformation;

		public CustomerEntityBuilder() {

		}

		public CustomerEntityBuilder id(Long id) {
			this.id = id;
			return this;
		}

		public CustomerEntityBuilder name(String name) {
			this.name = name;
			return this;
		}

		public CustomerEntityBuilder surname(String surname) {
			this.surname = surname;
			return this;
		}

		public CustomerEntityBuilder age(int age) {
			this.age = age;
			return this;
		}

		public CustomerEntityBuilder height(int height) {
			this.height = height;
			return this;
		}

		public CustomerEntityBuilder weight(List<Double> weight) {
			this.weight = weight;
			return this;
		}

		public CustomerEntityBuilder startDate(LocalDate startDate) {
			this.startDate = startDate;
			return this;
		}

		public CustomerEntityBuilder finishDate(LocalDate finishDate) {
			this.finishDate = finishDate;
			return this;
		}

		public CustomerEntityBuilder customerStatus(CustomerStatus customerStatus) {
			this.customerStatus = customerStatus;
			return this;
		}

		public CustomerEntityBuilder phoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		public CustomerEntityBuilder importantInformation(String importantInformation) {
			this.importantInformation = importantInformation;
			return this;
		}

		public CustomerEntity build() {
			return new CustomerEntity(this);
		}

	}

}
