package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Set;

/**
 * Currency entity. @author MyEclipse Persistence Tools
 */
public class Currency extends AbstractCurrency implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Currency() {
	}

	/** minimal constructor */
	public Currency(BigDecimal id) {
		super(id);
	}

	/** full constructor */
	public Currency(BigDecimal id, String name, String symbol, BigDecimal rate,
			Set revenuetransactions) {
		super(id, name, symbol, rate, revenuetransactions);
	}

}
