package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractAttribute entity provides the base persistence definition of the
 * Attribute entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAttribute implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private Type type;
	private Category category;
	private Status status;
	private String name;
	private String description;
	private Date created;
	private Date modified;
	private Date deleted;
	private BigDecimal isActive;
	private Set attributevalues = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractAttribute() {
	}

	/** minimal constructor */
	public AbstractAttribute(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractAttribute(BigDecimal id, Type type, Category category,
			Status status, String name, String description, Date created,
			Date modified, Date deleted, BigDecimal isActive,
			Set attributevalues) {
		this.id = id;
		this.type = type;
		this.category = category;
		this.status = status;
		this.name = name;
		this.description = description;
		this.created = created;
		this.modified = modified;
		this.deleted = deleted;
		this.isActive = isActive;
		this.attributevalues = attributevalues;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Type getType() {
		return this.type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
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

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return this.modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Date getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Date deleted) {
		this.deleted = deleted;
	}

	public BigDecimal getIsActive() {
		return this.isActive;
	}

	public void setIsActive(BigDecimal isActive) {
		this.isActive = isActive;
	}

	public Set getAttributevalues() {
		return this.attributevalues;
	}

	public void setAttributevalues(Set attributevalues) {
		this.attributevalues = attributevalues;
	}

}