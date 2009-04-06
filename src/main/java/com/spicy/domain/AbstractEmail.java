package com.spicy.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractEmail entity provides the base persistence definition of the Email
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEmail implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private Type type;
	private Body body;
	private BigDecimal statusId;
	private String address;
	private Set bodiesForEmailId = new HashSet(0);
	private Set bodiesForWebpageId = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractEmail() {
	}

	/** minimal constructor */
	public AbstractEmail(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractEmail(BigDecimal id, Type type, Body body,
			BigDecimal statusId, String address, Set bodiesForEmailId,
			Set bodiesForWebpageId) {
		this.id = id;
		this.type = type;
		this.body = body;
		this.statusId = statusId;
		this.address = address;
		this.bodiesForEmailId = bodiesForEmailId;
		this.bodiesForWebpageId = bodiesForWebpageId;
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

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public BigDecimal getStatusId() {
		return this.statusId;
	}

	public void setStatusId(BigDecimal statusId) {
		this.statusId = statusId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set getBodiesForEmailId() {
		return this.bodiesForEmailId;
	}

	public void setBodiesForEmailId(Set bodiesForEmailId) {
		this.bodiesForEmailId = bodiesForEmailId;
	}

	public Set getBodiesForWebpageId() {
		return this.bodiesForWebpageId;
	}

	public void setBodiesForWebpageId(Set bodiesForWebpageId) {
		this.bodiesForWebpageId = bodiesForWebpageId;
	}

}