package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Set;

/**
 * Telephone entity. @author MyEclipse Persistence Tools
 */
public class Telephone extends AbstractTelephone implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Telephone() {
	}

	/** minimal constructor */
	public Telephone(BigDecimal id) {
		super(id);
	}

	/** full constructor */
	public Telephone(BigDecimal id, Type type, Country country, Body body,
			String number, String prefix, String extension,
			Set bodiesForMobilephoneId, Set bodiesForWorkphoneId,
			Set bodiesForFaxId, Set bodiesForHomephoneId) {
		super(id, type, country, body, number, prefix, extension,
				bodiesForMobilephoneId, bodiesForWorkphoneId, bodiesForFaxId,
				bodiesForHomephoneId);
	}

}
