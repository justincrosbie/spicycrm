package com.spicy.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractAddress entity provides the base persistence definition of the
 * Address entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAddress implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private Type type;
	private Region region;
	private Postcode postcode;
	private Country country;
	private Body body;
	private City city;
	private String housenumber;
	private String street;
	private String locality;
	private Set bodiesForHomeaddressId = new HashSet(0);
	private Set bodiesForWorkaddressId = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractAddress() {
	}

	/** minimal constructor */
	public AbstractAddress(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractAddress(BigDecimal id, Type type, Region region,
			Postcode postcode, Country country, Body body, City city,
			String housenumber, String street, String locality,
			Set bodiesForHomeaddressId, Set bodiesForWorkaddressId) {
		this.id = id;
		this.type = type;
		this.region = region;
		this.postcode = postcode;
		this.country = country;
		this.body = body;
		this.city = city;
		this.housenumber = housenumber;
		this.street = street;
		this.locality = locality;
		this.bodiesForHomeaddressId = bodiesForHomeaddressId;
		this.bodiesForWorkaddressId = bodiesForWorkaddressId;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Type getType() {
		return this.type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Region getRegion() {
		return this.region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Postcode getPostcode() {
		return this.postcode;
	}

	public void setPostcode(Postcode postcode) {
		this.postcode = postcode;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getHousenumber() {
		return this.housenumber;
	}

	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLocality() {
		return this.locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public Set getBodiesForHomeaddressId() {
		return this.bodiesForHomeaddressId;
	}

	public void setBodiesForHomeaddressId(Set bodiesForHomeaddressId) {
		this.bodiesForHomeaddressId = bodiesForHomeaddressId;
	}

	public Set getBodiesForWorkaddressId() {
		return this.bodiesForWorkaddressId;
	}

	public void setBodiesForWorkaddressId(Set bodiesForWorkaddressId) {
		this.bodiesForWorkaddressId = bodiesForWorkaddressId;
	}

}