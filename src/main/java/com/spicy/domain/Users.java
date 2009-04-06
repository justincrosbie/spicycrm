package com.spicy.domain;

import java.util.Date;
import java.util.Set;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */
public class Users extends AbstractUsers implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users(Long id) {
		super(id);
	}

	/** full constructor */
	public Users(Long id, String name, String password, Date created,
			Date modified, Date deleted, Set sources) {
		super(id, name, password, created, modified, deleted, sources);
	}

}
