package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
 * Status entity. @author MyEclipse Persistence Tools
 */
public class Type extends AbstractType implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Type() {
	}

	/** minimal constructor */
	public Type(BigDecimal id) {
		super(id);
	}

	/** full constructor */
	public Type(BigDecimal id, Type type, String name, String description,
			Date created, Date modified, Date deleted, BigDecimal isActive,
			Set bodies, Set items, Set transactions, Set revenuetransactions,
			Set attributes, Set locations) {
		super(id, type, name, description, created, modified, deleted,
				isActive, bodies, items, transactions, revenuetransactions,
				attributes, locations);
	}

}
