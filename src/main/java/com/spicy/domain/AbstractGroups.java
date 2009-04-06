package com.spicy.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractGroups entity provides the base persistence definition of the Groups
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGroups implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private String name;
	private String description;
	private String rule;
	private Set groupmemberses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractGroups() {
	}

	/** minimal constructor */
	public AbstractGroups(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractGroups(BigDecimal id, String name, String description,
			String rule, Set groupmemberses) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.rule = rule;
		this.groupmemberses = groupmemberses;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRule() {
		return this.rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

	public Set getGroupmemberses() {
		return this.groupmemberses;
	}

	public void setGroupmemberses(Set groupmemberses) {
		this.groupmemberses = groupmemberses;
	}

}