package com.spicy.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractLocation entity provides the base persistence definition of the
 * Location entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLocation implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private Type type;
	private Source source;
	private Status status;
	private String name;
	private String description;
	private Set transactions = new HashSet(0);
	private Set revenuetransactions = new HashSet(0);
	private Set items = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractLocation() {
	}

	/** minimal constructor */
	public AbstractLocation(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractLocation(BigDecimal id, Type type, Source source,
			Status status, String name, String description, Set transactions,
			Set revenuetransactions, Set items) {
		this.id = id;
		this.type = type;
		this.source = source;
		this.status = status;
		this.name = name;
		this.description = description;
		this.transactions = transactions;
		this.revenuetransactions = revenuetransactions;
		this.items = items;
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

	public Set getItems() {
		return this.items;
	}

	public void setItems(Set items) {
		this.items = items;
	}

}