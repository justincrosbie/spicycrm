package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Set;

/**
 * Groups entity. @author MyEclipse Persistence Tools
 */
public class Groups extends AbstractGroups implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Groups() {
	}

	/** minimal constructor */
	public Groups(BigDecimal id) {
		super(id);
	}

	/** full constructor */
	public Groups(BigDecimal id, String name, String description, String rule,
			Set groupmemberses) {
		super(id, name, description, rule, groupmemberses);
	}

}
