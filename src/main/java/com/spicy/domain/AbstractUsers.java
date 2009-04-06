package com.spicy.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractUsers entity provides the base persistence definition of the Users
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUsers implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;
	private String password;
	private Date created;
	private Date modified;
	private Date deleted;
	private Set sources = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractUsers() {
	}

	/** minimal constructor */
	public AbstractUsers(Long id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractUsers(Long id, String name, String password,
			Date created, Date modified, Date deleted, Set sources) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.created = created;
		this.modified = modified;
		this.deleted = deleted;
		this.sources = sources;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Set getSources() {
		return this.sources;
	}

	public void setSources(Set sources) {
		this.sources = sources;
	}

}