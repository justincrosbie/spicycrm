package com.spicy.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractPostcode entity provides the base persistence definition of the
 * Postcode entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPostcode implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private Region region;
	private Country country;
	private City city;
	private String code;
	private Set addresses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractPostcode() {
	}

	/** minimal constructor */
	public AbstractPostcode(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractPostcode(BigDecimal id, Region region, Country country,
			City city, String code, Set addresses) {
		this.id = id;
		this.region = region;
		this.country = country;
		this.city = city;
		this.code = code;
		this.addresses = addresses;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Region getRegion() {
		return this.region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Set getAddresses() {
		return this.addresses;
	}

	public void setAddresses(Set addresses) {
		this.addresses = addresses;
	}

}