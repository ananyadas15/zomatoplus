package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_restaurant")
public class Restaurant implements Serializable{
	@Id
	@GeneratedValue
	@Column(name = "restaurant_id")
	private Long id;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "like_count")
	private Integer like_count;
	
	@Column(name = "website")
	private String website;
	
	@Column(name = "contact")
	private String contact;
	
	@Column(name = "description")
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getLike_count() {
		return like_count;
	}

	public void setLike_count(Integer like_count) {
		this.like_count = like_count;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Restaurant(Long id, String city, String name, String address, Integer like_count, String website,
			String contact, String description) {
		super();
		this.id = id;
		this.city = city;
		this.name = name;
		this.address = address;
		this.like_count = like_count;
		this.website = website;
		this.contact = contact;
		this.description = description;
	}

	public Restaurant() {
		super();
	}

			
}
