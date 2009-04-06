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
 * Telephone entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.spicy.domain.Telephone
 * @author MyEclipse Persistence Tools
 */

public class TelephoneDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TelephoneDAO.class);
	// property constants
	public static final String NUMBER = "number";
	public static final String PREFIX = "prefix";
	public static final String EXTENSION = "extension";

	public void save(Telephone transientInstance) {
		log.debug("saving Telephone instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Telephone persistentInstance) {
		log.debug("deleting Telephone instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Telephone findById(java.math.BigDecimal id) {
		log.debug("getting Telephone instance with id: " + id);
		try {
			Telephone instance = (Telephone) getSession().get(
					"com.spicy.domain.Telephone", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Telephone instance) {
		log.debug("finding Telephone instance by example");
		try {
			List results = getSession().createCriteria(
					"com.spicy.domain.Telephone").add(Example.create(instance))
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
		log.debug("finding Telephone instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Telephone as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByNumber(Object number) {
		return findByProperty(NUMBER, number);
	}

	public List findByPrefix(Object prefix) {
		return findByProperty(PREFIX, prefix);
	}

	public List findByExtension(Object extension) {
		return findByProperty(EXTENSION, extension);
	}

	public List findAll() {
		log.debug("finding all Telephone instances");
		try {
			String queryString = "from Telephone";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Telephone merge(Telephone detachedInstance) {
		log.debug("merging Telephone instance");
		try {
			Telephone result = (Telephone) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Telephone instance) {
		log.debug("attaching dirty Telephone instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Telephone instance) {
		log.debug("attaching clean Telephone instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}