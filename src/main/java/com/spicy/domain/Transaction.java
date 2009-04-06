package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
 * Transaction entity. @author MyEclipse Persistence Tools
 */
public class Transaction extends AbstractTransaction implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Transaction() {
	}

	/** minimal constructor */
	public Transaction(BigDecimal id) {
		super(id);
	}

	/** full constructor */
	public Transaction(BigDecimal id, Location location, Type type, Body body,
			Status status, String code, String comments, Date starttime,
			Date endtime, Date created, BigDecimal value,
			Set revenuetransactions, Set attributevalues) {
		super(id, location, type, body, status, code, comments, starttime,
				endtime, created, value, revenuetransactions, attributevalues);
	}

}
