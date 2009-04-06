package com.spicy.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractTelephone entity provides the base persistence definition of the
 * Telephone entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTelephone implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private Type type;
	private Country country;
	private Body body;
	private String number;
	private String prefix;
	private String extension;
	private Set bodiesForMobilephoneId = new HashSet(0);
	private Set bodiesForWorkphoneId = new HashSet(0);
	private Set bodiesForFaxId = new HashSet(0);
	private Set bodiesForHomephoneId = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractTelephone() {
	}

	/** minimal constructor */
	public AbstractTelephone(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractTelephone(BigDecimal id, Type type, Country country,
			Body body, String number, String prefix, String extension,
			Set bodiesForMobilephoneId, Set bodiesForWorkphoneId,
			Set bodiesForFaxId, Set bodiesForHomephoneId) {
		this.id = id;
		this.type = type;
		this.country = country;
		this.body = body;
		this.number = number;
		this.prefix = prefix;
		this.extension = extension;
		this.bodiesForMobilephoneId = bodiesForMobilephoneId;
		this.bodiesForWorkphoneId = bodiesForWorkphoneId;
		this.bodiesForFaxId = bodiesForFaxId;
		this.bodiesForHomephoneId = bodiesForHomephoneId;
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

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPrefix() {
		return this.prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public Set getBodiesForMobilephoneId() {
		return this.bodiesForMobilephoneId;
	}

	public void setBodiesForMobilephoneId(Set bodiesForMobilephoneId) {
		this.bodiesForMobilephoneId = bodiesForMobilephoneId;
	}

	public Set getBodiesForWorkphoneId() {
		return this.bodiesForWorkphoneId;
	}

	public void setBodiesForWorkphoneId(Set bodiesForWorkphoneId) {
		this.bodiesForWorkphoneId = bodiesForWorkphoneId;
	}

	public Set getBodiesForFaxId() {
		return this.bodiesForFaxId;
	}

	public void setBodiesForFaxId(Set bodiesForFaxId) {
		this.bodiesForFaxId = bodiesForFaxId;
	}

	public Set getBodiesForHomephoneId() {
		return this.bodiesForHomephoneId;
	}

	public void setBodiesForHomephoneId(Set bodiesForHomephoneId) {
		this.bodiesForHomephoneId = bodiesForHomephoneId;
	}

}