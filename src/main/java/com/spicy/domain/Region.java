package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Set;

/**
 * Region entity. @author MyEclipse Persistence Tools
 */
public class Region extends AbstractRegion implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Region() {
	}

	/** minimal constructor */
	public Region(BigDecimal id) {
		super(id);
	}

	/** full constructor */
	public Region(BigDecimal id, Country country, String name, Set addresses,
			Set postcodes, Set cities) {
		super(id, country, name, addresses, postcodes, cities);
	}

}
