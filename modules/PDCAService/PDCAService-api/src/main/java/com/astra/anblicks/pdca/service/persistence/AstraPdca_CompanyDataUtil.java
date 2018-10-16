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

package com.astra.anblicks.pdca.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.astra.anblicks.pdca.model.AstraPdca_CompanyData;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the astra pdca_ company data service. This utility wraps {@link com.astra.anblicks.pdca.service.persistence.impl.AstraPdca_CompanyDataPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AstraPdca_CompanyDataPersistence
 * @see com.astra.anblicks.pdca.service.persistence.impl.AstraPdca_CompanyDataPersistenceImpl
 * @generated
 */
@ProviderType
public class AstraPdca_CompanyDataUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(AstraPdca_CompanyData astraPdca_CompanyData) {
		getPersistence().clearCache(astraPdca_CompanyData);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AstraPdca_CompanyData> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AstraPdca_CompanyData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AstraPdca_CompanyData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AstraPdca_CompanyData> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AstraPdca_CompanyData update(
		AstraPdca_CompanyData astraPdca_CompanyData) {
		return getPersistence().update(astraPdca_CompanyData);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AstraPdca_CompanyData update(
		AstraPdca_CompanyData astraPdca_CompanyData,
		ServiceContext serviceContext) {
		return getPersistence().update(astraPdca_CompanyData, serviceContext);
	}

	/**
	* Caches the astra pdca_ company data in the entity cache if it is enabled.
	*
	* @param astraPdca_CompanyData the astra pdca_ company data
	*/
	public static void cacheResult(AstraPdca_CompanyData astraPdca_CompanyData) {
		getPersistence().cacheResult(astraPdca_CompanyData);
	}

	/**
	* Caches the astra pdca_ company datas in the entity cache if it is enabled.
	*
	* @param astraPdca_CompanyDatas the astra pdca_ company datas
	*/
	public static void cacheResult(
		List<AstraPdca_CompanyData> astraPdca_CompanyDatas) {
		getPersistence().cacheResult(astraPdca_CompanyDatas);
	}

	/**
	* Creates a new astra pdca_ company data with the primary key. Does not add the astra pdca_ company data to the database.
	*
	* @param companyId the primary key for the new astra pdca_ company data
	* @return the new astra pdca_ company data
	*/
	public static AstraPdca_CompanyData create(long companyId) {
		return getPersistence().create(companyId);
	}

	/**
	* Removes the astra pdca_ company data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param companyId the primary key of the astra pdca_ company data
	* @return the astra pdca_ company data that was removed
	* @throws NoSuchAstraPdca_CompanyDataException if a astra pdca_ company data with the primary key could not be found
	*/
	public static AstraPdca_CompanyData remove(long companyId)
		throws com.astra.anblicks.pdca.exception.NoSuchAstraPdca_CompanyDataException {
		return getPersistence().remove(companyId);
	}

	public static AstraPdca_CompanyData updateImpl(
		AstraPdca_CompanyData astraPdca_CompanyData) {
		return getPersistence().updateImpl(astraPdca_CompanyData);
	}

	/**
	* Returns the astra pdca_ company data with the primary key or throws a {@link NoSuchAstraPdca_CompanyDataException} if it could not be found.
	*
	* @param companyId the primary key of the astra pdca_ company data
	* @return the astra pdca_ company data
	* @throws NoSuchAstraPdca_CompanyDataException if a astra pdca_ company data with the primary key could not be found
	*/
	public static AstraPdca_CompanyData findByPrimaryKey(long companyId)
		throws com.astra.anblicks.pdca.exception.NoSuchAstraPdca_CompanyDataException {
		return getPersistence().findByPrimaryKey(companyId);
	}

	/**
	* Returns the astra pdca_ company data with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param companyId the primary key of the astra pdca_ company data
	* @return the astra pdca_ company data, or <code>null</code> if a astra pdca_ company data with the primary key could not be found
	*/
	public static AstraPdca_CompanyData fetchByPrimaryKey(long companyId) {
		return getPersistence().fetchByPrimaryKey(companyId);
	}

	public static java.util.Map<java.io.Serializable, AstraPdca_CompanyData> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the astra pdca_ company datas.
	*
	* @return the astra pdca_ company datas
	*/
	public static List<AstraPdca_CompanyData> findAll() {
		return getPersistence().findAll();
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
	public static List<AstraPdca_CompanyData> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<AstraPdca_CompanyData> findAll(int start, int end,
		OrderByComparator<AstraPdca_CompanyData> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<AstraPdca_CompanyData> findAll(int start, int end,
		OrderByComparator<AstraPdca_CompanyData> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the astra pdca_ company datas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of astra pdca_ company datas.
	*
	* @return the number of astra pdca_ company datas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AstraPdca_CompanyDataPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AstraPdca_CompanyDataPersistence, AstraPdca_CompanyDataPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AstraPdca_CompanyDataPersistence.class);
}