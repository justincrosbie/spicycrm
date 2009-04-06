package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractTransaction entity provides the base persistence definition of the
 * Transaction entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTransaction implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private Location location;
	private Type type;
	private Body body;
	private Status status;
	private String code;
	private String comments;
	private Date starttime;
	private Date endtime;
	private Date created;
	private BigDecimal value;
	private Set revenuetransactions = new HashSet(0);
	private Set attributevalues = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractTransaction() {
	}

	/** minimal constructor */
	public AbstractTransaction(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractTransaction(BigDecimal id, Location location, Type type,
			Body body, Status status, String code, String comments,
			Date starttime, Date endtime, Date created, BigDecimal value,
			Set revenuetransactions, Set attributevalues) {
		this.id = id;
		this.location = location;
		this.type = type;
		this.body = body;
		this.status = status;
		this.code = code;
		this.comments = comments;
		this.starttime = starttime;
		this.endtime = endtime;
		this.created = created;
		this.value = value;
		this.revenuetransactions = revenuetransactions;
		this.attributevalues = attributevalues;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Type getType() {
		return this.type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getStarttime() {
		return this.starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public Set getRevenuetransactions() {
		return this.revenuetransactions;
	}

	public void setRevenuetransactions(Set revenuetransactions) {
		this.revenuetransactions = revenuetransactions;
	}

	public Set getAttributevalues() {
		return this.attributevalues;
	}

	public void setAttributevalues(Set attributevalues) {
		this.attributevalues = attributevalues;
	}

}