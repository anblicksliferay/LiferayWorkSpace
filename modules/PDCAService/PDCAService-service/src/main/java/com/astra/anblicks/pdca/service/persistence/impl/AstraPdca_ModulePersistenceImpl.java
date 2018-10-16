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

import com.astra.anblicks.pdca.exception.NoSuchAstraPdca_ModuleException;
import com.astra.anblicks.pdca.model.AstraPdca_Module;
import com.astra.anblicks.pdca.model.impl.AstraPdca_ModuleImpl;
import com.astra.anblicks.pdca.model.impl.AstraPdca_ModuleModelImpl;
import com.astra.anblicks.pdca.service.persistence.AstraPdca_ModulePersistence;

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
 * The persistence implementation for the astra pdca_ module service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AstraPdca_ModulePersistence
 * @see com.astra.anblicks.pdca.service.persistence.AstraPdca_ModuleUtil
 * @generated
 */
@ProviderType
public class AstraPdca_ModulePersistenceImpl extends BasePersistenceImpl<AstraPdca_Module>
	implements AstraPdca_ModulePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AstraPdca_ModuleUtil} to access the astra pdca_ module persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AstraPdca_ModuleImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AstraPdca_ModuleModelImpl.ENTITY_CACHE_ENABLED,
			AstraPdca_ModuleModelImpl.FINDER_CACHE_ENABLED,
			AstraPdca_ModuleImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AstraPdca_ModuleModelImpl.ENTITY_CACHE_ENABLED,
			AstraPdca_ModuleModelImpl.FINDER_CACHE_ENABLED,
			AstraPdca_ModuleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AstraPdca_ModuleModelImpl.ENTITY_CACHE_ENABLED,
			AstraPdca_ModuleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AstraPdca_ModulePersistenceImpl() {
		setModelClass(AstraPdca_Module.class);
	}

	/**
	 * Caches the astra pdca_ module in the entity cache if it is enabled.
	 *
	 * @param astraPdca_Module the astra pdca_ module
	 */
	@Override
	public void cacheResult(AstraPdca_Module astraPdca_Module) {
		entityCache.putResult(AstraPdca_ModuleModelImpl.ENTITY_CACHE_ENABLED,
			AstraPdca_ModuleImpl.class, astraPdca_Module.getPrimaryKey(),
			astraPdca_Module);

		astraPdca_Module.resetOriginalValues();
	}

	/**
	 * Caches the astra pdca_ modules in the entity cache if it is enabled.
	 *
	 * @param astraPdca_Modules the astra pdca_ modules
	 */
	@Override
	public void cacheResult(List<AstraPdca_Module> astraPdca_Modules) {
		for (AstraPdca_Module astraPdca_Module : astraPdca_Modules) {
			if (entityCache.getResult(
						AstraPdca_ModuleModelImpl.ENTITY_CACHE_ENABLED,
						AstraPdca_ModuleImpl.class,
						astraPdca_Module.getPrimaryKey()) == null) {
				cacheResult(astraPdca_Module);
			}
			else {
				astraPdca_Module.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all astra pdca_ modules.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AstraPdca_ModuleImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the astra pdca_ module.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AstraPdca_Module astraPdca_Module) {
		entityCache.removeResult(AstraPdca_ModuleModelImpl.ENTITY_CACHE_ENABLED,
			AstraPdca_ModuleImpl.class, astraPdca_Module.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AstraPdca_Module> astraPdca_Modules) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AstraPdca_Module astraPdca_Module : astraPdca_Modules) {
			entityCache.removeResult(AstraPdca_ModuleModelImpl.ENTITY_CACHE_ENABLED,
				AstraPdca_ModuleImpl.class, astraPdca_Module.getPrimaryKey());
		}
	}

	/**
	 * Creates a new astra pdca_ module with the primary key. Does not add the astra pdca_ module to the database.
	 *
	 * @param ModuleId the primary key for the new astra pdca_ module
	 * @return the new astra pdca_ module
	 */
	@Override
	public AstraPdca_Module create(long ModuleId) {
		AstraPdca_Module astraPdca_Module = new AstraPdca_ModuleImpl();

		astraPdca_Module.setNew(true);
		astraPdca_Module.setPrimaryKey(ModuleId);

		return astraPdca_Module;
	}

	/**
	 * Removes the astra pdca_ module with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ModuleId the primary key of the astra pdca_ module
	 * @return the astra pdca_ module that was removed
	 * @throws NoSuchAstraPdca_ModuleException if a astra pdca_ module with the primary key could not be found
	 */
	@Override
	public AstraPdca_Module remove(long ModuleId)
		throws NoSuchAstraPdca_ModuleException {
		return remove((Serializable)ModuleId);
	}

	/**
	 * Removes the astra pdca_ module with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the astra pdca_ module
	 * @return the astra pdca_ module that was removed
	 * @throws NoSuchAstraPdca_ModuleException if a astra pdca_ module with the primary key could not be found
	 */
	@Override
	public AstraPdca_Module remove(Serializable primaryKey)
		throws NoSuchAstraPdca_ModuleException {
		Session session = null;

		try {
			session = openSession();

			AstraPdca_Module astraPdca_Module = (AstraPdca_Module)session.get(AstraPdca_ModuleImpl.class,
					primaryKey);

			if (astraPdca_Module == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAstraPdca_ModuleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(astraPdca_Module);
		}
		catch (NoSuchAstraPdca_ModuleException nsee) {
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
	protected AstraPdca_Module removeImpl(AstraPdca_Module astraPdca_Module) {
		astraPdca_Module = toUnwrappedModel(astraPdca_Module);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(astraPdca_Module)) {
				astraPdca_Module = (AstraPdca_Module)session.get(AstraPdca_ModuleImpl.class,
						astraPdca_Module.getPrimaryKeyObj());
			}

			if (astraPdca_Module != null) {
				session.delete(astraPdca_Module);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (astraPdca_Module != null) {
			clearCache(astraPdca_Module);
		}

		return astraPdca_Module;
	}

	@Override
	public AstraPdca_Module updateImpl(AstraPdca_Module astraPdca_Module) {
		astraPdca_Module = toUnwrappedModel(astraPdca_Module);

		boolean isNew = astraPdca_Module.isNew();

		Session session = null;

		try {
			session = openSession();

			if (astraPdca_Module.isNew()) {
				session.save(astraPdca_Module);

				astraPdca_Module.setNew(false);
			}
			else {
				astraPdca_Module = (AstraPdca_Module)session.merge(astraPdca_Module);
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

		entityCache.putResult(AstraPdca_ModuleModelImpl.ENTITY_CACHE_ENABLED,
			AstraPdca_ModuleImpl.class, astraPdca_Module.getPrimaryKey(),
			astraPdca_Module, false);

		astraPdca_Module.resetOriginalValues();

		return astraPdca_Module;
	}

	protected AstraPdca_Module toUnwrappedModel(
		AstraPdca_Module astraPdca_Module) {
		if (astraPdca_Module instanceof AstraPdca_ModuleImpl) {
			return astraPdca_Module;
		}

		AstraPdca_ModuleImpl astraPdca_ModuleImpl = new AstraPdca_ModuleImpl();

		astraPdca_ModuleImpl.setNew(astraPdca_Module.isNew());
		astraPdca_ModuleImpl.setPrimaryKey(astraPdca_Module.getPrimaryKey());

		astraPdca_ModuleImpl.setModuleId(astraPdca_Module.getModuleId());
		astraPdca_ModuleImpl.setModuleId_Company(astraPdca_Module.getModuleId_Company());
		astraPdca_ModuleImpl.setModuleName(astraPdca_Module.getModuleName());
		astraPdca_ModuleImpl.setCheckUncheckFlag(astraPdca_Module.getCheckUncheckFlag());
		astraPdca_ModuleImpl.setSiteId(astraPdca_Module.getSiteId());
		astraPdca_ModuleImpl.setCreateDate(astraPdca_Module.getCreateDate());
		astraPdca_ModuleImpl.setCreatedBy(astraPdca_Module.getCreatedBy());
		astraPdca_ModuleImpl.setModifiedDate(astraPdca_Module.getModifiedDate());
		astraPdca_ModuleImpl.setModifiedBy(astraPdca_Module.getModifiedBy());

		return astraPdca_ModuleImpl;
	}

	/**
	 * Returns the astra pdca_ module with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the astra pdca_ module
	 * @return the astra pdca_ module
	 * @throws NoSuchAstraPdca_ModuleException if a astra pdca_ module with the primary key could not be found
	 */
	@Override
	public AstraPdca_Module findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAstraPdca_ModuleException {
		AstraPdca_Module astraPdca_Module = fetchByPrimaryKey(primaryKey);

		if (astraPdca_Module == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAstraPdca_ModuleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return astraPdca_Module;
	}

	/**
	 * Returns the astra pdca_ module with the primary key or throws a {@link NoSuchAstraPdca_ModuleException} if it could not be found.
	 *
	 * @param ModuleId the primary key of the astra pdca_ module
	 * @return the astra pdca_ module
	 * @throws NoSuchAstraPdca_ModuleException if a astra pdca_ module with the primary key could not be found
	 */
	@Override
	public AstraPdca_Module findByPrimaryKey(long ModuleId)
		throws NoSuchAstraPdca_ModuleException {
		return findByPrimaryKey((Serializable)ModuleId);
	}

	/**
	 * Returns the astra pdca_ module with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the astra pdca_ module
	 * @return the astra pdca_ module, or <code>null</code> if a astra pdca_ module with the primary key could not be found
	 */
	@Override
	public AstraPdca_Module fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AstraPdca_ModuleModelImpl.ENTITY_CACHE_ENABLED,
				AstraPdca_ModuleImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AstraPdca_Module astraPdca_Module = (AstraPdca_Module)serializable;

		if (astraPdca_Module == null) {
			Session session = null;

			try {
				session = openSession();

				astraPdca_Module = (AstraPdca_Module)session.get(AstraPdca_ModuleImpl.class,
						primaryKey);

				if (astraPdca_Module != null) {
					cacheResult(astraPdca_Module);
				}
				else {
					entityCache.putResult(AstraPdca_ModuleModelImpl.ENTITY_CACHE_ENABLED,
						AstraPdca_ModuleImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AstraPdca_ModuleModelImpl.ENTITY_CACHE_ENABLED,
					AstraPdca_ModuleImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return astraPdca_Module;
	}

	/**
	 * Returns the astra pdca_ module with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ModuleId the primary key of the astra pdca_ module
	 * @return the astra pdca_ module, or <code>null</code> if a astra pdca_ module with the primary key could not be found
	 */
	@Override
	public AstraPdca_Module fetchByPrimaryKey(long ModuleId) {
		return fetchByPrimaryKey((Serializable)ModuleId);
	}

	@Override
	public Map<Serializable, AstraPdca_Module> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AstraPdca_Module> map = new HashMap<Serializable, AstraPdca_Module>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AstraPdca_Module astraPdca_Module = fetchByPrimaryKey(primaryKey);

			if (astraPdca_Module != null) {
				map.put(primaryKey, astraPdca_Module);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AstraPdca_ModuleModelImpl.ENTITY_CACHE_ENABLED,
					AstraPdca_ModuleImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AstraPdca_Module)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ASTRAPDCA_MODULE_WHERE_PKS_IN);

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

			for (AstraPdca_Module astraPdca_Module : (List<AstraPdca_Module>)q.list()) {
				map.put(astraPdca_Module.getPrimaryKeyObj(), astraPdca_Module);

				cacheResult(astraPdca_Module);

				uncachedPrimaryKeys.remove(astraPdca_Module.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AstraPdca_ModuleModelImpl.ENTITY_CACHE_ENABLED,
					AstraPdca_ModuleImpl.class, primaryKey, nullModel);
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
	 * Returns all the astra pdca_ modules.
	 *
	 * @return the astra pdca_ modules
	 */
	@Override
	public List<AstraPdca_Module> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the astra pdca_ modules.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AstraPdca_ModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of astra pdca_ modules
	 * @param end the upper bound of the range of astra pdca_ modules (not inclusive)
	 * @return the range of astra pdca_ modules
	 */
	@Override
	public List<AstraPdca_Module> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the astra pdca_ modules.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AstraPdca_ModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of astra pdca_ modules
	 * @param end the upper bound of the range of astra pdca_ modules (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of astra pdca_ modules
	 */
	@Override
	public List<AstraPdca_Module> findAll(int start, int end,
		OrderByComparator<AstraPdca_Module> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the astra pdca_ modules.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AstraPdca_ModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of astra pdca_ modules
	 * @param end the upper bound of the range of astra pdca_ modules (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of astra pdca_ modules
	 */
	@Override
	public List<AstraPdca_Module> findAll(int start, int end,
		OrderByComparator<AstraPdca_Module> orderByComparator,
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

		List<AstraPdca_Module> list = null;

		if (retrieveFromCache) {
			list = (List<AstraPdca_Module>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ASTRAPDCA_MODULE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASTRAPDCA_MODULE;

				if (pagination) {
					sql = sql.concat(AstraPdca_ModuleModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AstraPdca_Module>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AstraPdca_Module>)QueryUtil.list(q,
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
	 * Removes all the astra pdca_ modules from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AstraPdca_Module astraPdca_Module : findAll()) {
			remove(astraPdca_Module);
		}
	}

	/**
	 * Returns the number of astra pdca_ modules.
	 *
	 * @return the number of astra pdca_ modules
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ASTRAPDCA_MODULE);

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
		return AstraPdca_ModuleModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the astra pdca_ module persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AstraPdca_ModuleImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ASTRAPDCA_MODULE = "SELECT astraPdca_Module FROM AstraPdca_Module astraPdca_Module";
	private static final String _SQL_SELECT_ASTRAPDCA_MODULE_WHERE_PKS_IN = "SELECT astraPdca_Module FROM AstraPdca_Module astraPdca_Module WHERE ModuleId IN (";
	private static final String _SQL_COUNT_ASTRAPDCA_MODULE = "SELECT COUNT(astraPdca_Module) FROM AstraPdca_Module astraPdca_Module";
	private static final String _ORDER_BY_ENTITY_ALIAS = "astraPdca_Module.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AstraPdca_Module exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(AstraPdca_ModulePersistenceImpl.class);
}