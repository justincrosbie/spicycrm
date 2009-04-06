package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Set;

/**
 * Body entity. @author MyEclipse Persistence Tools
 */
public class Body extends AbstractBody implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Body() {
	}

	/** minimal constructor */
	public Body(BigDecimal id) {
		super(id);
	}

	/** full constructor */
	public Body(BigDecimal id, Telephone telephoneByWorkphoneId,
			Telephone telephoneByFaxId, Address addressByWorkaddressId,
			Telephone telephoneByMobilephoneId, Email emailByWebpageId,
			Email emailByEmailId, Telephone telephoneByHomephoneId, Type type,
			Address addressByHomeaddressId, Source source, Status status,
			Set telephones, Set addresses, Set emails, Set attributevalues,
			Set transactions, Set persons, Set companies, Set groupmemberses,
			Set revenuetransactions) {
		super(id, telephoneByWorkphoneId, telephoneByFaxId,
				addressByWorkaddressId, telephoneByMobilephoneId,
				emailByWebpageId, emailByEmailId, telephoneByHomephoneId, type,
				addressByHomeaddressId, source, status, telephones, addresses,
				emails, attributevalues, transactions, persons, companies,
				groupmemberses, revenuetransactions);
	}

}
