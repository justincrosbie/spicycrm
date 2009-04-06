package com.spicy.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractBody entity provides the base persistence definition of the Body
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBody implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private Telephone telephoneByWorkphoneId;
	private Telephone telephoneByFaxId;
	private Address addressByWorkaddressId;
	private Telephone telephoneByMobilephoneId;
	private Email emailByWebpageId;
	private Email emailByEmailId;
	private Telephone telephoneByHomephoneId;
	private Type type;
	private Address addressByHomeaddressId;
	private Source source;
	private Status status;
	private Set telephones = new HashSet(0);
	private Set addresses = new HashSet(0);
	private Set emails = new HashSet(0);
	private Set attributevalues = new HashSet(0);
	private Set transactions = new HashSet(0);
	private Set persons = new HashSet(0);
	private Set companies = new HashSet(0);
	private Set groupmemberses = new HashSet(0);
	private Set revenuetransactions = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractBody() {
	}

	/** minimal constructor */
	public AbstractBody(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractBody(BigDecimal id, Telephone telephoneByWorkphoneId,
			Telephone telephoneByFaxId, Address addressByWorkaddressId,
			Telephone telephoneByMobilephoneId, Email emailByWebpageId,
			Email emailByEmailId, Telephone telephoneByHomephoneId, Type type,
			Address addressByHomeaddressId, Source source, Status status,
			Set telephones, Set addresses, Set emails, Set attributevalues,
			Set transactions, Set persons, Set companies, Set groupmemberses,
			Set revenuetransactions) {
		this.id = id;
		this.telephoneByWorkphoneId = telephoneByWorkphoneId;
		this.telephoneByFaxId = telephoneByFaxId;
		this.addressByWorkaddressId = addressByWorkaddressId;
		this.telephoneByMobilephoneId = telephoneByMobilephoneId;
		this.emailByWebpageId = emailByWebpageId;
		this.emailByEmailId = emailByEmailId;
		this.telephoneByHomephoneId = telephoneByHomephoneId;
		this.type = type;
		this.addressByHomeaddressId = addressByHomeaddressId;
		this.source = source;
		this.status = status;
		this.telephones = telephones;
		this.addresses = addresses;
		this.emails = emails;
		this.attributevalues = attributevalues;
		this.transactions = transactions;
		this.persons = persons;
		this.companies = companies;
		this.groupmemberses = groupmemberses;
		this.revenuetransactions = revenuetransactions;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Telephone getTelephoneByWorkphoneId() {
		return this.telephoneByWorkphoneId;
	}

	public void setTelephoneByWorkphoneId(Telephone telephoneByWorkphoneId) {
		this.telephoneByWorkphoneId = telephoneByWorkphoneId;
	}

	public Telephone getTelephoneByFaxId() {
		return this.telephoneByFaxId;
	}

	public void setTelephoneByFaxId(Telephone telephoneByFaxId) {
		this.telephoneByFaxId = telephoneByFaxId;
	}

	public Address getAddressByWorkaddressId() {
		return this.addressByWorkaddressId;
	}

	public void setAddressByWorkaddressId(Address addressByWorkaddressId) {
		this.addressByWorkaddressId = addressByWorkaddressId;
	}

	public Telephone getTelephoneByMobilephoneId() {
		return this.telephoneByMobilephoneId;
	}

	public void setTelephoneByMobilephoneId(Telephone telephoneByMobilephoneId) {
		this.telephoneByMobilephoneId = telephoneByMobilephoneId;
	}

	public Email getEmailByWebpageId() {
		return this.emailByWebpageId;
	}

	public void setEmailByWebpageId(Email emailByWebpageId) {
		this.emailByWebpageId = emailByWebpageId;
	}

	public Email getEmailByEmailId() {
		return this.emailByEmailId;
	}

	public void setEmailByEmailId(Email emailByEmailId) {
		this.emailByEmailId = emailByEmailId;
	}

	public Telephone getTelephoneByHomephoneId() {
		return this.telephoneByHomephoneId;
	}

	public void setTelephoneByHomephoneId(Telephone telephoneByHomephoneId) {
		this.telephoneByHomephoneId = telephoneByHomephoneId;
	}

	public Type getType() {
		return this.type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Address getAddressByHomeaddressId() {
		return this.addressByHomeaddressId;
	}

	public void setAddressByHomeaddressId(Address addressByHomeaddressId) {
		this.addressByHomeaddressId = addressByHomeaddressId;
	}

	public Source getSource() {
		return this.source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Set getTelephones() {
		return this.telephones;
	}

	public void setTelephones(Set telephones) {
		this.telephones = telephones;
	}

	public Set getAddresses() {
		return this.addresses;
	}

	public void setAddresses(Set addresses) {
		this.addresses = addresses;
	}

	public Set getEmails() {
		return this.emails;
	}

	public void setEmails(Set emails) {
		this.emails = emails;
	}

	public Set getAttributevalues() {
		return this.attributevalues;
	}

	public void setAttributevalues(Set attributevalues) {
		this.attributevalues = attributevalues;
	}

	public Set getTransactions() {
		return this.transactions;
	}

	public void setTransactions(Set transactions) {
		this.transactions = transactions;
	}

	public Set getPersons() {
		return this.persons;
	}

	public void setPersons(Set persons) {
		this.persons = persons;
	}

	public Set getCompanies() {
		return this.companies;
	}

	public void setCompanies(Set companies) {
		this.companies = companies;
	}

	public Set getGroupmemberses() {
		return this.groupmemberses;
	}

	public void setGroupmemberses(Set groupmemberses) {
		this.groupmemberses = groupmemberses;
	}

	public Set getRevenuetransactions() {
		return this.revenuetransactions;
	}

	public void setRevenuetransactions(Set revenuetransactions) {
		this.revenuetransactions = revenuetransactions;
	}

}