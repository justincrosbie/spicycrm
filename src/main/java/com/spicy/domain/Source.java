package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
 * Source entity. @author MyEclipse Persistence Tools
 */
public class Source extends AbstractSource implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Source() {
	}

	/** minimal constructor */
	public Source(BigDecimal id) {
		super(id);
	}

	/** full constructor */
	public Source(BigDecimal id, Users users, String name, Date created,
			Date modified, Date deleted, BigDecimal isActive, Set bodies,
			Set items, Set locations) {
		super(id, users, name, created, modified, deleted, isActive, bodies,
				items, locations);
	}

}
