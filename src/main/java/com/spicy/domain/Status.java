package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
 * Status entity. @author MyEclipse Persistence Tools
 */
public class Status extends AbstractStatus implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Status() {
	}

	/** minimal constructor */
	public Status(BigDecimal id) {
		super(id);
	}

	/** full constructor */
	public Status(BigDecimal id, Type type, String status, String description,
			Date created, Date modified, Date deleted, BigDecimal isActive,
			Set bodies, Set items, Set transactions, Set revenuetransactions,
			Set attributes, Set locations) {
		super(id, type, status, description, created, modified, deleted,
				isActive, bodies, items, transactions, revenuetransactions,
				attributes, locations);
	}

}
