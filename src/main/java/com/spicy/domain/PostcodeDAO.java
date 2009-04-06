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
 * Postcode entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.spicy.domain.Postcode
 * @author MyEclipse Persistence Tools
 */

public class PostcodeDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(PostcodeDAO.class);
	// property constants
	public static final String CODE = "code";

	public void save(Postcode transientInstance) {
		log.debug("saving Postcode instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Postcode persistentInstance) {
		log.debug("deleting Postcode instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Postcode findById(java.math.BigDecimal id) {
		log.debug("getting Postcode instance with id: " + id);
		try {
			Postcode instance = (Postcode) getSession().get(
					"com.spicy.domain.Postcode", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Postcode instance) {
		log.debug("finding Postcode instance by example");
		try {
			List results = getSession().createCriteria(
					"com.spicy.domain.Postcode").add(Example.create(instance))
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
		log.debug("finding Postcode instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Postcode as model where model."
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

	public List findAll() {
		log.debug("finding all Postcode instances");
		try {
			String queryString = "from Postcode";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Postcode merge(Postcode detachedInstance) {
		log.debug("merging Postcode instance");
		try {
			Postcode result = (Postcode) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Postcode instance) {
		log.debug("attaching dirty Postcode instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Postcode instance) {
		log.debug("attaching clean Postcode instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}