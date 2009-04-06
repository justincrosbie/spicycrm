package com.spicy.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractCurrency entity provides the base persistence definition of the
 * Currency entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCurrency implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private String name;
	private String symbol;
	private BigDecimal rate;
	private Set revenuetransactions = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractCurrency() {
	}

	/** minimal constructor */
	public AbstractCurrency(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractCurrency(BigDecimal id, String name, String symbol,
			BigDecimal rate, Set revenuetransactions) {
		this.id = id;
		this.name = name;
		this.symbol = symbol;
		this.rate = rate;
		this.revenuetransactions = revenuetransactions;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbol() {
		return this.symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public Set getRevenuetransactions() {
		return this.revenuetransactions;
	}

	public void setRevenuetransactions(Set revenuetransactions) {
		this.revenuetransactions = revenuetransactions;
	}

}