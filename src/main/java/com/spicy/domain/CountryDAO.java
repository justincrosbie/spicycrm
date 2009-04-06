package com.spicy.domain;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Country entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.spicy.domain.Country
 * @author MyEclipse Persistence Tools
 */

public class CountryDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(CountryDAO.class);
	// property constants
	public static final String CODE = "code";
	public static final String NAME = "name";
	public static final String IDC = "idc";

	public void save(Country transientInstance) {
		log.debug("saving Country instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Country persistentInstance) {
		log.debug("deleting Country instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Country findById(java.math.BigDecimal id) {
		log.debug("getting Country instance with id: " + id);
		try {
			Country instance = (Country) getSession().get(
					"com.spicy.domain.Country", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Country instance) {
		log.debug("finding Country instance by example");
		try {
			List results = getSession().createCriteria(
					"com.spicy.domain.Country").add(Example.create(instance))
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
		log.debug("finding Country instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Country as model where model."
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

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByIdc(Object idc) {
		return findByProperty(IDC, idc);
	}

	public List findAll() {
		log.debug("finding all Country instances");
		try {
			String queryString = "from Country";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Country merge(Country detachedInstance) {
		log.debug("merging Country instance");
		try {
			Country result = (Country) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Country instance) {
		log.debug("attaching dirty Country instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Country instance) {
		log.debug("attaching clean Country instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}