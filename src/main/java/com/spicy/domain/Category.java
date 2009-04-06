package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Set;

/**
 * Category entity. @author MyEclipse Persistence Tools
 */
public class Category extends AbstractCategory implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Category() {
	}

	/** minimal constructor */
	public Category(BigDecimal id) {
		super(id);
	}

	/** full constructor */
	public Category(BigDecimal id, Type type, String name, Set attributes) {
		super(id, type, name, attributes);
	}

}
