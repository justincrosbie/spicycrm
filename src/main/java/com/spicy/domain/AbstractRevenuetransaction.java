package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractRevenuetransaction entity provides the base persistence definition of
 * the Revenuetransaction entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRevenuetransaction implements
		java.io.Serializable {

	// Fields

	private BigDecimal id;
	private Location location;
	private Currency currency;
	private Type type;
	private Transaction transaction;
	private Item item;
	private Body body;
	private Status status;
	private BigDecimal amount;
	private Date datespent;
	private Set attributevalues = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractRevenuetransaction() {
	}

	/** minimal constructor */
	public AbstractRevenuetransaction(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractRevenuetransaction(BigDecimal id, Location location,
			Currency currency, Type type, Transaction transaction, Item item,
			Body body, Status status, BigDecimal amount, Date datespent,
			Set attributevalues) {
		this.id = id;
		this.location = location;
		this.currency = currency;
		this.type = type;
		this.transaction = transaction;
		this.item = item;
		this.body = body;
		this.status = status;
		this.amount = amount;
		this.datespent = datespent;
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

	public Currency getCurrency() {
		return this.currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Type getType() {
		return this.type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Transaction getTransaction() {
		return this.transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
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

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getDatespent() {
		return this.datespent;
	}

	public void setDatespent(Date datespent) {
		this.datespent = datespent;
	}

	public Set getAttributevalues() {
		return this.attributevalues;
	}

	public void setAttributevalues(Set attributevalues) {
		this.attributevalues = attributevalues;
	}

}