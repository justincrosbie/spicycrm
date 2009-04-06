package com.spicy.domain;

import java.math.BigDecimal;

/**
 * AbstractGroupmembers entity provides the base persistence definition of the
 * Groupmembers entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGroupmembers implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private Groups groups;
	private Body body;

	// Constructors

	/** default constructor */
	public AbstractGroupmembers() {
	}

	/** minimal constructor */
	public AbstractGroupmembers(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractGroupmembers(BigDecimal id, Groups groups, Body body) {
		this.id = id;
		this.groups = groups;
		this.body = body;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Groups getGroups() {
		return this.groups;
	}

	public void setGroups(Groups groups) {
		this.groups = groups;
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

}