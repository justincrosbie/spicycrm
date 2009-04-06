package com.spicy.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractCity entity provides the base persistence definition of the City
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCity implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private Region region;
	private Country country;
	private String name;
	private Set addresses = new HashSet(0);
	private Set postcodes = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractCity() {
	}

	/** minimal constructor */
	public AbstractCity(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractCity(BigDecimal id, Region region, Country country,
			String name, Set addresses, Set postcodes) {
		this.id = id;
		this.region = region;
		this.country = country;
		this.name = name;
		this.addresses = addresses;
		this.postcodes = postcodes;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getAddresses() {
		return this.addresses;
	}

	public void setAddresses(Set addresses) {
		this.addresses = addresses;
	}

	public Set getPostcodes() {
		return this.postcodes;
	}

	public void setPostcodes(Set postcodes) {
		this.postcodes = postcodes;
	}

}