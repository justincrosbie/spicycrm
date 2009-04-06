package com.spicy.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractRegion entity provides the base persistence definition of the Region
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRegion implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private Country country;
	private String name;
	private Set addresses = new HashSet(0);
	private Set postcodes = new HashSet(0);
	private Set cities = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractRegion() {
	}

	/** minimal constructor */
	public AbstractRegion(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractRegion(BigDecimal id, Country country, String name,
			Set addresses, Set postcodes, Set cities) {
		this.id = id;
		this.country = country;
		this.name = name;
		this.addresses = addresses;
		this.postcodes = postcodes;
		this.cities = cities;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
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

	public Set getCities() {
		return this.cities;
	}

	public void setCities(Set cities) {
		this.cities = cities;
	}

}