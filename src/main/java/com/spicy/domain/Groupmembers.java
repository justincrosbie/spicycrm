package com.spicy.domain;

import java.math.BigDecimal;

/**
 * Groupmembers entity. @author MyEclipse Persistence Tools
 */
public class Groupmembers extends AbstractGroupmembers implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Groupmembers() {
	}

	/** minimal constructor */
	public Groupmembers(BigDecimal id) {
		super(id);
	}

	/** full constructor */
	public Groupmembers(BigDecimal id, Groups groups, Body body) {
		super(id, groups, body);
	}

}
