package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractStatus entity provides the base persistence definition of the Status
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractStatus implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private Type type;
	private String status;
	private String description;
	private Date created;
	private Date modified;
	private Date deleted;
	private BigDecimal isActive;
	private Set bodies = new HashSet(0);
	private Set items = new HashSet(0);
	private Set transactions = new HashSet(0);
	private Set revenuetransactions = new HashSet(0);
	private Set attributes = new HashSet(0);
	private Set locations = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractStatus() {
	}

	/** minimal constructor */
	public AbstractStatus(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractStatus(BigDecimal id, Type type, String status,
			String description, Date created, Date modified, Date deleted,
			BigDecimal isActive, Set bodies, Set items, Set transactions,
			Set revenuetransactions, Set attributes, Set locations) {
		this.id = id;
		this.type = type;
		this.status = status;
		this.description = description;
		this.created = created;
		this.modified = modified;
		this.deleted = deleted;
		this.isActive = isActive;
		this.bodies = bodies;
		this.items = items;
		this.transactions = transactions;
		this.revenuetransactions = revenuetransactions;
		this.attributes = attributes;
		this.locations = locations;
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return this.modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Date getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Date deleted) {
		this.deleted = deleted;
	}

	public BigDecimal getIsActive() {
		return this.isActive;
	}

	public void setIsActive(BigDecimal isActive) {
		this.isActive = isActive;
	}

	public Set getBodies() {
		return this.bodies;
	}

	public void setBodies(Set bodies) {
		this.bodies = bodies;
	}

	public Set getItems() {
		return this.items;
	}

	public void setItems(Set items) {
		this.items = items;
	}

	public Set getTransactions() {
		return this.transactions;
	}

	public void setTransactions(Set transactions) {
		this.transactions = transactions;
	}

	public Set getRevenuetransactions() {
		return this.revenuetransactions;
	}

	public void setRevenuetransactions(Set revenuetransactions) {
		this.revenuetransactions = revenuetransactions;
	}

	public Set getAttributes() {
		return this.attributes;
	}

	public void setAttributes(Set attributes) {
		this.attributes = attributes;
	}

	public Set getLocations() {
		return this.locations;
	}

	public void setLocations(Set locations) {
		this.locations = locations;
	}

}