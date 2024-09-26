package spring;

import java.time.LocalDateTime;

public class Member2 {

	private Long id;
	private String name;
	private String city;
	private String street;
	private LocalDateTime zipcode;

	public Member2(String name, String city, 
			String street, LocalDateTime zipcode) {
		this.name = name;
		this.city = city;
		this.street = street;
		this.zipcode = zipcode;
	}

	void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	

	public String getCity() {
		return city;
	}

	

	public String getStreet() {
		return street;
	}

	

	public LocalDateTime getZipcode() {
		return zipcode;
	}

	@Override
	public String toString() {
		return "Member2 [id=" + id + ", name=" + name + ", city=" + city + ", street=" + street + ", zipcode=" + zipcode
				+ "]";
	}

	
	
	

}
