package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Set;

/**
 * Item entity. @author MyEclipse Persistence Tools
 */
public class Item extends AbstractItem implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Item() {
	}

	/** minimal constructor */
	public Item(BigDecimal id) {
		super(id);
	}

	/** full constructor */
	public Item(BigDecimal id, Location location, Type type, Source source,
			Status status, String name, String description, BigDecimal value,
			Set revenuetransactions) {
		super(id, location, type, source, status, name, description, value,
				revenuetransactions);
	}

}
