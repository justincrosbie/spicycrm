package com.spicy.domain;

import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Attributevalue entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.spicy.domain.Attributevalue
 * @author MyEclipse Persistence Tools
 */

public class AttributevalueDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(AttributevalueDAO.class);
	// property constants
	public static final String VALUE = "value";

	public void save(Attributevalue transientInstance) {
		log.debug("saving Attributevalue instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Attributevalue persistentInstance) {
		log.debug("deleting Attributevalue instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Attributevalue findById(java.math.BigDecimal id) {
		log.debug("getting Attributevalue instance with id: " + id);
		try {
			Attributevalue instance = (Attributevalue) getSession().get(
					"com.spicy.domain.Attributevalue", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Attributevalue instance) {
		log.debug("finding Attributevalue instance by example");
		try {
			List results = getSession().createCriteria(
					"com.spicy.domain.Attributevalue").add(
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
		log.debug("finding Attributevalue instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Attributevalue as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByValue(Object value) {
		return findByProperty(VALUE, value);
	}

	public List findAll() {
		log.debug("finding all Attributevalue instances");
		try {
			String queryString = "from Attributevalue";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Attributevalue merge(Attributevalue detachedInstance) {
		log.debug("merging Attributevalue instance");
		try {
			Attributevalue result = (Attributevalue) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Attributevalue instance) {
		log.debug("attaching dirty Attributevalue instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Attributevalue instance) {
		log.debug("attaching clean Attributevalue instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}