package com.spicy.domain;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Currency entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.spicy.domain.Currency
 * @author MyEclipse Persistence Tools
 */

public class CurrencyDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(CurrencyDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String SYMBOL = "symbol";

	public void save(Currency transientInstance) {
		log.debug("saving Currency instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Currency persistentInstance) {
		log.debug("deleting Currency instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Currency findById(java.math.BigDecimal id) {
		log.debug("getting Currency instance with id: " + id);
		try {
			Currency instance = (Currency) getSession().get(
					"com.spicy.domain.Currency", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Currency instance) {
		log.debug("finding Currency instance by example");
		try {
			List results = getSession().createCriteria(
					"com.spicy.domain.Currency").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Currency instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Currency as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findBySymbol(Object symbol) {
		return findByProperty(SYMBOL, symbol);
	}

	public List findAll() {
		log.debug("finding all Currency instances");
		try {
			String queryString = "from Currency";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Currency merge(Currency detachedInstance) {
		log.debug("merging Currency instance");
		try {
			Currency result = (Currency) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Currency instance) {
		log.debug("attaching dirty Currency instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Currency instance) {
		log.debug("attaching clean Currency instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}