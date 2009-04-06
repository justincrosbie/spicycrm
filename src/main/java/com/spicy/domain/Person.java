package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Person entity. @author MyEclipse Persistence Tools
 */
public class Person extends AbstractPerson implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Person() {
	}

	/** minimal constructor */
	public Person(BigDecimal id) {
		super(id);
	}

	/** full constructor */
	public Person(BigDecimal id, Body body, String gender, String title,
			String firstname, String lastname, Date dob) {
		super(id, body, gender, title, firstname, lastname, dob);
	}

}
