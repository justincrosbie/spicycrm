package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Set;

/**
 * Location entity. @author MyEclipse Persistence Tools
 */
public class Location extends AbstractLocation implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Location() {
	}

	/** minimal constructor */
	public Location(BigDecimal id) {
		super(id);
	}

	/** full constructor */
	public Location(BigDecimal id, Type type, Source source, Status status,
			String name, String description, Set transactions,
			Set revenuetransactions, Set items) {
		super(id, type, source, status, name, description, transactions,
				revenuetransactions, items);
	}

}
