package com.spicy.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractCountry entity provides the base persistence definition of the
 * Country entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCountry implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private String code;
	private String name;
	private String idc;
	private Set cities = new HashSet(0);
	private Set telephones = new HashSet(0);
	private Set postcodes = new HashSet(0);
	private Set regions = new HashSet(0);
	private Set addresses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractCountry() {
	}

	/** minimal constructor */
	public AbstractCountry(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractCountry(BigDecimal id, String code, String name, String idc,
			Set cities, Set telephones, Set postcodes, Set regions,
			Set addresses) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.idc = idc;
		this.cities = cities;
		this.telephones = telephones;
		this.postcodes = postcodes;
		this.regions = regions;
		this.addresses = addresses;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdc() {
		return this.idc;
	}

	public void setIdc(String idc) {
		this.idc = idc;
	}

	public Set getCities() {
		return this.cities;
	}

	public void setCities(Set cities) {
		this.cities = cities;
	}

	public Set getTelephones() {
		return this.telephones;
	}

	public void setTelephones(Set telephones) {
		this.telephones = telephones;
	}

	public Set getPostcodes() {
		return this.postcodes;
	}

	public void setPostcodes(Set postcodes) {
		this.postcodes = postcodes;
	}

	public Set getRegions() {
		return this.regions;
	}

	public void setRegions(Set regions) {
		this.regions = regions;
	}

	public Set getAddresses() {
		return this.addresses;
	}

	public void setAddresses(Set addresses) {
		this.addresses = addresses;
	}

}