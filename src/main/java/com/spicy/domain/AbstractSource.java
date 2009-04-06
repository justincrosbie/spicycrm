package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractSource entity provides the base persistence definition of the Source
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSource implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private Users users;
	private String name;
	private Date created;
	private Date modified;
	private Date deleted;
	private BigDecimal isActive;
	private Set bodies = new HashSet(0);
	private Set items = new HashSet(0);
	private Set locations = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractSource() {
	}

	/** minimal constructor */
	public AbstractSource(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractSource(BigDecimal id, Users users, String name,
			Date created, Date modified, Date deleted, BigDecimal isActive,
			Set bodies, Set items, Set locations) {
		this.id = id;
		this.users = users;
		this.name = name;
		this.created = created;
		this.modified = modified;
		this.deleted = deleted;
		this.isActive = isActive;
		this.bodies = bodies;
		this.items = items;
		this.locations = locations;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Set getBodies() {
		return this.bodies;
	}

	public void setBodies(Set bodies) {
		this.bodies = bodies;
	}

	public Set getItems() {
		return this.items;
	}

	public void setItems(Set items) {
		this.items = items;
	}

	public Set getLocations() {
		return this.locations;
	}

	public void setLocations(Set locations) {
		this.locations = locations;
	}

}