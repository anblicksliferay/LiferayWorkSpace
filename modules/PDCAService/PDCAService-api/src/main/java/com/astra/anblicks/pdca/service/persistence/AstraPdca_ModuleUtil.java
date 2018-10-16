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

import com.astra.anblicks.pdca.model.AstraPdca_Module;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the astra pdca_ module service. This utility wraps {@link com.astra.anblicks.pdca.service.persistence.impl.AstraPdca_ModulePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AstraPdca_ModulePersistence
 * @see com.astra.anblicks.pdca.service.persistence.impl.AstraPdca_ModulePersistenceImpl
 * @generated
 */
@ProviderType
public class AstraPdca_ModuleUtil {
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
	public static void clearCache(AstraPdca_Module astraPdca_Module) {
		getPersistence().clearCache(astraPdca_Module);
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
	public static List<AstraPdca_Module> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AstraPdca_Module> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AstraPdca_Module> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AstraPdca_Module> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AstraPdca_Module update(AstraPdca_Module astraPdca_Module) {
		return getPersistence().update(astraPdca_Module);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AstraPdca_Module update(AstraPdca_Module astraPdca_Module,
		ServiceContext serviceContext) {
		return getPersistence().update(astraPdca_Module, serviceContext);
	}

	/**
	* Caches the astra pdca_ module in the entity cache if it is enabled.
	*
	* @param astraPdca_Module the astra pdca_ module
	*/
	public static void cacheResult(AstraPdca_Module astraPdca_Module) {
		getPersistence().cacheResult(astraPdca_Module);
	}

	/**
	* Caches the astra pdca_ modules in the entity cache if it is enabled.
	*
	* @param astraPdca_Modules the astra pdca_ modules
	*/
	public static void cacheResult(List<AstraPdca_Module> astraPdca_Modules) {
		getPersistence().cacheResult(astraPdca_Modules);
	}

	/**
	* Creates a new astra pdca_ module with the primary key. Does not add the astra pdca_ module to the database.
	*
	* @param ModuleId the primary key for the new astra pdca_ module
	* @return the new astra pdca_ module
	*/
	public static AstraPdca_Module create(long ModuleId) {
		return getPersistence().create(ModuleId);
	}

	/**
	* Removes the astra pdca_ module with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ModuleId the primary key of the astra pdca_ module
	* @return the astra pdca_ module that was removed
	* @throws NoSuchAstraPdca_ModuleException if a astra pdca_ module with the primary key could not be found
	*/
	public static AstraPdca_Module remove(long ModuleId)
		throws com.astra.anblicks.pdca.exception.NoSuchAstraPdca_ModuleException {
		return getPersistence().remove(ModuleId);
	}

	public static AstraPdca_Module updateImpl(AstraPdca_Module astraPdca_Module) {
		return getPersistence().updateImpl(astraPdca_Module);
	}

	/**
	* Returns the astra pdca_ module with the primary key or throws a {@link NoSuchAstraPdca_ModuleException} if it could not be found.
	*
	* @param ModuleId the primary key of the astra pdca_ module
	* @return the astra pdca_ module
	* @throws NoSuchAstraPdca_ModuleException if a astra pdca_ module with the primary key could not be found
	*/
	public static AstraPdca_Module findByPrimaryKey(long ModuleId)
		throws com.astra.anblicks.pdca.exception.NoSuchAstraPdca_ModuleException {
		return getPersistence().findByPrimaryKey(ModuleId);
	}

	/**
	* Returns the astra pdca_ module with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ModuleId the primary key of the astra pdca_ module
	* @return the astra pdca_ module, or <code>null</code> if a astra pdca_ module with the primary key could not be found
	*/
	public static AstraPdca_Module fetchByPrimaryKey(long ModuleId) {
		return getPersistence().fetchByPrimaryKey(ModuleId);
	}

	public static java.util.Map<java.io.Serializable, AstraPdca_Module> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the astra pdca_ modules.
	*
	* @return the astra pdca_ modules
	*/
	public static List<AstraPdca_Module> findAll() {
		return getPersistence().findAll();
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
	public static List<AstraPdca_Module> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<AstraPdca_Module> findAll(int start, int end,
		OrderByComparator<AstraPdca_Module> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<AstraPdca_Module> findAll(int start, int end,
		OrderByComparator<AstraPdca_Module> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the astra pdca_ modules from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of astra pdca_ modules.
	*
	* @return the number of astra pdca_ modules
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AstraPdca_ModulePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AstraPdca_ModulePersistence, AstraPdca_ModulePersistence> _serviceTracker =
		ServiceTrackerFactory.open(AstraPdca_ModulePersistence.class);
}