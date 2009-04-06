package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Attributevalue entity. @author MyEclipse Persistence Tools
 */
public class Attributevalue extends AbstractAttributevalue implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Attributevalue() {
	}

	/** minimal constructor */
	public Attributevalue(BigDecimal id) {
		super(id);
	}

	/** full constructor */
	public Attributevalue(BigDecimal id, Revenuetransaction revenuetransaction,
			Attribute attribute, Transaction transaction, Body body,
			String value, Date created, Date modified, Date deleted) {
		super(id, revenuetransaction, attribute, transaction, body, value,
				created, modified, deleted);
	}

}
