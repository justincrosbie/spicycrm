package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
 * Attribute entity. @author MyEclipse Persistence Tools
 */
public class Attribute extends AbstractAttribute implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Attribute() {
	}

	/** minimal constructor */
	public Attribute(BigDecimal id) {
		super(id);
	}

	/** full constructor */
	public Attribute(BigDecimal id, Type type, Category category,
			Status status, String name, String description, Date created,
			Date modified, Date deleted, BigDecimal isActive,
			Set attributevalues) {
		super(id, type, category, status, name, description, created, modified,
				deleted, isActive, attributevalues);
	}

}
