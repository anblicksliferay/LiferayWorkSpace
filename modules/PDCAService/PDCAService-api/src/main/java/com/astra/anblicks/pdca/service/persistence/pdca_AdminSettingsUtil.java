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

import com.astra.anblicks.pdca.model.pdca_AdminSettings;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the pdca_ admin settings service. This utility wraps {@link com.astra.anblicks.pdca.service.persistence.impl.pdca_AdminSettingsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see pdca_AdminSettingsPersistence
 * @see com.astra.anblicks.pdca.service.persistence.impl.pdca_AdminSettingsPersistenceImpl
 * @generated
 */
@ProviderType
public class pdca_AdminSettingsUtil {
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
	public static void clearCache(pdca_AdminSettings pdca_AdminSettings) {
		getPersistence().clearCache(pdca_AdminSettings);
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
	public static List<pdca_AdminSettings> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<pdca_AdminSettings> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<pdca_AdminSettings> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<pdca_AdminSettings> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static pdca_AdminSettings update(
		pdca_AdminSettings pdca_AdminSettings) {
		return getPersistence().update(pdca_AdminSettings);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static pdca_AdminSettings update(
		pdca_AdminSettings pdca_AdminSettings, ServiceContext serviceContext) {
		return getPersistence().update(pdca_AdminSettings, serviceContext);
	}

	/**
	* Caches the pdca_ admin settings in the entity cache if it is enabled.
	*
	* @param pdca_AdminSettings the pdca_ admin settings
	*/
	public static void cacheResult(pdca_AdminSettings pdca_AdminSettings) {
		getPersistence().cacheResult(pdca_AdminSettings);
	}

	/**
	* Caches the pdca_ admin settingses in the entity cache if it is enabled.
	*
	* @param pdca_AdminSettingses the pdca_ admin settingses
	*/
	public static void cacheResult(
		List<pdca_AdminSettings> pdca_AdminSettingses) {
		getPersistence().cacheResult(pdca_AdminSettingses);
	}

	/**
	* Creates a new pdca_ admin settings with the primary key. Does not add the pdca_ admin settings to the database.
	*
	* @param settings_Id the primary key for the new pdca_ admin settings
	* @return the new pdca_ admin settings
	*/
	public static pdca_AdminSettings create(long settings_Id) {
		return getPersistence().create(settings_Id);
	}

	/**
	* Removes the pdca_ admin settings with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param settings_Id the primary key of the pdca_ admin settings
	* @return the pdca_ admin settings that was removed
	* @throws NoSuch_AdminSettingsException if a pdca_ admin settings with the primary key could not be found
	*/
	public static pdca_AdminSettings remove(long settings_Id)
		throws com.astra.anblicks.pdca.exception.NoSuch_AdminSettingsException {
		return getPersistence().remove(settings_Id);
	}

	public static pdca_AdminSettings updateImpl(
		pdca_AdminSettings pdca_AdminSettings) {
		return getPersistence().updateImpl(pdca_AdminSettings);
	}

	/**
	* Returns the pdca_ admin settings with the primary key or throws a {@link NoSuch_AdminSettingsException} if it could not be found.
	*
	* @param settings_Id the primary key of the pdca_ admin settings
	* @return the pdca_ admin settings
	* @throws NoSuch_AdminSettingsException if a pdca_ admin settings with the primary key could not be found
	*/
	public static pdca_AdminSettings findByPrimaryKey(long settings_Id)
		throws com.astra.anblicks.pdca.exception.NoSuch_AdminSettingsException {
		return getPersistence().findByPrimaryKey(settings_Id);
	}

	/**
	* Returns the pdca_ admin settings with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param settings_Id the primary key of the pdca_ admin settings
	* @return the pdca_ admin settings, or <code>null</code> if a pdca_ admin settings with the primary key could not be found
	*/
	public static pdca_AdminSettings fetchByPrimaryKey(long settings_Id) {
		return getPersistence().fetchByPrimaryKey(settings_Id);
	}

	public static java.util.Map<java.io.Serializable, pdca_AdminSettings> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the pdca_ admin settingses.
	*
	* @return the pdca_ admin settingses
	*/
	public static List<pdca_AdminSettings> findAll() {
		return getPersistence().findAll();
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
	public static List<pdca_AdminSettings> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<pdca_AdminSettings> findAll(int start, int end,
		OrderByComparator<pdca_AdminSettings> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<pdca_AdminSettings> findAll(int start, int end,
		OrderByComparator<pdca_AdminSettings> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the pdca_ admin settingses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of pdca_ admin settingses.
	*
	* @return the number of pdca_ admin settingses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static pdca_AdminSettingsPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<pdca_AdminSettingsPersistence, pdca_AdminSettingsPersistence> _serviceTracker =
		ServiceTrackerFactory.open(pdca_AdminSettingsPersistence.class);
}