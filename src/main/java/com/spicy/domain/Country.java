package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Set;

/**
 * Country entity. @author MyEclipse Persistence Tools
 */
public class Country extends AbstractCountry implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Country() {
	}

	/** minimal constructor */
	public Country(BigDecimal id) {
		super(id);
	}

	/** full constructor */
	public Country(BigDecimal id, String code, String name, String idc,
			Set cities, Set telephones, Set postcodes, Set regions,
			Set addresses) {
		super(id, code, name, idc, cities, telephones, postcodes, regions,
				addresses);
	}

}
