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

import com.astra.anblicks.pdca.exception.NoSuchAstraPdca_YearException;
import com.astra.anblicks.pdca.model.AstraPdca_Year;
import com.astra.anblicks.pdca.model.impl.AstraPdca_YearImpl;
import com.astra.anblicks.pdca.model.impl.AstraPdca_YearModelImpl;
import com.astra.anblicks.pdca.service.persistence.AstraPdca_YearPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
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
 * The persistence implementation for the astra pdca_ year service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AstraPdca_YearPersistence
 * @see com.astra.anblicks.pdca.service.persistence.AstraPdca_YearUtil
 * @generated
 */
@ProviderType
public class AstraPdca_YearPersistenceImpl extends BasePersistenceImpl<AstraPdca_Year>
	implements AstraPdca_YearPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AstraPdca_YearUtil} to access the astra pdca_ year persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AstraPdca_YearImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AstraPdca_YearModelImpl.ENTITY_CACHE_ENABLED,
			AstraPdca_YearModelImpl.FINDER_CACHE_ENABLED,
			AstraPdca_YearImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AstraPdca_YearModelImpl.ENTITY_CACHE_ENABLED,
			AstraPdca_YearModelImpl.FINDER_CACHE_ENABLED,
			AstraPdca_YearImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AstraPdca_YearModelImpl.ENTITY_CACHE_ENABLED,
			AstraPdca_YearModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AstraPdca_YearPersistenceImpl() {
		setModelClass(AstraPdca_Year.class);
	}

	/**
	 * Caches the astra pdca_ year in the entity cache if it is enabled.
	 *
	 * @param astraPdca_Year the astra pdca_ year
	 */
	@Override
	public void cacheResult(AstraPdca_Year astraPdca_Year) {
		entityCache.putResult(AstraPdca_YearModelImpl.ENTITY_CACHE_ENABLED,
			AstraPdca_YearImpl.class, astraPdca_Year.getPrimaryKey(),
			astraPdca_Year);

		astraPdca_Year.resetOriginalValues();
	}

	/**
	 * Caches the astra pdca_ years in the entity cache if it is enabled.
	 *
	 * @param astraPdca_Years the astra pdca_ years
	 */
	@Override
	public void cacheResult(List<AstraPdca_Year> astraPdca_Years) {
		for (AstraPdca_Year astraPdca_Year : astraPdca_Years) {
			if (entityCache.getResult(
						AstraPdca_YearModelImpl.ENTITY_CACHE_ENABLED,
						AstraPdca_YearImpl.class, astraPdca_Year.getPrimaryKey()) == null) {
				cacheResult(astraPdca_Year);
			}
			else {
				astraPdca_Year.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all astra pdca_ years.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AstraPdca_YearImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the astra pdca_ year.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AstraPdca_Year astraPdca_Year) {
		entityCache.removeResult(AstraPdca_YearModelImpl.ENTITY_CACHE_ENABLED,
			AstraPdca_YearImpl.class, astraPdca_Year.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AstraPdca_Year> astraPdca_Years) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AstraPdca_Year astraPdca_Year : astraPdca_Years) {
			entityCache.removeResult(AstraPdca_YearModelImpl.ENTITY_CACHE_ENABLED,
				AstraPdca_YearImpl.class, astraPdca_Year.getPrimaryKey());
		}
	}

	/**
	 * Creates a new astra pdca_ year with the primary key. Does not add the astra pdca_ year to the database.
	 *
	 * @param YearId the primary key for the new astra pdca_ year
	 * @return the new astra pdca_ year
	 */
	@Override
	public AstraPdca_Year create(long YearId) {
		AstraPdca_Year astraPdca_Year = new AstraPdca_YearImpl();

		astraPdca_Year.setNew(true);
		astraPdca_Year.setPrimaryKey(YearId);

		return astraPdca_Year;
	}

	/**
	 * Removes the astra pdca_ year with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param YearId the primary key of the astra pdca_ year
	 * @return the astra pdca_ year that was removed
	 * @throws NoSuchAstraPdca_YearException if a astra pdca_ year with the primary key could not be found
	 */
	@Override
	public AstraPdca_Year remove(long YearId)
		throws NoSuchAstraPdca_YearException {
		return remove((Serializable)YearId);
	}

	/**
	 * Removes the astra pdca_ year with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the astra pdca_ year
	 * @return the astra pdca_ year that was removed
	 * @throws NoSuchAstraPdca_YearException if a astra pdca_ year with the primary key could not be found
	 */
	@Override
	public AstraPdca_Year remove(Serializable primaryKey)
		throws NoSuchAstraPdca_YearException {
		Session session = null;

		try {
			session = openSession();

			AstraPdca_Year astraPdca_Year = (AstraPdca_Year)session.get(AstraPdca_YearImpl.class,
					primaryKey);

			if (astraPdca_Year == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAstraPdca_YearException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(astraPdca_Year);
		}
		catch (NoSuchAstraPdca_YearException nsee) {
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
	protected AstraPdca_Year removeImpl(AstraPdca_Year astraPdca_Year) {
		astraPdca_Year = toUnwrappedModel(astraPdca_Year);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(astraPdca_Year)) {
				astraPdca_Year = (AstraPdca_Year)session.get(AstraPdca_YearImpl.class,
						astraPdca_Year.getPrimaryKeyObj());
			}

			if (astraPdca_Year != null) {
				session.delete(astraPdca_Year);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (astraPdca_Year != null) {
			clearCache(astraPdca_Year);
		}

		return astraPdca_Year;
	}

	@Override
	public AstraPdca_Year updateImpl(AstraPdca_Year astraPdca_Year) {
		astraPdca_Year = toUnwrappedModel(astraPdca_Year);

		boolean isNew = astraPdca_Year.isNew();

		Session session = null;

		try {
			session = openSession();

			if (astraPdca_Year.isNew()) {
				session.save(astraPdca_Year);

				astraPdca_Year.setNew(false);
			}
			else {
				astraPdca_Year = (AstraPdca_Year)session.merge(astraPdca_Year);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(AstraPdca_YearModelImpl.ENTITY_CACHE_ENABLED,
			AstraPdca_YearImpl.class, astraPdca_Year.getPrimaryKey(),
			astraPdca_Year, false);

		astraPdca_Year.resetOriginalValues();

		return astraPdca_Year;
	}

	protected AstraPdca_Year toUnwrappedModel(AstraPdca_Year astraPdca_Year) {
		if (astraPdca_Year instanceof AstraPdca_YearImpl) {
			return astraPdca_Year;
		}

		AstraPdca_YearImpl astraPdca_YearImpl = new AstraPdca_YearImpl();

		astraPdca_YearImpl.setNew(astraPdca_Year.isNew());
		astraPdca_YearImpl.setPrimaryKey(astraPdca_Year.getPrimaryKey());

		astraPdca_YearImpl.setYearId(astraPdca_Year.getYearId());
		astraPdca_YearImpl.setYearId_Company(astraPdca_Year.getYearId_Company());
		astraPdca_YearImpl.setYear(astraPdca_Year.getYear());
		astraPdca_YearImpl.setSiteId(astraPdca_Year.getSiteId());
		astraPdca_YearImpl.setCreateDate(astraPdca_Year.getCreateDate());
		astraPdca_YearImpl.setCreatedBy(astraPdca_Year.getCreatedBy());
		astraPdca_YearImpl.setModifiedDate(astraPdca_Year.getModifiedDate());
		astraPdca_YearImpl.setModifiedBy(astraPdca_Year.getModifiedBy());

		return astraPdca_YearImpl;
	}

	/**
	 * Returns the astra pdca_ year with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the astra pdca_ year
	 * @return the astra pdca_ year
	 * @throws NoSuchAstraPdca_YearException if a astra pdca_ year with the primary key could not be found
	 */
	@Override
	public AstraPdca_Year findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAstraPdca_YearException {
		AstraPdca_Year astraPdca_Year = fetchByPrimaryKey(primaryKey);

		if (astraPdca_Year == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAstraPdca_YearException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return astraPdca_Year;
	}

	/**
	 * Returns the astra pdca_ year with the primary key or throws a {@link NoSuchAstraPdca_YearException} if it could not be found.
	 *
	 * @param YearId the primary key of the astra pdca_ year
	 * @return the astra pdca_ year
	 * @throws NoSuchAstraPdca_YearException if a astra pdca_ year with the primary key could not be found
	 */
	@Override
	public AstraPdca_Year findByPrimaryKey(long YearId)
		throws NoSuchAstraPdca_YearException {
		return findByPrimaryKey((Serializable)YearId);
	}

	/**
	 * Returns the astra pdca_ year with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the astra pdca_ year
	 * @return the astra pdca_ year, or <code>null</code> if a astra pdca_ year with the primary key could not be found
	 */
	@Override
	public AstraPdca_Year fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AstraPdca_YearModelImpl.ENTITY_CACHE_ENABLED,
				AstraPdca_YearImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AstraPdca_Year astraPdca_Year = (AstraPdca_Year)serializable;

		if (astraPdca_Year == null) {
			Session session = null;

			try {
				session = openSession();

				astraPdca_Year = (AstraPdca_Year)session.get(AstraPdca_YearImpl.class,
						primaryKey);

				if (astraPdca_Year != null) {
					cacheResult(astraPdca_Year);
				}
				else {
					entityCache.putResult(AstraPdca_YearModelImpl.ENTITY_CACHE_ENABLED,
						AstraPdca_YearImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AstraPdca_YearModelImpl.ENTITY_CACHE_ENABLED,
					AstraPdca_YearImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return astraPdca_Year;
	}

	/**
	 * Returns the astra pdca_ year with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param YearId the primary key of the astra pdca_ year
	 * @return the astra pdca_ year, or <code>null</code> if a astra pdca_ year with the primary key could not be found
	 */
	@Override
	public AstraPdca_Year fetchByPrimaryKey(long YearId) {
		return fetchByPrimaryKey((Serializable)YearId);
	}

	@Override
	public Map<Serializable, AstraPdca_Year> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AstraPdca_Year> map = new HashMap<Serializable, AstraPdca_Year>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AstraPdca_Year astraPdca_Year = fetchByPrimaryKey(primaryKey);

			if (astraPdca_Year != null) {
				map.put(primaryKey, astraPdca_Year);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AstraPdca_YearModelImpl.ENTITY_CACHE_ENABLED,
					AstraPdca_YearImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AstraPdca_Year)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ASTRAPDCA_YEAR_WHERE_PKS_IN);

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

			for (AstraPdca_Year astraPdca_Year : (List<AstraPdca_Year>)q.list()) {
				map.put(astraPdca_Year.getPrimaryKeyObj(), astraPdca_Year);

				cacheResult(astraPdca_Year);

				uncachedPrimaryKeys.remove(astraPdca_Year.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AstraPdca_YearModelImpl.ENTITY_CACHE_ENABLED,
					AstraPdca_YearImpl.class, primaryKey, nullModel);
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
	 * Returns all the astra pdca_ years.
	 *
	 * @return the astra pdca_ years
	 */
	@Override
	public List<AstraPdca_Year> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the astra pdca_ years.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AstraPdca_YearModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of astra pdca_ years
	 * @param end the upper bound of the range of astra pdca_ years (not inclusive)
	 * @return the range of astra pdca_ years
	 */
	@Override
	public List<AstraPdca_Year> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the astra pdca_ years.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AstraPdca_YearModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of astra pdca_ years
	 * @param end the upper bound of the range of astra pdca_ years (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of astra pdca_ years
	 */
	@Override
	public List<AstraPdca_Year> findAll(int start, int end,
		OrderByComparator<AstraPdca_Year> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the astra pdca_ years.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AstraPdca_YearModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of astra pdca_ years
	 * @param end the upper bound of the range of astra pdca_ years (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of astra pdca_ years
	 */
	@Override
	public List<AstraPdca_Year> findAll(int start, int end,
		OrderByComparator<AstraPdca_Year> orderByComparator,
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

		List<AstraPdca_Year> list = null;

		if (retrieveFromCache) {
			list = (List<AstraPdca_Year>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ASTRAPDCA_YEAR);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASTRAPDCA_YEAR;

				if (pagination) {
					sql = sql.concat(AstraPdca_YearModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AstraPdca_Year>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AstraPdca_Year>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the astra pdca_ years from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AstraPdca_Year astraPdca_Year : findAll()) {
			remove(astraPdca_Year);
		}
	}

	/**
	 * Returns the number of astra pdca_ years.
	 *
	 * @return the number of astra pdca_ years
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ASTRAPDCA_YEAR);

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
		return AstraPdca_YearModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the astra pdca_ year persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AstraPdca_YearImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ASTRAPDCA_YEAR = "SELECT astraPdca_Year FROM AstraPdca_Year astraPdca_Year";
	private static final String _SQL_SELECT_ASTRAPDCA_YEAR_WHERE_PKS_IN = "SELECT astraPdca_Year FROM AstraPdca_Year astraPdca_Year WHERE YearId IN (";
	private static final String _SQL_COUNT_ASTRAPDCA_YEAR = "SELECT COUNT(astraPdca_Year) FROM AstraPdca_Year astraPdca_Year";
	private static final String _ORDER_BY_ENTITY_ALIAS = "astraPdca_Year.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AstraPdca_Year exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(AstraPdca_YearPersistenceImpl.class);
}