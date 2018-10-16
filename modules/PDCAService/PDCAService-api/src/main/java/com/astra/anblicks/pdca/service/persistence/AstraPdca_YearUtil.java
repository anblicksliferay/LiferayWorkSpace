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

import com.astra.anblicks.pdca.model.AstraPdca_Year;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the astra pdca_ year service. This utility wraps {@link com.astra.anblicks.pdca.service.persistence.impl.AstraPdca_YearPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AstraPdca_YearPersistence
 * @see com.astra.anblicks.pdca.service.persistence.impl.AstraPdca_YearPersistenceImpl
 * @generated
 */
@ProviderType
public class AstraPdca_YearUtil {
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
	public static void clearCache(AstraPdca_Year astraPdca_Year) {
		getPersistence().clearCache(astraPdca_Year);
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
	public static List<AstraPdca_Year> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AstraPdca_Year> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AstraPdca_Year> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AstraPdca_Year> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AstraPdca_Year update(AstraPdca_Year astraPdca_Year) {
		return getPersistence().update(astraPdca_Year);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AstraPdca_Year update(AstraPdca_Year astraPdca_Year,
		ServiceContext serviceContext) {
		return getPersistence().update(astraPdca_Year, serviceContext);
	}

	/**
	* Caches the astra pdca_ year in the entity cache if it is enabled.
	*
	* @param astraPdca_Year the astra pdca_ year
	*/
	public static void cacheResult(AstraPdca_Year astraPdca_Year) {
		getPersistence().cacheResult(astraPdca_Year);
	}

	/**
	* Caches the astra pdca_ years in the entity cache if it is enabled.
	*
	* @param astraPdca_Years the astra pdca_ years
	*/
	public static void cacheResult(List<AstraPdca_Year> astraPdca_Years) {
		getPersistence().cacheResult(astraPdca_Years);
	}

	/**
	* Creates a new astra pdca_ year with the primary key. Does not add the astra pdca_ year to the database.
	*
	* @param YearId the primary key for the new astra pdca_ year
	* @return the new astra pdca_ year
	*/
	public static AstraPdca_Year create(long YearId) {
		return getPersistence().create(YearId);
	}

	/**
	* Removes the astra pdca_ year with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param YearId the primary key of the astra pdca_ year
	* @return the astra pdca_ year that was removed
	* @throws NoSuchAstraPdca_YearException if a astra pdca_ year with the primary key could not be found
	*/
	public static AstraPdca_Year remove(long YearId)
		throws com.astra.anblicks.pdca.exception.NoSuchAstraPdca_YearException {
		return getPersistence().remove(YearId);
	}

	public static AstraPdca_Year updateImpl(AstraPdca_Year astraPdca_Year) {
		return getPersistence().updateImpl(astraPdca_Year);
	}

	/**
	* Returns the astra pdca_ year with the primary key or throws a {@link NoSuchAstraPdca_YearException} if it could not be found.
	*
	* @param YearId the primary key of the astra pdca_ year
	* @return the astra pdca_ year
	* @throws NoSuchAstraPdca_YearException if a astra pdca_ year with the primary key could not be found
	*/
	public static AstraPdca_Year findByPrimaryKey(long YearId)
		throws com.astra.anblicks.pdca.exception.NoSuchAstraPdca_YearException {
		return getPersistence().findByPrimaryKey(YearId);
	}

	/**
	* Returns the astra pdca_ year with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param YearId the primary key of the astra pdca_ year
	* @return the astra pdca_ year, or <code>null</code> if a astra pdca_ year with the primary key could not be found
	*/
	public static AstraPdca_Year fetchByPrimaryKey(long YearId) {
		return getPersistence().fetchByPrimaryKey(YearId);
	}

	public static java.util.Map<java.io.Serializable, AstraPdca_Year> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the astra pdca_ years.
	*
	* @return the astra pdca_ years
	*/
	public static List<AstraPdca_Year> findAll() {
		return getPersistence().findAll();
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
	public static List<AstraPdca_Year> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<AstraPdca_Year> findAll(int start, int end,
		OrderByComparator<AstraPdca_Year> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<AstraPdca_Year> findAll(int start, int end,
		OrderByComparator<AstraPdca_Year> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the astra pdca_ years from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of astra pdca_ years.
	*
	* @return the number of astra pdca_ years
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AstraPdca_YearPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AstraPdca_YearPersistence, AstraPdca_YearPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AstraPdca_YearPersistence.class);
}