package com.spicy.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractItem entity provides the base persistence definition of the Item
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractItem implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private Location location;
	private Type type;
	private Source source;
	private Status status;
	private String name;
	private String description;
	private BigDecimal value;
	private Set revenuetransactions = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractItem() {
	}

	/** minimal constructor */
	public AbstractItem(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractItem(BigDecimal id, Location location, Type type,
			Source source, Status status, String name, String description,
			BigDecimal value, Set revenuetransactions) {
		this.id = id;
		this.location = location;
		this.type = type;
		this.source = source;
		this.status = status;
		this.name = name;
		this.description = description;
		this.value = value;
		this.revenuetransactions = revenuetransactions;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Type getType() {
		return this.type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Source getSource() {
		return this.source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public Set getRevenuetransactions() {
		return this.revenuetransactions;
	}

	public void setRevenuetransactions(Set revenuetransactions) {
		this.revenuetransactions = revenuetransactions;
	}

}