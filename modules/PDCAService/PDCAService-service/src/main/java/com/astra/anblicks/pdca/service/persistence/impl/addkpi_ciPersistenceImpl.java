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

import com.astra.anblicks.pdca.exception.NoSuchaddkpi_ciException;
import com.astra.anblicks.pdca.model.addkpi_ci;
import com.astra.anblicks.pdca.model.impl.addkpi_ciImpl;
import com.astra.anblicks.pdca.model.impl.addkpi_ciModelImpl;
import com.astra.anblicks.pdca.service.persistence.addkpi_ciPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
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
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the addkpi_ci service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see addkpi_ciPersistence
 * @see com.astra.anblicks.pdca.service.persistence.addkpi_ciUtil
 * @generated
 */
@ProviderType
public class addkpi_ciPersistenceImpl extends BasePersistenceImpl<addkpi_ci>
	implements addkpi_ciPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link addkpi_ciUtil} to access the addkpi_ci persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = addkpi_ciImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(addkpi_ciModelImpl.ENTITY_CACHE_ENABLED,
			addkpi_ciModelImpl.FINDER_CACHE_ENABLED, addkpi_ciImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(addkpi_ciModelImpl.ENTITY_CACHE_ENABLED,
			addkpi_ciModelImpl.FINDER_CACHE_ENABLED, addkpi_ciImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(addkpi_ciModelImpl.ENTITY_CACHE_ENABLED,
			addkpi_ciModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(addkpi_ciModelImpl.ENTITY_CACHE_ENABLED,
			addkpi_ciModelImpl.FINDER_CACHE_ENABLED, addkpi_ciImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(addkpi_ciModelImpl.ENTITY_CACHE_ENABLED,
			addkpi_ciModelImpl.FINDER_CACHE_ENABLED, addkpi_ciImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			addkpi_ciModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(addkpi_ciModelImpl.ENTITY_CACHE_ENABLED,
			addkpi_ciModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the addkpi_cis where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching addkpi_cis
	 */
	@Override
	public List<addkpi_ci> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the addkpi_cis where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link addkpi_ciModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of addkpi_cis
	 * @param end the upper bound of the range of addkpi_cis (not inclusive)
	 * @return the range of matching addkpi_cis
	 */
	@Override
	public List<addkpi_ci> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the addkpi_cis where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link addkpi_ciModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of addkpi_cis
	 * @param end the upper bound of the range of addkpi_cis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching addkpi_cis
	 */
	@Override
	public List<addkpi_ci> findByUuid(String uuid, int start, int end,
		OrderByComparator<addkpi_ci> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the addkpi_cis where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link addkpi_ciModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of addkpi_cis
	 * @param end the upper bound of the range of addkpi_cis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching addkpi_cis
	 */
	@Override
	public List<addkpi_ci> findByUuid(String uuid, int start, int end,
		OrderByComparator<addkpi_ci> orderByComparator,
		boolean retrieveFromCache) {
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

		List<addkpi_ci> list = null;

		if (retrieveFromCache) {
			list = (List<addkpi_ci>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (addkpi_ci addkpi_ci : list) {
					if (!Objects.equals(uuid, addkpi_ci.getUuid())) {
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

			query.append(_SQL_SELECT_ADDKPI_CI_WHERE);

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
				query.append(addkpi_ciModelImpl.ORDER_BY_JPQL);
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
					list = (List<addkpi_ci>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<addkpi_ci>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first addkpi_ci in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching addkpi_ci
	 * @throws NoSuchaddkpi_ciException if a matching addkpi_ci could not be found
	 */
	@Override
	public addkpi_ci findByUuid_First(String uuid,
		OrderByComparator<addkpi_ci> orderByComparator)
		throws NoSuchaddkpi_ciException {
		addkpi_ci addkpi_ci = fetchByUuid_First(uuid, orderByComparator);

		if (addkpi_ci != null) {
			return addkpi_ci;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchaddkpi_ciException(msg.toString());
	}

	/**
	 * Returns the first addkpi_ci in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching addkpi_ci, or <code>null</code> if a matching addkpi_ci could not be found
	 */
	@Override
	public addkpi_ci fetchByUuid_First(String uuid,
		OrderByComparator<addkpi_ci> orderByComparator) {
		List<addkpi_ci> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last addkpi_ci in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching addkpi_ci
	 * @throws NoSuchaddkpi_ciException if a matching addkpi_ci could not be found
	 */
	@Override
	public addkpi_ci findByUuid_Last(String uuid,
		OrderByComparator<addkpi_ci> orderByComparator)
		throws NoSuchaddkpi_ciException {
		addkpi_ci addkpi_ci = fetchByUuid_Last(uuid, orderByComparator);

		if (addkpi_ci != null) {
			return addkpi_ci;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchaddkpi_ciException(msg.toString());
	}

	/**
	 * Returns the last addkpi_ci in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching addkpi_ci, or <code>null</code> if a matching addkpi_ci could not be found
	 */
	@Override
	public addkpi_ci fetchByUuid_Last(String uuid,
		OrderByComparator<addkpi_ci> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<addkpi_ci> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the addkpi_cis before and after the current addkpi_ci in the ordered set where uuid = &#63;.
	 *
	 * @param addKpiId the primary key of the current addkpi_ci
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next addkpi_ci
	 * @throws NoSuchaddkpi_ciException if a addkpi_ci with the primary key could not be found
	 */
	@Override
	public addkpi_ci[] findByUuid_PrevAndNext(long addKpiId, String uuid,
		OrderByComparator<addkpi_ci> orderByComparator)
		throws NoSuchaddkpi_ciException {
		addkpi_ci addkpi_ci = findByPrimaryKey(addKpiId);

		Session session = null;

		try {
			session = openSession();

			addkpi_ci[] array = new addkpi_ciImpl[3];

			array[0] = getByUuid_PrevAndNext(session, addkpi_ci, uuid,
					orderByComparator, true);

			array[1] = addkpi_ci;

			array[2] = getByUuid_PrevAndNext(session, addkpi_ci, uuid,
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

	protected addkpi_ci getByUuid_PrevAndNext(Session session,
		addkpi_ci addkpi_ci, String uuid,
		OrderByComparator<addkpi_ci> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ADDKPI_CI_WHERE);

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
			query.append(addkpi_ciModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(addkpi_ci);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<addkpi_ci> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the addkpi_cis where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (addkpi_ci addkpi_ci : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(addkpi_ci);
		}
	}

	/**
	 * Returns the number of addkpi_cis where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching addkpi_cis
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ADDKPI_CI_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "addkpi_ci.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "addkpi_ci.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(addkpi_ci.uuid IS NULL OR addkpi_ci.uuid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(addkpi_ciModelImpl.ENTITY_CACHE_ENABLED,
			addkpi_ciModelImpl.FINDER_CACHE_ENABLED, addkpi_ciImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(addkpi_ciModelImpl.ENTITY_CACHE_ENABLED,
			addkpi_ciModelImpl.FINDER_CACHE_ENABLED, addkpi_ciImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			addkpi_ciModelImpl.UUID_COLUMN_BITMASK |
			addkpi_ciModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(addkpi_ciModelImpl.ENTITY_CACHE_ENABLED,
			addkpi_ciModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the addkpi_cis where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching addkpi_cis
	 */
	@Override
	public List<addkpi_ci> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the addkpi_cis where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link addkpi_ciModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of addkpi_cis
	 * @param end the upper bound of the range of addkpi_cis (not inclusive)
	 * @return the range of matching addkpi_cis
	 */
	@Override
	public List<addkpi_ci> findByUuid_C(String uuid, long companyId, int start,
		int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the addkpi_cis where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link addkpi_ciModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of addkpi_cis
	 * @param end the upper bound of the range of addkpi_cis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching addkpi_cis
	 */
	@Override
	public List<addkpi_ci> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<addkpi_ci> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the addkpi_cis where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link addkpi_ciModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of addkpi_cis
	 * @param end the upper bound of the range of addkpi_cis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching addkpi_cis
	 */
	@Override
	public List<addkpi_ci> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<addkpi_ci> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<addkpi_ci> list = null;

		if (retrieveFromCache) {
			list = (List<addkpi_ci>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (addkpi_ci addkpi_ci : list) {
					if (!Objects.equals(uuid, addkpi_ci.getUuid()) ||
							(companyId != addkpi_ci.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_ADDKPI_CI_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(addkpi_ciModelImpl.ORDER_BY_JPQL);
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

				qPos.add(companyId);

				if (!pagination) {
					list = (List<addkpi_ci>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<addkpi_ci>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first addkpi_ci in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching addkpi_ci
	 * @throws NoSuchaddkpi_ciException if a matching addkpi_ci could not be found
	 */
	@Override
	public addkpi_ci findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<addkpi_ci> orderByComparator)
		throws NoSuchaddkpi_ciException {
		addkpi_ci addkpi_ci = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (addkpi_ci != null) {
			return addkpi_ci;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchaddkpi_ciException(msg.toString());
	}

	/**
	 * Returns the first addkpi_ci in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching addkpi_ci, or <code>null</code> if a matching addkpi_ci could not be found
	 */
	@Override
	public addkpi_ci fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<addkpi_ci> orderByComparator) {
		List<addkpi_ci> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last addkpi_ci in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching addkpi_ci
	 * @throws NoSuchaddkpi_ciException if a matching addkpi_ci could not be found
	 */
	@Override
	public addkpi_ci findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<addkpi_ci> orderByComparator)
		throws NoSuchaddkpi_ciException {
		addkpi_ci addkpi_ci = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (addkpi_ci != null) {
			return addkpi_ci;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchaddkpi_ciException(msg.toString());
	}

	/**
	 * Returns the last addkpi_ci in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching addkpi_ci, or <code>null</code> if a matching addkpi_ci could not be found
	 */
	@Override
	public addkpi_ci fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<addkpi_ci> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<addkpi_ci> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the addkpi_cis before and after the current addkpi_ci in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param addKpiId the primary key of the current addkpi_ci
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next addkpi_ci
	 * @throws NoSuchaddkpi_ciException if a addkpi_ci with the primary key could not be found
	 */
	@Override
	public addkpi_ci[] findByUuid_C_PrevAndNext(long addKpiId, String uuid,
		long companyId, OrderByComparator<addkpi_ci> orderByComparator)
		throws NoSuchaddkpi_ciException {
		addkpi_ci addkpi_ci = findByPrimaryKey(addKpiId);

		Session session = null;

		try {
			session = openSession();

			addkpi_ci[] array = new addkpi_ciImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, addkpi_ci, uuid,
					companyId, orderByComparator, true);

			array[1] = addkpi_ci;

			array[2] = getByUuid_C_PrevAndNext(session, addkpi_ci, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected addkpi_ci getByUuid_C_PrevAndNext(Session session,
		addkpi_ci addkpi_ci, String uuid, long companyId,
		OrderByComparator<addkpi_ci> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_ADDKPI_CI_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

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
			query.append(addkpi_ciModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(addkpi_ci);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<addkpi_ci> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the addkpi_cis where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (addkpi_ci addkpi_ci : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(addkpi_ci);
		}
	}

	/**
	 * Returns the number of addkpi_cis where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching addkpi_cis
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ADDKPI_CI_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "addkpi_ci.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "addkpi_ci.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(addkpi_ci.uuid IS NULL OR addkpi_ci.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "addkpi_ci.companyId = ?";

	public addkpi_ciPersistenceImpl() {
		setModelClass(addkpi_ci.class);

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
	 * Caches the addkpi_ci in the entity cache if it is enabled.
	 *
	 * @param addkpi_ci the addkpi_ci
	 */
	@Override
	public void cacheResult(addkpi_ci addkpi_ci) {
		entityCache.putResult(addkpi_ciModelImpl.ENTITY_CACHE_ENABLED,
			addkpi_ciImpl.class, addkpi_ci.getPrimaryKey(), addkpi_ci);

		addkpi_ci.resetOriginalValues();
	}

	/**
	 * Caches the addkpi_cis in the entity cache if it is enabled.
	 *
	 * @param addkpi_cis the addkpi_cis
	 */
	@Override
	public void cacheResult(List<addkpi_ci> addkpi_cis) {
		for (addkpi_ci addkpi_ci : addkpi_cis) {
			if (entityCache.getResult(addkpi_ciModelImpl.ENTITY_CACHE_ENABLED,
						addkpi_ciImpl.class, addkpi_ci.getPrimaryKey()) == null) {
				cacheResult(addkpi_ci);
			}
			else {
				addkpi_ci.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all addkpi_cis.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(addkpi_ciImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the addkpi_ci.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(addkpi_ci addkpi_ci) {
		entityCache.removeResult(addkpi_ciModelImpl.ENTITY_CACHE_ENABLED,
			addkpi_ciImpl.class, addkpi_ci.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<addkpi_ci> addkpi_cis) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (addkpi_ci addkpi_ci : addkpi_cis) {
			entityCache.removeResult(addkpi_ciModelImpl.ENTITY_CACHE_ENABLED,
				addkpi_ciImpl.class, addkpi_ci.getPrimaryKey());
		}
	}

	/**
	 * Creates a new addkpi_ci with the primary key. Does not add the addkpi_ci to the database.
	 *
	 * @param addKpiId the primary key for the new addkpi_ci
	 * @return the new addkpi_ci
	 */
	@Override
	public addkpi_ci create(long addKpiId) {
		addkpi_ci addkpi_ci = new addkpi_ciImpl();

		addkpi_ci.setNew(true);
		addkpi_ci.setPrimaryKey(addKpiId);

		String uuid = PortalUUIDUtil.generate();

		addkpi_ci.setUuid(uuid);

		addkpi_ci.setCompanyId(companyProvider.getCompanyId());

		return addkpi_ci;
	}

	/**
	 * Removes the addkpi_ci with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addKpiId the primary key of the addkpi_ci
	 * @return the addkpi_ci that was removed
	 * @throws NoSuchaddkpi_ciException if a addkpi_ci with the primary key could not be found
	 */
	@Override
	public addkpi_ci remove(long addKpiId) throws NoSuchaddkpi_ciException {
		return remove((Serializable)addKpiId);
	}

	/**
	 * Removes the addkpi_ci with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the addkpi_ci
	 * @return the addkpi_ci that was removed
	 * @throws NoSuchaddkpi_ciException if a addkpi_ci with the primary key could not be found
	 */
	@Override
	public addkpi_ci remove(Serializable primaryKey)
		throws NoSuchaddkpi_ciException {
		Session session = null;

		try {
			session = openSession();

			addkpi_ci addkpi_ci = (addkpi_ci)session.get(addkpi_ciImpl.class,
					primaryKey);

			if (addkpi_ci == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchaddkpi_ciException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(addkpi_ci);
		}
		catch (NoSuchaddkpi_ciException nsee) {
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
	protected addkpi_ci removeImpl(addkpi_ci addkpi_ci) {
		addkpi_ci = toUnwrappedModel(addkpi_ci);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addkpi_ci)) {
				addkpi_ci = (addkpi_ci)session.get(addkpi_ciImpl.class,
						addkpi_ci.getPrimaryKeyObj());
			}

			if (addkpi_ci != null) {
				session.delete(addkpi_ci);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (addkpi_ci != null) {
			clearCache(addkpi_ci);
		}

		return addkpi_ci;
	}

	@Override
	public addkpi_ci updateImpl(addkpi_ci addkpi_ci) {
		addkpi_ci = toUnwrappedModel(addkpi_ci);

		boolean isNew = addkpi_ci.isNew();

		addkpi_ciModelImpl addkpi_ciModelImpl = (addkpi_ciModelImpl)addkpi_ci;

		if (Validator.isNull(addkpi_ci.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			addkpi_ci.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (addkpi_ci.getCreateDate() == null)) {
			if (serviceContext == null) {
				addkpi_ci.setCreateDate(now);
			}
			else {
				addkpi_ci.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!addkpi_ciModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addkpi_ci.setModifiedDate(now);
			}
			else {
				addkpi_ci.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (addkpi_ci.isNew()) {
				session.save(addkpi_ci);

				addkpi_ci.setNew(false);
			}
			else {
				addkpi_ci = (addkpi_ci)session.merge(addkpi_ci);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!addkpi_ciModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { addkpi_ciModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					addkpi_ciModelImpl.getUuid(),
					addkpi_ciModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((addkpi_ciModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						addkpi_ciModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { addkpi_ciModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((addkpi_ciModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						addkpi_ciModelImpl.getOriginalUuid(),
						addkpi_ciModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						addkpi_ciModelImpl.getUuid(),
						addkpi_ciModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}
		}

		entityCache.putResult(addkpi_ciModelImpl.ENTITY_CACHE_ENABLED,
			addkpi_ciImpl.class, addkpi_ci.getPrimaryKey(), addkpi_ci, false);

		addkpi_ci.resetOriginalValues();

		return addkpi_ci;
	}

	protected addkpi_ci toUnwrappedModel(addkpi_ci addkpi_ci) {
		if (addkpi_ci instanceof addkpi_ciImpl) {
			return addkpi_ci;
		}

		addkpi_ciImpl addkpi_ciImpl = new addkpi_ciImpl();

		addkpi_ciImpl.setNew(addkpi_ci.isNew());
		addkpi_ciImpl.setPrimaryKey(addkpi_ci.getPrimaryKey());

		addkpi_ciImpl.setUuid(addkpi_ci.getUuid());
		addkpi_ciImpl.setAddKpiId(addkpi_ci.getAddKpiId());
		addkpi_ciImpl.setCompanyId(addkpi_ci.getCompanyId());
		addkpi_ciImpl.setYear(addkpi_ci.getYear());
		addkpi_ciImpl.setStrategyType(addkpi_ci.getStrategyType());
		addkpi_ciImpl.setStrategy(addkpi_ci.getStrategy());
		addkpi_ciImpl.setTarget(addkpi_ci.getTarget());
		addkpi_ciImpl.setKpi(addkpi_ci.getKpi());
		addkpi_ciImpl.setUserId(addkpi_ci.getUserId());
		addkpi_ciImpl.setUserName(addkpi_ci.getUserName());
		addkpi_ciImpl.setCreateDate(addkpi_ci.getCreateDate());
		addkpi_ciImpl.setModifiedDate(addkpi_ci.getModifiedDate());

		return addkpi_ciImpl;
	}

	/**
	 * Returns the addkpi_ci with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the addkpi_ci
	 * @return the addkpi_ci
	 * @throws NoSuchaddkpi_ciException if a addkpi_ci with the primary key could not be found
	 */
	@Override
	public addkpi_ci findByPrimaryKey(Serializable primaryKey)
		throws NoSuchaddkpi_ciException {
		addkpi_ci addkpi_ci = fetchByPrimaryKey(primaryKey);

		if (addkpi_ci == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchaddkpi_ciException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return addkpi_ci;
	}

	/**
	 * Returns the addkpi_ci with the primary key or throws a {@link NoSuchaddkpi_ciException} if it could not be found.
	 *
	 * @param addKpiId the primary key of the addkpi_ci
	 * @return the addkpi_ci
	 * @throws NoSuchaddkpi_ciException if a addkpi_ci with the primary key could not be found
	 */
	@Override
	public addkpi_ci findByPrimaryKey(long addKpiId)
		throws NoSuchaddkpi_ciException {
		return findByPrimaryKey((Serializable)addKpiId);
	}

	/**
	 * Returns the addkpi_ci with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the addkpi_ci
	 * @return the addkpi_ci, or <code>null</code> if a addkpi_ci with the primary key could not be found
	 */
	@Override
	public addkpi_ci fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(addkpi_ciModelImpl.ENTITY_CACHE_ENABLED,
				addkpi_ciImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		addkpi_ci addkpi_ci = (addkpi_ci)serializable;

		if (addkpi_ci == null) {
			Session session = null;

			try {
				session = openSession();

				addkpi_ci = (addkpi_ci)session.get(addkpi_ciImpl.class,
						primaryKey);

				if (addkpi_ci != null) {
					cacheResult(addkpi_ci);
				}
				else {
					entityCache.putResult(addkpi_ciModelImpl.ENTITY_CACHE_ENABLED,
						addkpi_ciImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(addkpi_ciModelImpl.ENTITY_CACHE_ENABLED,
					addkpi_ciImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return addkpi_ci;
	}

	/**
	 * Returns the addkpi_ci with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addKpiId the primary key of the addkpi_ci
	 * @return the addkpi_ci, or <code>null</code> if a addkpi_ci with the primary key could not be found
	 */
	@Override
	public addkpi_ci fetchByPrimaryKey(long addKpiId) {
		return fetchByPrimaryKey((Serializable)addKpiId);
	}

	@Override
	public Map<Serializable, addkpi_ci> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, addkpi_ci> map = new HashMap<Serializable, addkpi_ci>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			addkpi_ci addkpi_ci = fetchByPrimaryKey(primaryKey);

			if (addkpi_ci != null) {
				map.put(primaryKey, addkpi_ci);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(addkpi_ciModelImpl.ENTITY_CACHE_ENABLED,
					addkpi_ciImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (addkpi_ci)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ADDKPI_CI_WHERE_PKS_IN);

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

			for (addkpi_ci addkpi_ci : (List<addkpi_ci>)q.list()) {
				map.put(addkpi_ci.getPrimaryKeyObj(), addkpi_ci);

				cacheResult(addkpi_ci);

				uncachedPrimaryKeys.remove(addkpi_ci.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(addkpi_ciModelImpl.ENTITY_CACHE_ENABLED,
					addkpi_ciImpl.class, primaryKey, nullModel);
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
	 * Returns all the addkpi_cis.
	 *
	 * @return the addkpi_cis
	 */
	@Override
	public List<addkpi_ci> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the addkpi_cis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link addkpi_ciModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of addkpi_cis
	 * @param end the upper bound of the range of addkpi_cis (not inclusive)
	 * @return the range of addkpi_cis
	 */
	@Override
	public List<addkpi_ci> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the addkpi_cis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link addkpi_ciModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of addkpi_cis
	 * @param end the upper bound of the range of addkpi_cis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of addkpi_cis
	 */
	@Override
	public List<addkpi_ci> findAll(int start, int end,
		OrderByComparator<addkpi_ci> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the addkpi_cis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link addkpi_ciModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of addkpi_cis
	 * @param end the upper bound of the range of addkpi_cis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of addkpi_cis
	 */
	@Override
	public List<addkpi_ci> findAll(int start, int end,
		OrderByComparator<addkpi_ci> orderByComparator,
		boolean retrieveFromCache) {
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

		List<addkpi_ci> list = null;

		if (retrieveFromCache) {
			list = (List<addkpi_ci>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ADDKPI_CI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ADDKPI_CI;

				if (pagination) {
					sql = sql.concat(addkpi_ciModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<addkpi_ci>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<addkpi_ci>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the addkpi_cis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (addkpi_ci addkpi_ci : findAll()) {
			remove(addkpi_ci);
		}
	}

	/**
	 * Returns the number of addkpi_cis.
	 *
	 * @return the number of addkpi_cis
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ADDKPI_CI);

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
		return addkpi_ciModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the addkpi_ci persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(addkpi_ciImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ADDKPI_CI = "SELECT addkpi_ci FROM addkpi_ci addkpi_ci";
	private static final String _SQL_SELECT_ADDKPI_CI_WHERE_PKS_IN = "SELECT addkpi_ci FROM addkpi_ci addkpi_ci WHERE addKpiId IN (";
	private static final String _SQL_SELECT_ADDKPI_CI_WHERE = "SELECT addkpi_ci FROM addkpi_ci addkpi_ci WHERE ";
	private static final String _SQL_COUNT_ADDKPI_CI = "SELECT COUNT(addkpi_ci) FROM addkpi_ci addkpi_ci";
	private static final String _SQL_COUNT_ADDKPI_CI_WHERE = "SELECT COUNT(addkpi_ci) FROM addkpi_ci addkpi_ci WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "addkpi_ci.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No addkpi_ci exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No addkpi_ci exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(addkpi_ciPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}