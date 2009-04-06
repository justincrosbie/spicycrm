package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * AbstractPerson entity provides the base persistence definition of the Person
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPerson implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private Body body;
	private String gender;
	private String title;
	private String firstname;
	private String lastname;
	private Date dob;

	// Constructors

	/** default constructor */
	public AbstractPerson() {
	}

	/** minimal constructor */
	public AbstractPerson(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractPerson(BigDecimal id, Body body, String gender,
			String title, String firstname, String lastname, Date dob) {
		this.id = id;
		this.body = body;
		this.gender = gender;
		this.title = title;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}