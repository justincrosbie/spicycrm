package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
 * Revenuetransaction entity. @author MyEclipse Persistence Tools
 */
public class Revenuetransaction extends AbstractRevenuetransaction implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Revenuetransaction() {
	}

	/** minimal constructor */
	public Revenuetransaction(BigDecimal id) {
		super(id);
	}

	/** full constructor */
	public Revenuetransaction(BigDecimal id, Location location,
			Currency currency, Type type, Transaction transaction, Item item,
			Body body, Status status, BigDecimal amount, Date datespent,
			Set attributevalues) {
		super(id, location, currency, type, transaction, item, body, status,
				amount, datespent, attributevalues);
	}

}
