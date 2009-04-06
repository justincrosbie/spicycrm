package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Set;

/**
 * Address entity. @author MyEclipse Persistence Tools
 */
public class Address extends AbstractAddress implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Address() {
	}

	/** minimal constructor */
	public Address(BigDecimal id) {
		super(id);
	}

	/** full constructor */
	public Address(BigDecimal id, Type type, Region region, Postcode postcode,
			Country country, Body body, City city, String housenumber,
			String street, String locality, Set bodiesForHomeaddressId,
			Set bodiesForWorkaddressId) {
		super(id, type, region, postcode, country, body, city, housenumber,
				street, locality, bodiesForHomeaddressId,
				bodiesForWorkaddressId);
	}

}
