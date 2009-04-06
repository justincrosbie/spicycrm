package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Set;

/**
 * Email entity. @author MyEclipse Persistence Tools
 */
public class Email extends AbstractEmail implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Email() {
	}

	/** minimal constructor */
	public Email(BigDecimal id) {
		super(id);
	}

	/** full constructor */
	public Email(BigDecimal id, Type type, Body body, BigDecimal statusId,
			String address, Set bodiesForEmailId, Set bodiesForWebpageId) {
		super(id, type, body, statusId, address, bodiesForEmailId,
				bodiesForWebpageId);
	}

}
