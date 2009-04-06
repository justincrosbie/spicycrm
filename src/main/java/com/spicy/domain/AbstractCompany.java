package com.spicy.domain;

import java.math.BigDecimal;

/**
 * AbstractCompany entity provides the base persistence definition of the
 * Company entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCompany implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private Body body;
	private String name;
	private String regNumber;

	// Constructors

	/** default constructor */
	public AbstractCompany() {
	}

	/** minimal constructor */
	public AbstractCompany(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractCompany(BigDecimal id, Body body, String name,
			String regNumber) {
		this.id = id;
		this.body = body;
		this.name = name;
		this.regNumber = regNumber;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegNumber() {
		return this.regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

}