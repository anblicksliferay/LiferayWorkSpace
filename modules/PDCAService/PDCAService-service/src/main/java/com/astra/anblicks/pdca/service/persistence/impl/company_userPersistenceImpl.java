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

import com.astra.anblicks.pdca.exception.NoSuchcompany_userException;
import com.astra.anblicks.pdca.model.company_user;
import com.astra.anblicks.pdca.model.impl.company_userImpl;
import com.astra.anblicks.pdca.model.impl.company_userModelImpl;
import com.astra.anblicks.pdca.service.persistence.company_userPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the company_user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see company_userPersistence
 * @see com.astra.anblicks.pdca.service.persistence.company_userUtil
 * @generated
 */
@ProviderType
public class company_userPersistenceImpl extends BasePersistenceImpl<company_user>
	implements company_userPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link company_userUtil} to access the company_user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = company_userImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(company_userModelImpl.ENTITY_CACHE_ENABLED,
			company_userModelImpl.FINDER_CACHE_ENABLED, company_userImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(company_userModelImpl.ENTITY_CACHE_ENABLED,
			company_userModelImpl.FINDER_CACHE_ENABLED, company_userImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(company_userModelImpl.ENTITY_CACHE_ENABLED,
			company_userModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_GETBYUSERLIST = new FinderPath(company_userModelImpl.ENTITY_CACHE_ENABLED,
			company_userModelImpl.FINDER_CACHE_ENABLED, company_userImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchBygetByUserList",
			new String[] { Long.class.getName() },
			company_userModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GETBYUSERLIST = new FinderPath(company_userModelImpl.ENTITY_CACHE_ENABLED,
			company_userModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetByUserList",
			new String[] { Long.class.getName() });

	/**
	 * Returns the company_user where companyId = &#63; or throws a {@link NoSuchcompany_userException} if it could not be found.
	 *
	 * @param companyId the company ID
	 * @return the matching company_user
	 * @throws NoSuchcompany_userException if a matching company_user could not be found
	 */
	@Override
	public company_user findBygetByUserList(long companyId)
		throws NoSuchcompany_userException {
		company_user company_user = fetchBygetByUserList(companyId);

		if (company_user == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchcompany_userException(msg.toString());
		}

		return company_user;
	}

	/**
	 * Returns the company_user where companyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param companyId the company ID
	 * @return the matching company_user, or <code>null</code> if a matching company_user could not be found
	 */
	@Override
	public company_user fetchBygetByUserList(long companyId) {
		return fetchBygetByUserList(companyId, true);
	}

	/**
	 * Returns the company_user where companyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching company_user, or <code>null</code> if a matching company_user could not be found
	 */
	@Override
	public company_user fetchBygetByUserList(long companyId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { companyId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_GETBYUSERLIST,
					finderArgs, this);
		}

		if (result instanceof company_user) {
			company_user company_user = (company_user)result;

			if ((companyId != company_user.getCompanyId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_COMPANY_USER_WHERE);

			query.append(_FINDER_COLUMN_GETBYUSERLIST_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				List<company_user> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_GETBYUSERLIST,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"company_userPersistenceImpl.fetchBygetByUserList(long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					company_user company_user = list.get(0);

					result = company_user;

					cacheResult(company_user);

					if ((company_user.getCompanyId() != companyId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_GETBYUSERLIST,
							finderArgs, company_user);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_GETBYUSERLIST,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (company_user)result;
		}
	}

	/**
	 * Removes the company_user where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @return the company_user that was removed
	 */
	@Override
	public company_user removeBygetByUserList(long companyId)
		throws NoSuchcompany_userException {
		company_user company_user = findBygetByUserList(companyId);

		return remove(company_user);
	}

	/**
	 * Returns the number of company_users where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching company_users
	 */
	@Override
	public int countBygetByUserList(long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GETBYUSERLIST;

		Object[] finderArgs = new Object[] { companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COMPANY_USER_WHERE);

			query.append(_FINDER_COLUMN_GETBYUSERLIST_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_GETBYUSERLIST_COMPANYID_2 = "company_user.companyId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_GETBYCOMPANYLIST = new FinderPath(company_userModelImpl.ENTITY_CACHE_ENABLED,
			company_userModelImpl.FINDER_CACHE_ENABLED, company_userImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchBygetByCompanyList",
			new String[] { Long.class.getName() },
			company_userModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GETBYCOMPANYLIST = new FinderPath(company_userModelImpl.ENTITY_CACHE_ENABLED,
			company_userModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetByCompanyList", new String[] { Long.class.getName() });

	/**
	 * Returns the company_user where companyId = &#63; or throws a {@link NoSuchcompany_userException} if it could not be found.
	 *
	 * @param companyId the company ID
	 * @return the matching company_user
	 * @throws NoSuchcompany_userException if a matching company_user could not be found
	 */
	@Override
	public company_user findBygetByCompanyList(long companyId)
		throws NoSuchcompany_userException {
		company_user company_user = fetchBygetByCompanyList(companyId);

		if (company_user == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchcompany_userException(msg.toString());
		}

		return company_user;
	}

	/**
	 * Returns the company_user where companyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param companyId the company ID
	 * @return the matching company_user, or <code>null</code> if a matching company_user could not be found
	 */
	@Override
	public company_user fetchBygetByCompanyList(long companyId) {
		return fetchBygetByCompanyList(companyId, true);
	}

	/**
	 * Returns the company_user where companyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching company_user, or <code>null</code> if a matching company_user could not be found
	 */
	@Override
	public company_user fetchBygetByCompanyList(long companyId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { companyId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_GETBYCOMPANYLIST,
					finderArgs, this);
		}

		if (result instanceof company_user) {
			company_user company_user = (company_user)result;

			if ((companyId != company_user.getCompanyId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_COMPANY_USER_WHERE);

			query.append(_FINDER_COLUMN_GETBYCOMPANYLIST_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				List<company_user> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_GETBYCOMPANYLIST,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"company_userPersistenceImpl.fetchBygetByCompanyList(long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					company_user company_user = list.get(0);

					result = company_user;

					cacheResult(company_user);

					if ((company_user.getCompanyId() != companyId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_GETBYCOMPANYLIST,
							finderArgs, company_user);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_GETBYCOMPANYLIST,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (company_user)result;
		}
	}

	/**
	 * Removes the company_user where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @return the company_user that was removed
	 */
	@Override
	public company_user removeBygetByCompanyList(long companyId)
		throws NoSuchcompany_userException {
		company_user company_user = findBygetByCompanyList(companyId);

		return remove(company_user);
	}

	/**
	 * Returns the number of company_users where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching company_users
	 */
	@Override
	public int countBygetByCompanyList(long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GETBYCOMPANYLIST;

		Object[] finderArgs = new Object[] { companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COMPANY_USER_WHERE);

			query.append(_FINDER_COLUMN_GETBYCOMPANYLIST_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_GETBYCOMPANYLIST_COMPANYID_2 = "company_user.companyId = ?";

	public company_userPersistenceImpl() {
		setModelClass(company_user.class);
	}

	/**
	 * Caches the company_user in the entity cache if it is enabled.
	 *
	 * @param company_user the company_user
	 */
	@Override
	public void cacheResult(company_user company_user) {
		entityCache.putResult(company_userModelImpl.ENTITY_CACHE_ENABLED,
			company_userImpl.class, company_user.getPrimaryKey(), company_user);

		finderCache.putResult(FINDER_PATH_FETCH_BY_GETBYUSERLIST,
			new Object[] { company_user.getCompanyId() }, company_user);

		finderCache.putResult(FINDER_PATH_FETCH_BY_GETBYCOMPANYLIST,
			new Object[] { company_user.getCompanyId() }, company_user);

		company_user.resetOriginalValues();
	}

	/**
	 * Caches the company_users in the entity cache if it is enabled.
	 *
	 * @param company_users the company_users
	 */
	@Override
	public void cacheResult(List<company_user> company_users) {
		for (company_user company_user : company_users) {
			if (entityCache.getResult(
						company_userModelImpl.ENTITY_CACHE_ENABLED,
						company_userImpl.class, company_user.getPrimaryKey()) == null) {
				cacheResult(company_user);
			}
			else {
				company_user.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all company_users.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(company_userImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the company_user.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(company_user company_user) {
		entityCache.removeResult(company_userModelImpl.ENTITY_CACHE_ENABLED,
			company_userImpl.class, company_user.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((company_userModelImpl)company_user, true);
	}

	@Override
	public void clearCache(List<company_user> company_users) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (company_user company_user : company_users) {
			entityCache.removeResult(company_userModelImpl.ENTITY_CACHE_ENABLED,
				company_userImpl.class, company_user.getPrimaryKey());

			clearUniqueFindersCache((company_userModelImpl)company_user, true);
		}
	}

	protected void cacheUniqueFindersCache(
		company_userModelImpl company_userModelImpl) {
		Object[] args = new Object[] { company_userModelImpl.getCompanyId() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_GETBYUSERLIST, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_GETBYUSERLIST, args,
			company_userModelImpl, false);

		args = new Object[] { company_userModelImpl.getCompanyId() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_GETBYCOMPANYLIST, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_GETBYCOMPANYLIST, args,
			company_userModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		company_userModelImpl company_userModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] { company_userModelImpl.getCompanyId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_GETBYUSERLIST, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_GETBYUSERLIST, args);
		}

		if ((company_userModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_GETBYUSERLIST.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					company_userModelImpl.getOriginalCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_GETBYUSERLIST, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_GETBYUSERLIST, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] { company_userModelImpl.getCompanyId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_GETBYCOMPANYLIST, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_GETBYCOMPANYLIST, args);
		}

		if ((company_userModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_GETBYCOMPANYLIST.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					company_userModelImpl.getOriginalCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_GETBYCOMPANYLIST, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_GETBYCOMPANYLIST, args);
		}
	}

	/**
	 * Creates a new company_user with the primary key. Does not add the company_user to the database.
	 *
	 * @param company_user_Id the primary key for the new company_user
	 * @return the new company_user
	 */
	@Override
	public company_user create(long company_user_Id) {
		company_user company_user = new company_userImpl();

		company_user.setNew(true);
		company_user.setPrimaryKey(company_user_Id);

		company_user.setCompanyId(companyProvider.getCompanyId());

		return company_user;
	}

	/**
	 * Removes the company_user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param company_user_Id the primary key of the company_user
	 * @return the company_user that was removed
	 * @throws NoSuchcompany_userException if a company_user with the primary key could not be found
	 */
	@Override
	public company_user remove(long company_user_Id)
		throws NoSuchcompany_userException {
		return remove((Serializable)company_user_Id);
	}

	/**
	 * Removes the company_user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the company_user
	 * @return the company_user that was removed
	 * @throws NoSuchcompany_userException if a company_user with the primary key could not be found
	 */
	@Override
	public company_user remove(Serializable primaryKey)
		throws NoSuchcompany_userException {
		Session session = null;

		try {
			session = openSession();

			company_user company_user = (company_user)session.get(company_userImpl.class,
					primaryKey);

			if (company_user == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcompany_userException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(company_user);
		}
		catch (NoSuchcompany_userException nsee) {
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
	protected company_user removeImpl(company_user company_user) {
		company_user = toUnwrappedModel(company_user);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(company_user)) {
				company_user = (company_user)session.get(company_userImpl.class,
						company_user.getPrimaryKeyObj());
			}

			if (company_user != null) {
				session.delete(company_user);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (company_user != null) {
			clearCache(company_user);
		}

		return company_user;
	}

	@Override
	public company_user updateImpl(company_user company_user) {
		company_user = toUnwrappedModel(company_user);

		boolean isNew = company_user.isNew();

		company_userModelImpl company_userModelImpl = (company_userModelImpl)company_user;

		Session session = null;

		try {
			session = openSession();

			if (company_user.isNew()) {
				session.save(company_user);

				company_user.setNew(false);
			}
			else {
				company_user = (company_user)session.merge(company_user);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!company_userModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(company_userModelImpl.ENTITY_CACHE_ENABLED,
			company_userImpl.class, company_user.getPrimaryKey(), company_user,
			false);

		clearUniqueFindersCache(company_userModelImpl, false);
		cacheUniqueFindersCache(company_userModelImpl);

		company_user.resetOriginalValues();

		return company_user;
	}

	protected company_user toUnwrappedModel(company_user company_user) {
		if (company_user instanceof company_userImpl) {
			return company_user;
		}

		company_userImpl company_userImpl = new company_userImpl();

		company_userImpl.setNew(company_user.isNew());
		company_userImpl.setPrimaryKey(company_user.getPrimaryKey());

		company_userImpl.setCompany_user_Id(company_user.getCompany_user_Id());
		company_userImpl.setCompanyId(company_user.getCompanyId());
		company_userImpl.setPdca_userId(company_user.getPdca_userId());

		return company_userImpl;
	}

	/**
	 * Returns the company_user with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the company_user
	 * @return the company_user
	 * @throws NoSuchcompany_userException if a company_user with the primary key could not be found
	 */
	@Override
	public company_user findByPrimaryKey(Serializable primaryKey)
		throws NoSuchcompany_userException {
		company_user company_user = fetchByPrimaryKey(primaryKey);

		if (company_user == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchcompany_userException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return company_user;
	}

	/**
	 * Returns the company_user with the primary key or throws a {@link NoSuchcompany_userException} if it could not be found.
	 *
	 * @param company_user_Id the primary key of the company_user
	 * @return the company_user
	 * @throws NoSuchcompany_userException if a company_user with the primary key could not be found
	 */
	@Override
	public company_user findByPrimaryKey(long company_user_Id)
		throws NoSuchcompany_userException {
		return findByPrimaryKey((Serializable)company_user_Id);
	}

	/**
	 * Returns the company_user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the company_user
	 * @return the company_user, or <code>null</code> if a company_user with the primary key could not be found
	 */
	@Override
	public company_user fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(company_userModelImpl.ENTITY_CACHE_ENABLED,
				company_userImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		company_user company_user = (company_user)serializable;

		if (company_user == null) {
			Session session = null;

			try {
				session = openSession();

				company_user = (company_user)session.get(company_userImpl.class,
						primaryKey);

				if (company_user != null) {
					cacheResult(company_user);
				}
				else {
					entityCache.putResult(company_userModelImpl.ENTITY_CACHE_ENABLED,
						company_userImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(company_userModelImpl.ENTITY_CACHE_ENABLED,
					company_userImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return company_user;
	}

	/**
	 * Returns the company_user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param company_user_Id the primary key of the company_user
	 * @return the company_user, or <code>null</code> if a company_user with the primary key could not be found
	 */
	@Override
	public company_user fetchByPrimaryKey(long company_user_Id) {
		return fetchByPrimaryKey((Serializable)company_user_Id);
	}

	@Override
	public Map<Serializable, company_user> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, company_user> map = new HashMap<Serializable, company_user>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			company_user company_user = fetchByPrimaryKey(primaryKey);

			if (company_user != null) {
				map.put(primaryKey, company_user);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(company_userModelImpl.ENTITY_CACHE_ENABLED,
					company_userImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (company_user)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_COMPANY_USER_WHERE_PKS_IN);

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

			for (company_user company_user : (List<company_user>)q.list()) {
				map.put(company_user.getPrimaryKeyObj(), company_user);

				cacheResult(company_user);

				uncachedPrimaryKeys.remove(company_user.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(company_userModelImpl.ENTITY_CACHE_ENABLED,
					company_userImpl.class, primaryKey, nullModel);
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
	 * Returns all the company_users.
	 *
	 * @return the company_users
	 */
	@Override
	public List<company_user> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the company_users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link company_userModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of company_users
	 * @param end the upper bound of the range of company_users (not inclusive)
	 * @return the range of company_users
	 */
	@Override
	public List<company_user> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the company_users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link company_userModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of company_users
	 * @param end the upper bound of the range of company_users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of company_users
	 */
	@Override
	public List<company_user> findAll(int start, int end,
		OrderByComparator<company_user> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the company_users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link company_userModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of company_users
	 * @param end the upper bound of the range of company_users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of company_users
	 */
	@Override
	public List<company_user> findAll(int start, int end,
		OrderByComparator<company_user> orderByComparator,
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

		List<company_user> list = null;

		if (retrieveFromCache) {
			list = (List<company_user>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_COMPANY_USER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_COMPANY_USER;

				if (pagination) {
					sql = sql.concat(company_userModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<company_user>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<company_user>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the company_users from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (company_user company_user : findAll()) {
			remove(company_user);
		}
	}

	/**
	 * Returns the number of company_users.
	 *
	 * @return the number of company_users
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_COMPANY_USER);

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
	protected Map<String, Integer> getTableColumnsMap() {
		return company_userModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the company_user persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(company_userImpl.class.getName());
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
	private static final String _SQL_SELECT_COMPANY_USER = "SELECT company_user FROM company_user company_user";
	private static final String _SQL_SELECT_COMPANY_USER_WHERE_PKS_IN = "SELECT company_user FROM company_user company_user WHERE company_user_Id IN (";
	private static final String _SQL_SELECT_COMPANY_USER_WHERE = "SELECT company_user FROM company_user company_user WHERE ";
	private static final String _SQL_COUNT_COMPANY_USER = "SELECT COUNT(company_user) FROM company_user company_user";
	private static final String _SQL_COUNT_COMPANY_USER_WHERE = "SELECT COUNT(company_user) FROM company_user company_user WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "company_user.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No company_user exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No company_user exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(company_userPersistenceImpl.class);
}