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
 * Revenuetransaction entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.spicy.domain.Revenuetransaction
 * @author MyEclipse Persistence Tools
 */

public class RevenuetransactionDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory
			.getLog(RevenuetransactionDAO.class);

	// property constants

	public void save(Revenuetransaction transientInstance) {
		log.debug("saving Revenuetransaction instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Revenuetransaction persistentInstance) {
		log.debug("deleting Revenuetransaction instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Revenuetransaction findById(java.math.BigDecimal id) {
		log.debug("getting Revenuetransaction instance with id: " + id);
		try {
			Revenuetransaction instance = (Revenuetransaction) getSession()
					.get("com.spicy.domain.Revenuetransaction", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Revenuetransaction instance) {
		log.debug("finding Revenuetransaction instance by example");
		try {
			List results = getSession().createCriteria(
					"com.spicy.domain.Revenuetransaction").add(
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
		log.debug("finding Revenuetransaction instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Revenuetransaction as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Revenuetransaction instances");
		try {
			String queryString = "from Revenuetransaction";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Revenuetransaction merge(Revenuetransaction detachedInstance) {
		log.debug("merging Revenuetransaction instance");
		try {
			Revenuetransaction result = (Revenuetransaction) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Revenuetransaction instance) {
		log.debug("attaching dirty Revenuetransaction instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Revenuetransaction instance) {
		log.debug("attaching clean Revenuetransaction instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}