package com.spicy.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractCategory entity provides the base persistence definition of the
 * Category entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCategory implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private Type type;
	private String name;
	private Set attributes = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractCategory() {
	}

	/** minimal constructor */
	public AbstractCategory(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractCategory(BigDecimal id, Type type, String name,
			Set attributes) {
		this.id = id;
		this.type = type;
		this.name = name;
		this.attributes = attributes;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Type getType() {
		return this.type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getAttributes() {
		return this.attributes;
	}

	public void setAttributes(Set attributes) {
		this.attributes = attributes;
	}

}