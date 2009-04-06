package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Set;

/**
 * Postcode entity. @author MyEclipse Persistence Tools
 */
public class Postcode extends AbstractPostcode implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Postcode() {
	}

	/** minimal constructor */
	public Postcode(BigDecimal id) {
		super(id);
	}

	/** full constructor */
	public Postcode(BigDecimal id, Region region, Country country, City city,
			String code, Set addresses) {
		super(id, region, country, city, code, addresses);
	}

}
