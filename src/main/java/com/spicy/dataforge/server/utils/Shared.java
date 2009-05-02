package com.spicy.dataforge.server.utils;

import java.util.HashMap;

public final class Shared {
	private static HashMap m_data;

	public static HashMap data()
	{
		if ( m_data == null )
		{
			m_data = new HashMap();
		}

		return m_data;
	}

	/**
	 * gets the data at a specific key
	 *
	 * @param   key
	 * @param   data
	 */
	public static Object get(Object key)
	{
		return data().get(key);
	}

	/**
	 * sets the data at a specific key
	 *
	 * @param   key
	 * @param   data
	 */
	public static void set(Object key, Object data)
	{
		data().put(key, data);
	}

	/**
	 * deletes the data at a specific key
	 *
	 * @param   key
	 * @param   data
	 */
	public static void delete(Object key)
	{
		data().remove(key);
	}
}
