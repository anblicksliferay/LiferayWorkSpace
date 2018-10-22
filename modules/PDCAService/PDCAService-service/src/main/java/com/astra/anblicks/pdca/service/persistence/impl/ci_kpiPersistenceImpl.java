/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.astra.anblicks.pdca.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.astra.anblicks.pdca.exception.NoSuchci_kpiException;
import com.astra.anblicks.pdca.model.ci_kpi;
import com.astra.anblicks.pdca.model.impl.ci_kpiImpl;
import com.astra.anblicks.pdca.model.impl.ci_kpiModelImpl;
import com.astra.anblicks.pdca.service.persistence.ci_kpiPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReflectionUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the ci_kpi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ci_kpiPersistence
 * @see com.astra.anblicks.pdca.service.persistence.ci_kpiUtil
 * @generated
 */
@ProviderType
public class ci_kpiPersistenceImpl extends BasePersistenceImpl<ci_kpi>
	implements ci_kpiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ci_kpiUtil} to access the ci_kpi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ci_kpiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ci_kpiModelImpl.ENTITY_CACHE_ENABLED,
			ci_kpiModelImpl.FINDER_CACHE_ENABLED, ci_kpiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ci_kpiModelImpl.ENTITY_CACHE_ENABLED,
			ci_kpiModelImpl.FINDER_CACHE_ENABLED, ci_kpiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ci_kpiModelImpl.ENTITY_CACHE_ENABLED,
			ci_kpiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(ci_kpiModelImpl.ENTITY_CACHE_ENABLED,
			ci_kpiModelImpl.FINDER_CACHE_ENABLED, ci_kpiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(ci_kpiModelImpl.ENTITY_CACHE_ENABLED,
			ci_kpiModelImpl.FINDER_CACHE_ENABLED, ci_kpiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			ci_kpiModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(ci_kpiModelImpl.ENTITY_CACHE_ENABLED,
			ci_kpiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the ci_kpis where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching ci_kpis
	 */
	@Override
	public List<ci_kpi> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ci_kpis where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ci_kpiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ci_kpis
	 * @param end the upper bound of the range of ci_kpis (not inclusive)
	 * @return the range of matching ci_kpis
	 */
	@Override
	public List<ci_kpi> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ci_kpis where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ci_kpiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ci_kpis
	 * @param end the upper bound of the range of ci_kpis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ci_kpis
	 */
	@Override
	public List<ci_kpi> findByUuid(String uuid, int start, int end,
		OrderByComparator<ci_kpi> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ci_kpis where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ci_kpiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ci_kpis
	 * @param end the upper bound of the range of ci_kpis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching ci_kpis
	 */
	@Override
	public List<ci_kpi> findByUuid(String uuid, int start, int end,
		OrderByComparator<ci_kpi> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<ci_kpi> list = null;

		if (retrieveFromCache) {
			list = (List<ci_kpi>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (ci_kpi ci_kpi : list) {
					if (!Objects.equals(uuid, ci_kpi.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CI_KPI_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ci_kpiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<ci_kpi>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ci_kpi>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first ci_kpi in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ci_kpi
	 * @throws NoSuchci_kpiException if a matching ci_kpi could not be found
	 */
	@Override
	public ci_kpi findByUuid_First(String uuid,
		OrderByComparator<ci_kpi> orderByComparator)
		throws NoSuchci_kpiException {
		ci_kpi ci_kpi = fetchByUuid_First(uuid, orderByComparator);

		if (ci_kpi != null) {
			return ci_kpi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchci_kpiException(msg.toString());
	}

	/**
	 * Returns the first ci_kpi in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ci_kpi, or <code>null</code> if a matching ci_kpi could not be found
	 */
	@Override
	public ci_kpi fetchByUuid_First(String uuid,
		OrderByComparator<ci_kpi> orderByComparator) {
		List<ci_kpi> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ci_kpi in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ci_kpi
	 * @throws NoSuchci_kpiException if a matching ci_kpi could not be found
	 */
	@Override
	public ci_kpi findByUuid_Last(String uuid,
		OrderByComparator<ci_kpi> orderByComparator)
		throws NoSuchci_kpiException {
		ci_kpi ci_kpi = fetchByUuid_Last(uuid, orderByComparator);

		if (ci_kpi != null) {
			return ci_kpi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchci_kpiException(msg.toString());
	}

	/**
	 * Returns the last ci_kpi in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ci_kpi, or <code>null</code> if a matching ci_kpi could not be found
	 */
	@Override
	public ci_kpi fetchByUuid_Last(String uuid,
		OrderByComparator<ci_kpi> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<ci_kpi> list = findByUuid(uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ci_kpis before and after the current ci_kpi in the ordered set where uuid = &#63;.
	 *
	 * @param ciKpiId the primary key of the current ci_kpi
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ci_kpi
	 * @throws NoSuchci_kpiException if a ci_kpi with the primary key could not be found
	 */
	@Override
	public ci_kpi[] findByUuid_PrevAndNext(long ciKpiId, String uuid,
		OrderByComparator<ci_kpi> orderByComparator)
		throws NoSuchci_kpiException {
		ci_kpi ci_kpi = findByPrimaryKey(ciKpiId);

		Session session = null;

		try {
			session = openSession();

			ci_kpi[] array = new ci_kpiImpl[3];

			array[0] = getByUuid_PrevAndNext(session, ci_kpi, uuid,
					orderByComparator, true);

			array[1] = ci_kpi;

			array[2] = getByUuid_PrevAndNext(session, ci_kpi, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ci_kpi getByUuid_PrevAndNext(Session session, ci_kpi ci_kpi,
		String uuid, OrderByComparator<ci_kpi> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CI_KPI_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ci_kpiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(ci_kpi);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ci_kpi> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ci_kpis where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (ci_kpi ci_kpi : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(ci_kpi);
		}
	}

	/**
	 * Returns the number of ci_kpis where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching ci_kpis
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CI_KPI_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "ci_kpi.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "ci_kpi.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(ci_kpi.uuid IS NULL OR ci_kpi.uuid = '')";

	public ci_kpiPersistenceImpl() {
		setModelClass(ci_kpi.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uuid", "uuid_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the ci_kpi in the entity cache if it is enabled.
	 *
	 * @param ci_kpi the ci_kpi
	 */
	@Override
	public void cacheResult(ci_kpi ci_kpi) {
		entityCache.putResult(ci_kpiModelImpl.ENTITY_CACHE_ENABLED,
			ci_kpiImpl.class, ci_kpi.getPrimaryKey(), ci_kpi);

		ci_kpi.resetOriginalValues();
	}

	/**
	 * Caches the ci_kpis in the entity cache if it is enabled.
	 *
	 * @param ci_kpis the ci_kpis
	 */
	@Override
	public void cacheResult(List<ci_kpi> ci_kpis) {
		for (ci_kpi ci_kpi : ci_kpis) {
			if (entityCache.getResult(ci_kpiModelImpl.ENTITY_CACHE_ENABLED,
						ci_kpiImpl.class, ci_kpi.getPrimaryKey()) == null) {
				cacheResult(ci_kpi);
			}
			else {
				ci_kpi.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ci_kpis.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ci_kpiImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ci_kpi.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ci_kpi ci_kpi) {
		entityCache.removeResult(ci_kpiModelImpl.ENTITY_CACHE_ENABLED,
			ci_kpiImpl.class, ci_kpi.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ci_kpi> ci_kpis) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ci_kpi ci_kpi : ci_kpis) {
			entityCache.removeResult(ci_kpiModelImpl.ENTITY_CACHE_ENABLED,
				ci_kpiImpl.class, ci_kpi.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ci_kpi with the primary key. Does not add the ci_kpi to the database.
	 *
	 * @param ciKpiId the primary key for the new ci_kpi
	 * @return the new ci_kpi
	 */
	@Override
	public ci_kpi create(long ciKpiId) {
		ci_kpi ci_kpi = new ci_kpiImpl();

		ci_kpi.setNew(true);
		ci_kpi.setPrimaryKey(ciKpiId);

		String uuid = PortalUUIDUtil.generate();

		ci_kpi.setUuid(uuid);

		return ci_kpi;
	}

	/**
	 * Removes the ci_kpi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ciKpiId the primary key of the ci_kpi
	 * @return the ci_kpi that was removed
	 * @throws NoSuchci_kpiException if a ci_kpi with the primary key could not be found
	 */
	@Override
	public ci_kpi remove(long ciKpiId) throws NoSuchci_kpiException {
		return remove((Serializable)ciKpiId);
	}

	/**
	 * Removes the ci_kpi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ci_kpi
	 * @return the ci_kpi that was removed
	 * @throws NoSuchci_kpiException if a ci_kpi with the primary key could not be found
	 */
	@Override
	public ci_kpi remove(Serializable primaryKey) throws NoSuchci_kpiException {
		Session session = null;

		try {
			session = openSession();

			ci_kpi ci_kpi = (ci_kpi)session.get(ci_kpiImpl.class, primaryKey);

			if (ci_kpi == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchci_kpiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(ci_kpi);
		}
		catch (NoSuchci_kpiException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected ci_kpi removeImpl(ci_kpi ci_kpi) {
		ci_kpi = toUnwrappedModel(ci_kpi);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ci_kpi)) {
				ci_kpi = (ci_kpi)session.get(ci_kpiImpl.class,
						ci_kpi.getPrimaryKeyObj());
			}

			if (ci_kpi != null) {
				session.delete(ci_kpi);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (ci_kpi != null) {
			clearCache(ci_kpi);
		}

		return ci_kpi;
	}

	@Override
	public ci_kpi updateImpl(ci_kpi ci_kpi) {
		ci_kpi = toUnwrappedModel(ci_kpi);

		boolean isNew = ci_kpi.isNew();

		ci_kpiModelImpl ci_kpiModelImpl = (ci_kpiModelImpl)ci_kpi;

		if (Validator.isNull(ci_kpi.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			ci_kpi.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (ci_kpi.isNew()) {
				session.save(ci_kpi);

				ci_kpi.setNew(false);
			}
			else {
				ci_kpi = (ci_kpi)session.merge(ci_kpi);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!ci_kpiModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { ci_kpiModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((ci_kpiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { ci_kpiModelImpl.getOriginalUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { ci_kpiModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}
		}

		entityCache.putResult(ci_kpiModelImpl.ENTITY_CACHE_ENABLED,
			ci_kpiImpl.class, ci_kpi.getPrimaryKey(), ci_kpi, false);

		ci_kpi.resetOriginalValues();

		return ci_kpi;
	}

	protected ci_kpi toUnwrappedModel(ci_kpi ci_kpi) {
		if (ci_kpi instanceof ci_kpiImpl) {
			return ci_kpi;
		}

		ci_kpiImpl ci_kpiImpl = new ci_kpiImpl();

		ci_kpiImpl.setNew(ci_kpi.isNew());
		ci_kpiImpl.setPrimaryKey(ci_kpi.getPrimaryKey());

		ci_kpiImpl.setUuid(ci_kpi.getUuid());
		ci_kpiImpl.setCiKpiId(ci_kpi.getCiKpiId());
		ci_kpiImpl.setAddKpiId(ci_kpi.getAddKpiId());
		ci_kpiImpl.setCiPeriodId(ci_kpi.getCiPeriodId());
		ci_kpiImpl.setTargetYTD(ci_kpi.getTargetYTD());
		ci_kpiImpl.setProblemIdentification(ci_kpi.getProblemIdentification());
		ci_kpiImpl.setProposedAction(ci_kpi.getProposedAction());
		ci_kpiImpl.setAchivement(ci_kpi.getAchivement());
		ci_kpiImpl.setStatus(ci_kpi.getStatus());

		return ci_kpiImpl;
	}

	/**
	 * Returns the ci_kpi with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ci_kpi
	 * @return the ci_kpi
	 * @throws NoSuchci_kpiException if a ci_kpi with the primary key could not be found
	 */
	@Override
	public ci_kpi findByPrimaryKey(Serializable primaryKey)
		throws NoSuchci_kpiException {
		ci_kpi ci_kpi = fetchByPrimaryKey(primaryKey);

		if (ci_kpi == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchci_kpiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return ci_kpi;
	}

	/**
	 * Returns the ci_kpi with the primary key or throws a {@link NoSuchci_kpiException} if it could not be found.
	 *
	 * @param ciKpiId the primary key of the ci_kpi
	 * @return the ci_kpi
	 * @throws NoSuchci_kpiException if a ci_kpi with the primary key could not be found
	 */
	@Override
	public ci_kpi findByPrimaryKey(long ciKpiId) throws NoSuchci_kpiException {
		return findByPrimaryKey((Serializable)ciKpiId);
	}

	/**
	 * Returns the ci_kpi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ci_kpi
	 * @return the ci_kpi, or <code>null</code> if a ci_kpi with the primary key could not be found
	 */
	@Override
	public ci_kpi fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ci_kpiModelImpl.ENTITY_CACHE_ENABLED,
				ci_kpiImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ci_kpi ci_kpi = (ci_kpi)serializable;

		if (ci_kpi == null) {
			Session session = null;

			try {
				session = openSession();

				ci_kpi = (ci_kpi)session.get(ci_kpiImpl.class, primaryKey);

				if (ci_kpi != null) {
					cacheResult(ci_kpi);
				}
				else {
					entityCache.putResult(ci_kpiModelImpl.ENTITY_CACHE_ENABLED,
						ci_kpiImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ci_kpiModelImpl.ENTITY_CACHE_ENABLED,
					ci_kpiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return ci_kpi;
	}

	/**
	 * Returns the ci_kpi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ciKpiId the primary key of the ci_kpi
	 * @return the ci_kpi, or <code>null</code> if a ci_kpi with the primary key could not be found
	 */
	@Override
	public ci_kpi fetchByPrimaryKey(long ciKpiId) {
		return fetchByPrimaryKey((Serializable)ciKpiId);
	}

	@Override
	public Map<Serializable, ci_kpi> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ci_kpi> map = new HashMap<Serializable, ci_kpi>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ci_kpi ci_kpi = fetchByPrimaryKey(primaryKey);

			if (ci_kpi != null) {
				map.put(primaryKey, ci_kpi);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ci_kpiModelImpl.ENTITY_CACHE_ENABLED,
					ci_kpiImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ci_kpi)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CI_KPI_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (ci_kpi ci_kpi : (List<ci_kpi>)q.list()) {
				map.put(ci_kpi.getPrimaryKeyObj(), ci_kpi);

				cacheResult(ci_kpi);

				uncachedPrimaryKeys.remove(ci_kpi.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ci_kpiModelImpl.ENTITY_CACHE_ENABLED,
					ci_kpiImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the ci_kpis.
	 *
	 * @return the ci_kpis
	 */
	@Override
	public List<ci_kpi> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ci_kpis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ci_kpiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ci_kpis
	 * @param end the upper bound of the range of ci_kpis (not inclusive)
	 * @return the range of ci_kpis
	 */
	@Override
	public List<ci_kpi> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ci_kpis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ci_kpiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ci_kpis
	 * @param end the upper bound of the range of ci_kpis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ci_kpis
	 */
	@Override
	public List<ci_kpi> findAll(int start, int end,
		OrderByComparator<ci_kpi> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ci_kpis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ci_kpiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ci_kpis
	 * @param end the upper bound of the range of ci_kpis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of ci_kpis
	 */
	@Override
	public List<ci_kpi> findAll(int start, int end,
		OrderByComparator<ci_kpi> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<ci_kpi> list = null;

		if (retrieveFromCache) {
			list = (List<ci_kpi>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CI_KPI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CI_KPI;

				if (pagination) {
					sql = sql.concat(ci_kpiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ci_kpi>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ci_kpi>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the ci_kpis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ci_kpi ci_kpi : findAll()) {
			remove(ci_kpi);
		}
	}

	/**
	 * Returns the number of ci_kpis.
	 *
	 * @return the number of ci_kpis
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CI_KPI);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ci_kpiModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ci_kpi persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ci_kpiImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_CI_KPI = "SELECT ci_kpi FROM ci_kpi ci_kpi";
	private static final String _SQL_SELECT_CI_KPI_WHERE_PKS_IN = "SELECT ci_kpi FROM ci_kpi ci_kpi WHERE ciKpiId IN (";
	private static final String _SQL_SELECT_CI_KPI_WHERE = "SELECT ci_kpi FROM ci_kpi ci_kpi WHERE ";
	private static final String _SQL_COUNT_CI_KPI = "SELECT COUNT(ci_kpi) FROM ci_kpi ci_kpi";
	private static final String _SQL_COUNT_CI_KPI_WHERE = "SELECT COUNT(ci_kpi) FROM ci_kpi ci_kpi WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "ci_kpi.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ci_kpi exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ci_kpi exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ci_kpiPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}