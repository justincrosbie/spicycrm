package com.spicy.domain;

import java.math.BigDecimal;

/**
 * Company entity. @author MyEclipse Persistence Tools
 */
public class Company extends AbstractCompany implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Company() {
	}

	/** minimal constructor */
	public Company(BigDecimal id) {
		super(id);
	}

	/** full constructor */
	public Company(BigDecimal id, Body body, String name, String regNumber) {
		super(id, body, name, regNumber);
	}

}
