package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * AbstractAttributevalue entity provides the base persistence definition of the
 * Attributevalue entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAttributevalue implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private Revenuetransaction revenuetransaction;
	private Attribute attribute;
	private Transaction transaction;
	private Body body;
	private String value;
	private Date created;
	private Date modified;
	private Date deleted;

	// Constructors

	/** default constructor */
	public AbstractAttributevalue() {
	}

	/** minimal constructor */
	public AbstractAttributevalue(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractAttributevalue(BigDecimal id,
			Revenuetransaction revenuetransaction, Attribute attribute,
			Transaction transaction, Body body, String value, Date created,
			Date modified, Date deleted) {
		this.id = id;
		this.revenuetransaction = revenuetransaction;
		this.attribute = attribute;
		this.transaction = transaction;
		this.body = body;
		this.value = value;
		this.created = created;
		this.modified = modified;
		this.deleted = deleted;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Revenuetransaction getRevenuetransaction() {
		return this.revenuetransaction;
	}

	public void setRevenuetransaction(Revenuetransaction revenuetransaction) {
		this.revenuetransaction = revenuetransaction;
	}

	public Attribute getAttribute() {
		return this.attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

	public Transaction getTransaction() {
		return this.transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
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

}