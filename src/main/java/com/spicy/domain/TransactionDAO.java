package com.spicy.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Transaction entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.spicy.domain.Transaction
 * @author MyEclipse Persistence Tools
 */

public class TransactionDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TransactionDAO.class);
	// property constants
	public static final String CODE = "code";
	public static final String COMMENTS = "comments";

	public void save(Transaction transientInstance) {
		log.debug("saving Transaction instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Transaction persistentInstance) {
		log.debug("deleting Transaction instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Transaction findById(java.math.BigDecimal id) {
		log.debug("getting Transaction instance with id: " + id);
		try {
			Transaction instance = (Transaction) getSession().get(
					"com.spicy.domain.Transaction", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Transaction instance) {
		log.debug("finding Transaction instance by example");
		try {
			List results = getSession().createCriteria(
					"com.spicy.domain.Transaction").add(
					Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Transaction instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Transaction as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCode(Object code) {
		return findByProperty(CODE, code);
	}

	public List findByComments(Object comments) {
		return findByProperty(COMMENTS, comments);
	}

	public List findAll() {
		log.debug("finding all Transaction instances");
		try {
			String queryString = "from Transaction";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Transaction merge(Transaction detachedInstance) {
		log.debug("merging Transaction instance");
		try {
			Transaction result = (Transaction) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Transaction instance) {
		log.debug("attaching dirty Transaction instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Transaction instance) {
		log.debug("attaching clean Transaction instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}