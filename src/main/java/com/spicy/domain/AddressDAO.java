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
 * Address entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.spicy.domain.Address
 * @author MyEclipse Persistence Tools
 */

public class AddressDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(AddressDAO.class);
	// property constants
	public static final String HOUSENUMBER = "housenumber";
	public static final String STREET = "street";
	public static final String LOCALITY = "locality";

	public void save(Address transientInstance) {
		log.debug("saving Address instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Address persistentInstance) {
		log.debug("deleting Address instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Address findById(java.math.BigDecimal id) {
		log.debug("getting Address instance with id: " + id);
		try {
			Address instance = (Address) getSession().get(
					"com.spicy.domain.Address", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Address instance) {
		log.debug("finding Address instance by example");
		try {
			List results = getSession().createCriteria(
					"com.spicy.domain.Address").add(Example.create(instance))
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
		log.debug("finding Address instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Address as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByHousenumber(Object housenumber) {
		return findByProperty(HOUSENUMBER, housenumber);
	}

	public List findByStreet(Object street) {
		return findByProperty(STREET, street);
	}

	public List findByLocality(Object locality) {
		return findByProperty(LOCALITY, locality);
	}

	public List findAll() {
		log.debug("finding all Address instances");
		try {
			String queryString = "from Address";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Address merge(Address detachedInstance) {
		log.debug("merging Address instance");
		try {
			Address result = (Address) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Address instance) {
		log.debug("attaching dirty Address instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Address instance) {
		log.debug("attaching clean Address instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}