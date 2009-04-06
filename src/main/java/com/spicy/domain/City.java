package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Set;

/**
 * City entity. @author MyEclipse Persistence Tools
 */
public class City extends AbstractCity implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public City() {
	}

	/** minimal constructor */
	public City(BigDecimal id) {
		super(id);
	}

	/** full constructor */
	public City(BigDecimal id, Region region, Country country, String name,
			Set addresses, Set postcodes) {
		super(id, region, country, name, addresses, postcodes);
	}

}
