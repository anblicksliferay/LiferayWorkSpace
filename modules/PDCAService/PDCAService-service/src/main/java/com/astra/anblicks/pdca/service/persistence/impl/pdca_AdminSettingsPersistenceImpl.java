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

import com.astra.anblicks.pdca.exception.NoSuch_AdminSettingsException;
import com.astra.anblicks.pdca.model.impl.pdca_AdminSettingsImpl;
import com.astra.anblicks.pdca.model.impl.pdca_AdminSettingsModelImpl;
import com.astra.anblicks.pdca.model.pdca_AdminSettings;
import com.astra.anblicks.pdca.service.persistence.pdca_AdminSettingsPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
 * The persistence implementation for the pdca_ admin settings service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see pdca_AdminSettingsPersistence
 * @see com.astra.anblicks.pdca.service.persistence.pdca_AdminSettingsUtil
 * @generated
 */
@ProviderType
public class pdca_AdminSettingsPersistenceImpl extends BasePersistenceImpl<pdca_AdminSettings>
	implements pdca_AdminSettingsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link pdca_AdminSettingsUtil} to access the pdca_ admin settings persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = pdca_AdminSettingsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(pdca_AdminSettingsModelImpl.ENTITY_CACHE_ENABLED,
			pdca_AdminSettingsModelImpl.FINDER_CACHE_ENABLED,
			pdca_AdminSettingsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(pdca_AdminSettingsModelImpl.ENTITY_CACHE_ENABLED,
			pdca_AdminSettingsModelImpl.FINDER_CACHE_ENABLED,
			pdca_AdminSettingsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(pdca_AdminSettingsModelImpl.ENTITY_CACHE_ENABLED,
			pdca_AdminSettingsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public pdca_AdminSettingsPersistenceImpl() {
		setModelClass(pdca_AdminSettings.class);
	}

	/**
	 * Caches the pdca_ admin settings in the entity cache if it is enabled.
	 *
	 * @param pdca_AdminSettings the pdca_ admin settings
	 */
	@Override
	public void cacheResult(pdca_AdminSettings pdca_AdminSettings) {
		entityCache.putResult(pdca_AdminSettingsModelImpl.ENTITY_CACHE_ENABLED,
			pdca_AdminSettingsImpl.class, pdca_AdminSettings.getPrimaryKey(),
			pdca_AdminSettings);

		pdca_AdminSettings.resetOriginalValues();
	}

	/**
	 * Caches the pdca_ admin settingses in the entity cache if it is enabled.
	 *
	 * @param pdca_AdminSettingses the pdca_ admin settingses
	 */
	@Override
	public void cacheResult(List<pdca_AdminSettings> pdca_AdminSettingses) {
		for (pdca_AdminSettings pdca_AdminSettings : pdca_AdminSettingses) {
			if (entityCache.getResult(
						pdca_AdminSettingsModelImpl.ENTITY_CACHE_ENABLED,
						pdca_AdminSettingsImpl.class,
						pdca_AdminSettings.getPrimaryKey()) == null) {
				cacheResult(pdca_AdminSettings);
			}
			else {
				pdca_AdminSettings.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all pdca_ admin settingses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(pdca_AdminSettingsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the pdca_ admin settings.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(pdca_AdminSettings pdca_AdminSettings) {
		entityCache.removeResult(pdca_AdminSettingsModelImpl.ENTITY_CACHE_ENABLED,
			pdca_AdminSettingsImpl.class, pdca_AdminSettings.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<pdca_AdminSettings> pdca_AdminSettingses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (pdca_AdminSettings pdca_AdminSettings : pdca_AdminSettingses) {
			entityCache.removeResult(pdca_AdminSettingsModelImpl.ENTITY_CACHE_ENABLED,
				pdca_AdminSettingsImpl.class, pdca_AdminSettings.getPrimaryKey());
		}
	}

	/**
	 * Creates a new pdca_ admin settings with the primary key. Does not add the pdca_ admin settings to the database.
	 *
	 * @param settings_Id the primary key for the new pdca_ admin settings
	 * @return the new pdca_ admin settings
	 */
	@Override
	public pdca_AdminSettings create(long settings_Id) {
		pdca_AdminSettings pdca_AdminSettings = new pdca_AdminSettingsImpl();

		pdca_AdminSettings.setNew(true);
		pdca_AdminSettings.setPrimaryKey(settings_Id);

		pdca_AdminSettings.setCompanyId(companyProvider.getCompanyId());

		return pdca_AdminSettings;
	}

	/**
	 * Removes the pdca_ admin settings with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param settings_Id the primary key of the pdca_ admin settings
	 * @return the pdca_ admin settings that was removed
	 * @throws NoSuch_AdminSettingsException if a pdca_ admin settings with the primary key could not be found
	 */
	@Override
	public pdca_AdminSettings remove(long settings_Id)
		throws NoSuch_AdminSettingsException {
		return remove((Serializable)settings_Id);
	}

	/**
	 * Removes the pdca_ admin settings with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pdca_ admin settings
	 * @return the pdca_ admin settings that was removed
	 * @throws NoSuch_AdminSettingsException if a pdca_ admin settings with the primary key could not be found
	 */
	@Override
	public pdca_AdminSettings remove(Serializable primaryKey)
		throws NoSuch_AdminSettingsException {
		Session session = null;

		try {
			session = openSession();

			pdca_AdminSettings pdca_AdminSettings = (pdca_AdminSettings)session.get(pdca_AdminSettingsImpl.class,
					primaryKey);

			if (pdca_AdminSettings == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuch_AdminSettingsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(pdca_AdminSettings);
		}
		catch (NoSuch_AdminSettingsException nsee) {
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
	protected pdca_AdminSettings removeImpl(
		pdca_AdminSettings pdca_AdminSettings) {
		pdca_AdminSettings = toUnwrappedModel(pdca_AdminSettings);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pdca_AdminSettings)) {
				pdca_AdminSettings = (pdca_AdminSettings)session.get(pdca_AdminSettingsImpl.class,
						pdca_AdminSettings.getPrimaryKeyObj());
			}

			if (pdca_AdminSettings != null) {
				session.delete(pdca_AdminSettings);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (pdca_AdminSettings != null) {
			clearCache(pdca_AdminSettings);
		}

		return pdca_AdminSettings;
	}

	@Override
	public pdca_AdminSettings updateImpl(pdca_AdminSettings pdca_AdminSettings) {
		pdca_AdminSettings = toUnwrappedModel(pdca_AdminSettings);

		boolean isNew = pdca_AdminSettings.isNew();

		Session session = null;

		try {
			session = openSession();

			if (pdca_AdminSettings.isNew()) {
				session.save(pdca_AdminSettings);

				pdca_AdminSettings.setNew(false);
			}
			else {
				pdca_AdminSettings = (pdca_AdminSettings)session.merge(pdca_AdminSettings);
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

		entityCache.putResult(pdca_AdminSettingsModelImpl.ENTITY_CACHE_ENABLED,
			pdca_AdminSettingsImpl.class, pdca_AdminSettings.getPrimaryKey(),
			pdca_AdminSettings, false);

		pdca_AdminSettings.resetOriginalValues();

		return pdca_AdminSettings;
	}

	protected pdca_AdminSettings toUnwrappedModel(
		pdca_AdminSettings pdca_AdminSettings) {
		if (pdca_AdminSettings instanceof pdca_AdminSettingsImpl) {
			return pdca_AdminSettings;
		}

		pdca_AdminSettingsImpl pdca_AdminSettingsImpl = new pdca_AdminSettingsImpl();

		pdca_AdminSettingsImpl.setNew(pdca_AdminSettings.isNew());
		pdca_AdminSettingsImpl.setPrimaryKey(pdca_AdminSettings.getPrimaryKey());

		pdca_AdminSettingsImpl.setSettings_Id(pdca_AdminSettings.getSettings_Id());
		pdca_AdminSettingsImpl.setModuleId(pdca_AdminSettings.getModuleId());
		pdca_AdminSettingsImpl.setYear(pdca_AdminSettings.getYear());
		pdca_AdminSettingsImpl.setCompanyId(pdca_AdminSettings.getCompanyId());
		pdca_AdminSettingsImpl.setPeriodId(pdca_AdminSettings.getPeriodId());
		pdca_AdminSettingsImpl.setSiteId(pdca_AdminSettings.getSiteId());
		pdca_AdminSettingsImpl.setCreateDate(pdca_AdminSettings.getCreateDate());
		pdca_AdminSettingsImpl.setCreatedBy(pdca_AdminSettings.getCreatedBy());
		pdca_AdminSettingsImpl.setModifiedDate(pdca_AdminSettings.getModifiedDate());
		pdca_AdminSettingsImpl.setModifiedBy(pdca_AdminSettings.getModifiedBy());

		return pdca_AdminSettingsImpl;
	}

	/**
	 * Returns the pdca_ admin settings with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the pdca_ admin settings
	 * @return the pdca_ admin settings
	 * @throws NoSuch_AdminSettingsException if a pdca_ admin settings with the primary key could not be found
	 */
	@Override
	public pdca_AdminSettings findByPrimaryKey(Serializable primaryKey)
		throws NoSuch_AdminSettingsException {
		pdca_AdminSettings pdca_AdminSettings = fetchByPrimaryKey(primaryKey);

		if (pdca_AdminSettings == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuch_AdminSettingsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return pdca_AdminSettings;
	}

	/**
	 * Returns the pdca_ admin settings with the primary key or throws a {@link NoSuch_AdminSettingsException} if it could not be found.
	 *
	 * @param settings_Id the primary key of the pdca_ admin settings
	 * @return the pdca_ admin settings
	 * @throws NoSuch_AdminSettingsException if a pdca_ admin settings with the primary key could not be found
	 */
	@Override
	public pdca_AdminSettings findByPrimaryKey(long settings_Id)
		throws NoSuch_AdminSettingsException {
		return findByPrimaryKey((Serializable)settings_Id);
	}

	/**
	 * Returns the pdca_ admin settings with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pdca_ admin settings
	 * @return the pdca_ admin settings, or <code>null</code> if a pdca_ admin settings with the primary key could not be found
	 */
	@Override
	public pdca_AdminSettings fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(pdca_AdminSettingsModelImpl.ENTITY_CACHE_ENABLED,
				pdca_AdminSettingsImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		pdca_AdminSettings pdca_AdminSettings = (pdca_AdminSettings)serializable;

		if (pdca_AdminSettings == null) {
			Session session = null;

			try {
				session = openSession();

				pdca_AdminSettings = (pdca_AdminSettings)session.get(pdca_AdminSettingsImpl.class,
						primaryKey);

				if (pdca_AdminSettings != null) {
					cacheResult(pdca_AdminSettings);
				}
				else {
					entityCache.putResult(pdca_AdminSettingsModelImpl.ENTITY_CACHE_ENABLED,
						pdca_AdminSettingsImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(pdca_AdminSettingsModelImpl.ENTITY_CACHE_ENABLED,
					pdca_AdminSettingsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return pdca_AdminSettings;
	}

	/**
	 * Returns the pdca_ admin settings with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param settings_Id the primary key of the pdca_ admin settings
	 * @return the pdca_ admin settings, or <code>null</code> if a pdca_ admin settings with the primary key could not be found
	 */
	@Override
	public pdca_AdminSettings fetchByPrimaryKey(long settings_Id) {
		return fetchByPrimaryKey((Serializable)settings_Id);
	}

	@Override
	public Map<Serializable, pdca_AdminSettings> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, pdca_AdminSettings> map = new HashMap<Serializable, pdca_AdminSettings>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			pdca_AdminSettings pdca_AdminSettings = fetchByPrimaryKey(primaryKey);

			if (pdca_AdminSettings != null) {
				map.put(primaryKey, pdca_AdminSettings);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(pdca_AdminSettingsModelImpl.ENTITY_CACHE_ENABLED,
					pdca_AdminSettingsImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (pdca_AdminSettings)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PDCA_ADMINSETTINGS_WHERE_PKS_IN);

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

			for (pdca_AdminSettings pdca_AdminSettings : (List<pdca_AdminSettings>)q.list()) {
				map.put(pdca_AdminSettings.getPrimaryKeyObj(),
					pdca_AdminSettings);

				cacheResult(pdca_AdminSettings);

				uncachedPrimaryKeys.remove(pdca_AdminSettings.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(pdca_AdminSettingsModelImpl.ENTITY_CACHE_ENABLED,
					pdca_AdminSettingsImpl.class, primaryKey, nullModel);
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
	 * Returns all the pdca_ admin settingses.
	 *
	 * @return the pdca_ admin settingses
	 */
	@Override
	public List<pdca_AdminSettings> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pdca_ admin settingses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pdca_AdminSettingsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of pdca_ admin settingses
	 * @param end the upper bound of the range of pdca_ admin settingses (not inclusive)
	 * @return the range of pdca_ admin settingses
	 */
	@Override
	public List<pdca_AdminSettings> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the pdca_ admin settingses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pdca_AdminSettingsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of pdca_ admin settingses
	 * @param end the upper bound of the range of pdca_ admin settingses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pdca_ admin settingses
	 */
	@Override
	public List<pdca_AdminSettings> findAll(int start, int end,
		OrderByComparator<pdca_AdminSettings> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pdca_ admin settingses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pdca_AdminSettingsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of pdca_ admin settingses
	 * @param end the upper bound of the range of pdca_ admin settingses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of pdca_ admin settingses
	 */
	@Override
	public List<pdca_AdminSettings> findAll(int start, int end,
		OrderByComparator<pdca_AdminSettings> orderByComparator,
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

		List<pdca_AdminSettings> list = null;

		if (retrieveFromCache) {
			list = (List<pdca_AdminSettings>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PDCA_ADMINSETTINGS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PDCA_ADMINSETTINGS;

				if (pagination) {
					sql = sql.concat(pdca_AdminSettingsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<pdca_AdminSettings>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<pdca_AdminSettings>)QueryUtil.list(q,
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
	 * Removes all the pdca_ admin settingses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (pdca_AdminSettings pdca_AdminSettings : findAll()) {
			remove(pdca_AdminSettings);
		}
	}

	/**
	 * Returns the number of pdca_ admin settingses.
	 *
	 * @return the number of pdca_ admin settingses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PDCA_ADMINSETTINGS);

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
		return pdca_AdminSettingsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the pdca_ admin settings persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(pdca_AdminSettingsImpl.class.getName());
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
	private static final String _SQL_SELECT_PDCA_ADMINSETTINGS = "SELECT pdca_AdminSettings FROM pdca_AdminSettings pdca_AdminSettings";
	private static final String _SQL_SELECT_PDCA_ADMINSETTINGS_WHERE_PKS_IN = "SELECT pdca_AdminSettings FROM pdca_AdminSettings pdca_AdminSettings WHERE settings_Id IN (";
	private static final String _SQL_COUNT_PDCA_ADMINSETTINGS = "SELECT COUNT(pdca_AdminSettings) FROM pdca_AdminSettings pdca_AdminSettings";
	private static final String _ORDER_BY_ENTITY_ALIAS = "pdca_AdminSettings.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No pdca_AdminSettings exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(pdca_AdminSettingsPersistenceImpl.class);
}