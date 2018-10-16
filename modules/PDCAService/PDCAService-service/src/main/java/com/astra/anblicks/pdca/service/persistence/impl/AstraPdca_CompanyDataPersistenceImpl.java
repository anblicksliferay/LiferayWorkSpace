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

import com.astra.anblicks.pdca.exception.NoSuchAstraPdca_CompanyDataException;
import com.astra.anblicks.pdca.model.AstraPdca_CompanyData;
import com.astra.anblicks.pdca.model.impl.AstraPdca_CompanyDataImpl;
import com.astra.anblicks.pdca.model.impl.AstraPdca_CompanyDataModelImpl;
import com.astra.anblicks.pdca.service.persistence.AstraPdca_CompanyDataPersistence;

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
 * The persistence implementation for the astra pdca_ company data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AstraPdca_CompanyDataPersistence
 * @see com.astra.anblicks.pdca.service.persistence.AstraPdca_CompanyDataUtil
 * @generated
 */
@ProviderType
public class AstraPdca_CompanyDataPersistenceImpl extends BasePersistenceImpl<AstraPdca_CompanyData>
	implements AstraPdca_CompanyDataPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AstraPdca_CompanyDataUtil} to access the astra pdca_ company data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AstraPdca_CompanyDataImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AstraPdca_CompanyDataModelImpl.ENTITY_CACHE_ENABLED,
			AstraPdca_CompanyDataModelImpl.FINDER_CACHE_ENABLED,
			AstraPdca_CompanyDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AstraPdca_CompanyDataModelImpl.ENTITY_CACHE_ENABLED,
			AstraPdca_CompanyDataModelImpl.FINDER_CACHE_ENABLED,
			AstraPdca_CompanyDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AstraPdca_CompanyDataModelImpl.ENTITY_CACHE_ENABLED,
			AstraPdca_CompanyDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AstraPdca_CompanyDataPersistenceImpl() {
		setModelClass(AstraPdca_CompanyData.class);
	}

	/**
	 * Caches the astra pdca_ company data in the entity cache if it is enabled.
	 *
	 * @param astraPdca_CompanyData the astra pdca_ company data
	 */
	@Override
	public void cacheResult(AstraPdca_CompanyData astraPdca_CompanyData) {
		entityCache.putResult(AstraPdca_CompanyDataModelImpl.ENTITY_CACHE_ENABLED,
			AstraPdca_CompanyDataImpl.class,
			astraPdca_CompanyData.getPrimaryKey(), astraPdca_CompanyData);

		astraPdca_CompanyData.resetOriginalValues();
	}

	/**
	 * Caches the astra pdca_ company datas in the entity cache if it is enabled.
	 *
	 * @param astraPdca_CompanyDatas the astra pdca_ company datas
	 */
	@Override
	public void cacheResult(List<AstraPdca_CompanyData> astraPdca_CompanyDatas) {
		for (AstraPdca_CompanyData astraPdca_CompanyData : astraPdca_CompanyDatas) {
			if (entityCache.getResult(
						AstraPdca_CompanyDataModelImpl.ENTITY_CACHE_ENABLED,
						AstraPdca_CompanyDataImpl.class,
						astraPdca_CompanyData.getPrimaryKey()) == null) {
				cacheResult(astraPdca_CompanyData);
			}
			else {
				astraPdca_CompanyData.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all astra pdca_ company datas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AstraPdca_CompanyDataImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the astra pdca_ company data.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AstraPdca_CompanyData astraPdca_CompanyData) {
		entityCache.removeResult(AstraPdca_CompanyDataModelImpl.ENTITY_CACHE_ENABLED,
			AstraPdca_CompanyDataImpl.class,
			astraPdca_CompanyData.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AstraPdca_CompanyData> astraPdca_CompanyDatas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AstraPdca_CompanyData astraPdca_CompanyData : astraPdca_CompanyDatas) {
			entityCache.removeResult(AstraPdca_CompanyDataModelImpl.ENTITY_CACHE_ENABLED,
				AstraPdca_CompanyDataImpl.class,
				astraPdca_CompanyData.getPrimaryKey());
		}
	}

	/**
	 * Creates a new astra pdca_ company data with the primary key. Does not add the astra pdca_ company data to the database.
	 *
	 * @param companyId the primary key for the new astra pdca_ company data
	 * @return the new astra pdca_ company data
	 */
	@Override
	public AstraPdca_CompanyData create(long companyId) {
		AstraPdca_CompanyData astraPdca_CompanyData = new AstraPdca_CompanyDataImpl();

		astraPdca_CompanyData.setNew(true);
		astraPdca_CompanyData.setPrimaryKey(companyId);

		astraPdca_CompanyData.setCompanyId(companyProvider.getCompanyId());

		return astraPdca_CompanyData;
	}

	/**
	 * Removes the astra pdca_ company data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param companyId the primary key of the astra pdca_ company data
	 * @return the astra pdca_ company data that was removed
	 * @throws NoSuchAstraPdca_CompanyDataException if a astra pdca_ company data with the primary key could not be found
	 */
	@Override
	public AstraPdca_CompanyData remove(long companyId)
		throws NoSuchAstraPdca_CompanyDataException {
		return remove((Serializable)companyId);
	}

	/**
	 * Removes the astra pdca_ company data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the astra pdca_ company data
	 * @return the astra pdca_ company data that was removed
	 * @throws NoSuchAstraPdca_CompanyDataException if a astra pdca_ company data with the primary key could not be found
	 */
	@Override
	public AstraPdca_CompanyData remove(Serializable primaryKey)
		throws NoSuchAstraPdca_CompanyDataException {
		Session session = null;

		try {
			session = openSession();

			AstraPdca_CompanyData astraPdca_CompanyData = (AstraPdca_CompanyData)session.get(AstraPdca_CompanyDataImpl.class,
					primaryKey);

			if (astraPdca_CompanyData == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAstraPdca_CompanyDataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(astraPdca_CompanyData);
		}
		catch (NoSuchAstraPdca_CompanyDataException nsee) {
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
	protected AstraPdca_CompanyData removeImpl(
		AstraPdca_CompanyData astraPdca_CompanyData) {
		astraPdca_CompanyData = toUnwrappedModel(astraPdca_CompanyData);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(astraPdca_CompanyData)) {
				astraPdca_CompanyData = (AstraPdca_CompanyData)session.get(AstraPdca_CompanyDataImpl.class,
						astraPdca_CompanyData.getPrimaryKeyObj());
			}

			if (astraPdca_CompanyData != null) {
				session.delete(astraPdca_CompanyData);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (astraPdca_CompanyData != null) {
			clearCache(astraPdca_CompanyData);
		}

		return astraPdca_CompanyData;
	}

	@Override
	public AstraPdca_CompanyData updateImpl(
		AstraPdca_CompanyData astraPdca_CompanyData) {
		astraPdca_CompanyData = toUnwrappedModel(astraPdca_CompanyData);

		boolean isNew = astraPdca_CompanyData.isNew();

		Session session = null;

		try {
			session = openSession();

			if (astraPdca_CompanyData.isNew()) {
				session.save(astraPdca_CompanyData);

				astraPdca_CompanyData.setNew(false);
			}
			else {
				astraPdca_CompanyData = (AstraPdca_CompanyData)session.merge(astraPdca_CompanyData);
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

		entityCache.putResult(AstraPdca_CompanyDataModelImpl.ENTITY_CACHE_ENABLED,
			AstraPdca_CompanyDataImpl.class,
			astraPdca_CompanyData.getPrimaryKey(), astraPdca_CompanyData, false);

		astraPdca_CompanyData.resetOriginalValues();

		return astraPdca_CompanyData;
	}

	protected AstraPdca_CompanyData toUnwrappedModel(
		AstraPdca_CompanyData astraPdca_CompanyData) {
		if (astraPdca_CompanyData instanceof AstraPdca_CompanyDataImpl) {
			return astraPdca_CompanyData;
		}

		AstraPdca_CompanyDataImpl astraPdca_CompanyDataImpl = new AstraPdca_CompanyDataImpl();

		astraPdca_CompanyDataImpl.setNew(astraPdca_CompanyData.isNew());
		astraPdca_CompanyDataImpl.setPrimaryKey(astraPdca_CompanyData.getPrimaryKey());

		astraPdca_CompanyDataImpl.setCompanyId(astraPdca_CompanyData.getCompanyId());
		astraPdca_CompanyDataImpl.setCompanyCode(astraPdca_CompanyData.getCompanyCode());
		astraPdca_CompanyDataImpl.setCompanyName(astraPdca_CompanyData.getCompanyName());
		astraPdca_CompanyDataImpl.setGroupName(astraPdca_CompanyData.getGroupName());
		astraPdca_CompanyDataImpl.setDIC(astraPdca_CompanyData.getDIC());
		astraPdca_CompanyDataImpl.setDICINITIAL(astraPdca_CompanyData.getDICINITIAL());
		astraPdca_CompanyDataImpl.setLEFTUP(astraPdca_CompanyData.getLEFTUP());
		astraPdca_CompanyDataImpl.setLEFTUPTITLE(astraPdca_CompanyData.getLEFTUPTITLE());
		astraPdca_CompanyDataImpl.setLEFTUPCOMPANY(astraPdca_CompanyData.getLEFTUPCOMPANY());
		astraPdca_CompanyDataImpl.setLEFTBOTTOM(astraPdca_CompanyData.getLEFTBOTTOM());
		astraPdca_CompanyDataImpl.setLEFTBOTTOMTITLE(astraPdca_CompanyData.getLEFTBOTTOMTITLE());
		astraPdca_CompanyDataImpl.setLEFTBOTTOMCOMPANY(astraPdca_CompanyData.getLEFTBOTTOMCOMPANY());
		astraPdca_CompanyDataImpl.setMIDUP(astraPdca_CompanyData.getMIDUP());
		astraPdca_CompanyDataImpl.setMIDUPTITLE(astraPdca_CompanyData.getMIDUPTITLE());
		astraPdca_CompanyDataImpl.setMIDUPCOMPANY(astraPdca_CompanyData.getMIDUPCOMPANY());
		astraPdca_CompanyDataImpl.setMIDBOTTOM(astraPdca_CompanyData.getMIDBOTTOM());
		astraPdca_CompanyDataImpl.setMIDBOTTOMTITLE(astraPdca_CompanyData.getMIDBOTTOMTITLE());
		astraPdca_CompanyDataImpl.setMIDBOTTOMCOMPANY(astraPdca_CompanyData.getMIDBOTTOMCOMPANY());
		astraPdca_CompanyDataImpl.setRIGHTUP(astraPdca_CompanyData.getRIGHTUP());
		astraPdca_CompanyDataImpl.setRIGHTUPTITLE(astraPdca_CompanyData.getRIGHTUPTITLE());
		astraPdca_CompanyDataImpl.setRIGHTUPCOMPANY(astraPdca_CompanyData.getRIGHTUPCOMPANY());
		astraPdca_CompanyDataImpl.setRIGHTBOTTOM(astraPdca_CompanyData.getRIGHTBOTTOM());
		astraPdca_CompanyDataImpl.setRIGHTBOTTOMTITLE(astraPdca_CompanyData.getRIGHTBOTTOMTITLE());
		astraPdca_CompanyDataImpl.setRIGHTBOTTOMCOMPANY(astraPdca_CompanyData.getRIGHTBOTTOMCOMPANY());
		astraPdca_CompanyDataImpl.setModuleId(astraPdca_CompanyData.getModuleId());
		astraPdca_CompanyDataImpl.setYearId(astraPdca_CompanyData.getYearId());
		astraPdca_CompanyDataImpl.setCheckFlag(astraPdca_CompanyData.getCheckFlag());
		astraPdca_CompanyDataImpl.setSiteId(astraPdca_CompanyData.getSiteId());
		astraPdca_CompanyDataImpl.setCreateDate(astraPdca_CompanyData.getCreateDate());
		astraPdca_CompanyDataImpl.setCreatedBy(astraPdca_CompanyData.getCreatedBy());
		astraPdca_CompanyDataImpl.setModifiedDate(astraPdca_CompanyData.getModifiedDate());
		astraPdca_CompanyDataImpl.setModifiedBy(astraPdca_CompanyData.getModifiedBy());

		return astraPdca_CompanyDataImpl;
	}

	/**
	 * Returns the astra pdca_ company data with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the astra pdca_ company data
	 * @return the astra pdca_ company data
	 * @throws NoSuchAstraPdca_CompanyDataException if a astra pdca_ company data with the primary key could not be found
	 */
	@Override
	public AstraPdca_CompanyData findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAstraPdca_CompanyDataException {
		AstraPdca_CompanyData astraPdca_CompanyData = fetchByPrimaryKey(primaryKey);

		if (astraPdca_CompanyData == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAstraPdca_CompanyDataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return astraPdca_CompanyData;
	}

	/**
	 * Returns the astra pdca_ company data with the primary key or throws a {@link NoSuchAstraPdca_CompanyDataException} if it could not be found.
	 *
	 * @param companyId the primary key of the astra pdca_ company data
	 * @return the astra pdca_ company data
	 * @throws NoSuchAstraPdca_CompanyDataException if a astra pdca_ company data with the primary key could not be found
	 */
	@Override
	public AstraPdca_CompanyData findByPrimaryKey(long companyId)
		throws NoSuchAstraPdca_CompanyDataException {
		return findByPrimaryKey((Serializable)companyId);
	}

	/**
	 * Returns the astra pdca_ company data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the astra pdca_ company data
	 * @return the astra pdca_ company data, or <code>null</code> if a astra pdca_ company data with the primary key could not be found
	 */
	@Override
	public AstraPdca_CompanyData fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AstraPdca_CompanyDataModelImpl.ENTITY_CACHE_ENABLED,
				AstraPdca_CompanyDataImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AstraPdca_CompanyData astraPdca_CompanyData = (AstraPdca_CompanyData)serializable;

		if (astraPdca_CompanyData == null) {
			Session session = null;

			try {
				session = openSession();

				astraPdca_CompanyData = (AstraPdca_CompanyData)session.get(AstraPdca_CompanyDataImpl.class,
						primaryKey);

				if (astraPdca_CompanyData != null) {
					cacheResult(astraPdca_CompanyData);
				}
				else {
					entityCache.putResult(AstraPdca_CompanyDataModelImpl.ENTITY_CACHE_ENABLED,
						AstraPdca_CompanyDataImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AstraPdca_CompanyDataModelImpl.ENTITY_CACHE_ENABLED,
					AstraPdca_CompanyDataImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return astraPdca_CompanyData;
	}

	/**
	 * Returns the astra pdca_ company data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param companyId the primary key of the astra pdca_ company data
	 * @return the astra pdca_ company data, or <code>null</code> if a astra pdca_ company data with the primary key could not be found
	 */
	@Override
	public AstraPdca_CompanyData fetchByPrimaryKey(long companyId) {
		return fetchByPrimaryKey((Serializable)companyId);
	}

	@Override
	public Map<Serializable, AstraPdca_CompanyData> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AstraPdca_CompanyData> map = new HashMap<Serializable, AstraPdca_CompanyData>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AstraPdca_CompanyData astraPdca_CompanyData = fetchByPrimaryKey(primaryKey);

			if (astraPdca_CompanyData != null) {
				map.put(primaryKey, astraPdca_CompanyData);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AstraPdca_CompanyDataModelImpl.ENTITY_CACHE_ENABLED,
					AstraPdca_CompanyDataImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AstraPdca_CompanyData)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ASTRAPDCA_COMPANYDATA_WHERE_PKS_IN);

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

			for (AstraPdca_CompanyData astraPdca_CompanyData : (List<AstraPdca_CompanyData>)q.list()) {
				map.put(astraPdca_CompanyData.getPrimaryKeyObj(),
					astraPdca_CompanyData);

				cacheResult(astraPdca_CompanyData);

				uncachedPrimaryKeys.remove(astraPdca_CompanyData.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AstraPdca_CompanyDataModelImpl.ENTITY_CACHE_ENABLED,
					AstraPdca_CompanyDataImpl.class, primaryKey, nullModel);
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
	 * Returns all the astra pdca_ company datas.
	 *
	 * @return the astra pdca_ company datas
	 */
	@Override
	public List<AstraPdca_CompanyData> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the astra pdca_ company datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AstraPdca_CompanyDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of astra pdca_ company datas
	 * @param end the upper bound of the range of astra pdca_ company datas (not inclusive)
	 * @return the range of astra pdca_ company datas
	 */
	@Override
	public List<AstraPdca_CompanyData> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the astra pdca_ company datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AstraPdca_CompanyDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of astra pdca_ company datas
	 * @param end the upper bound of the range of astra pdca_ company datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of astra pdca_ company datas
	 */
	@Override
	public List<AstraPdca_CompanyData> findAll(int start, int end,
		OrderByComparator<AstraPdca_CompanyData> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the astra pdca_ company datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AstraPdca_CompanyDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of astra pdca_ company datas
	 * @param end the upper bound of the range of astra pdca_ company datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of astra pdca_ company datas
	 */
	@Override
	public List<AstraPdca_CompanyData> findAll(int start, int end,
		OrderByComparator<AstraPdca_CompanyData> orderByComparator,
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

		List<AstraPdca_CompanyData> list = null;

		if (retrieveFromCache) {
			list = (List<AstraPdca_CompanyData>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ASTRAPDCA_COMPANYDATA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASTRAPDCA_COMPANYDATA;

				if (pagination) {
					sql = sql.concat(AstraPdca_CompanyDataModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AstraPdca_CompanyData>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AstraPdca_CompanyData>)QueryUtil.list(q,
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
	 * Removes all the astra pdca_ company datas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AstraPdca_CompanyData astraPdca_CompanyData : findAll()) {
			remove(astraPdca_CompanyData);
		}
	}

	/**
	 * Returns the number of astra pdca_ company datas.
	 *
	 * @return the number of astra pdca_ company datas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ASTRAPDCA_COMPANYDATA);

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
		return AstraPdca_CompanyDataModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the astra pdca_ company data persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AstraPdca_CompanyDataImpl.class.getName());
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
	private static final String _SQL_SELECT_ASTRAPDCA_COMPANYDATA = "SELECT astraPdca_CompanyData FROM AstraPdca_CompanyData astraPdca_CompanyData";
	private static final String _SQL_SELECT_ASTRAPDCA_COMPANYDATA_WHERE_PKS_IN = "SELECT astraPdca_CompanyData FROM AstraPdca_CompanyData astraPdca_CompanyData WHERE companyId IN (";
	private static final String _SQL_COUNT_ASTRAPDCA_COMPANYDATA = "SELECT COUNT(astraPdca_CompanyData) FROM AstraPdca_CompanyData astraPdca_CompanyData";
	private static final String _ORDER_BY_ENTITY_ALIAS = "astraPdca_CompanyData.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AstraPdca_CompanyData exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(AstraPdca_CompanyDataPersistenceImpl.class);
}