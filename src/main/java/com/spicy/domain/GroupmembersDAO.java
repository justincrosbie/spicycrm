package com.spicy.domain;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Groupmembers entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.spicy.domain.Groupmembers
 * @author MyEclipse Persistence Tools
 */

public class GroupmembersDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(GroupmembersDAO.class);

	// property constants

	public void save(Groupmembers transientInstance) {
		log.debug("saving Groupmembers instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Groupmembers persistentInstance) {
		log.debug("deleting Groupmembers instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Groupmembers findById(java.math.BigDecimal id) {
		log.debug("getting Groupmembers instance with id: " + id);
		try {
			Groupmembers instance = (Groupmembers) getSession().get(
					"com.spicy.domain.Groupmembers", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Groupmembers instance) {
		log.debug("finding Groupmembers instance by example");
		try {
			List results = getSession().createCriteria(
					"com.spicy.domain.Groupmembers").add(
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
		log.debug("finding Groupmembers instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Groupmembers as model where model."
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
		log.debug("finding all Groupmembers instances");
		try {
			String queryString = "from Groupmembers";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Groupmembers merge(Groupmembers detachedInstance) {
		log.debug("merging Groupmembers instance");
		try {
			Groupmembers result = (Groupmembers) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Groupmembers instance) {
		log.debug("attaching dirty Groupmembers instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Groupmembers instance) {
		log.debug("attaching clean Groupmembers instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}