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

package com.astra.anblicks.pdca.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for pdca_AdminSettings. This utility wraps
 * {@link com.astra.anblicks.pdca.service.impl.pdca_AdminSettingsLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see pdca_AdminSettingsLocalService
 * @see com.astra.anblicks.pdca.service.base.pdca_AdminSettingsLocalServiceBaseImpl
 * @see com.astra.anblicks.pdca.service.impl.pdca_AdminSettingsLocalServiceImpl
 * @generated
 */
@ProviderType
public class pdca_AdminSettingsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.astra.anblicks.pdca.service.impl.pdca_AdminSettingsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the pdca_ admin settings to the database. Also notifies the appropriate model listeners.
	*
	* @param pdca_AdminSettings the pdca_ admin settings
	* @return the pdca_ admin settings that was added
	*/
	public static com.astra.anblicks.pdca.model.pdca_AdminSettings addpdca_AdminSettings(
		com.astra.anblicks.pdca.model.pdca_AdminSettings pdca_AdminSettings) {
		return getService().addpdca_AdminSettings(pdca_AdminSettings);
	}

	/**
	* Creates a new pdca_ admin settings with the primary key. Does not add the pdca_ admin settings to the database.
	*
	* @param settings_Id the primary key for the new pdca_ admin settings
	* @return the new pdca_ admin settings
	*/
	public static com.astra.anblicks.pdca.model.pdca_AdminSettings createpdca_AdminSettings(
		long settings_Id) {
		return getService().createpdca_AdminSettings(settings_Id);
	}

	/**
	* Deletes the pdca_ admin settings from the database. Also notifies the appropriate model listeners.
	*
	* @param pdca_AdminSettings the pdca_ admin settings
	* @return the pdca_ admin settings that was removed
	*/
	public static com.astra.anblicks.pdca.model.pdca_AdminSettings deletepdca_AdminSettings(
		com.astra.anblicks.pdca.model.pdca_AdminSettings pdca_AdminSettings) {
		return getService().deletepdca_AdminSettings(pdca_AdminSettings);
	}

	/**
	* Deletes the pdca_ admin settings with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param settings_Id the primary key of the pdca_ admin settings
	* @return the pdca_ admin settings that was removed
	* @throws PortalException if a pdca_ admin settings with the primary key could not be found
	*/
	public static com.astra.anblicks.pdca.model.pdca_AdminSettings deletepdca_AdminSettings(
		long settings_Id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletepdca_AdminSettings(settings_Id);
	}

	public static com.astra.anblicks.pdca.model.pdca_AdminSettings fetchpdca_AdminSettings(
		long settings_Id) {
		return getService().fetchpdca_AdminSettings(settings_Id);
	}

	/**
	* Returns the pdca_ admin settings with the primary key.
	*
	* @param settings_Id the primary key of the pdca_ admin settings
	* @return the pdca_ admin settings
	* @throws PortalException if a pdca_ admin settings with the primary key could not be found
	*/
	public static com.astra.anblicks.pdca.model.pdca_AdminSettings getpdca_AdminSettings(
		long settings_Id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getpdca_AdminSettings(settings_Id);
	}

	/**
	* Updates the pdca_ admin settings in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param pdca_AdminSettings the pdca_ admin settings
	* @return the pdca_ admin settings that was updated
	*/
	public static com.astra.anblicks.pdca.model.pdca_AdminSettings updatepdca_AdminSettings(
		com.astra.anblicks.pdca.model.pdca_AdminSettings pdca_AdminSettings) {
		return getService().updatepdca_AdminSettings(pdca_AdminSettings);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of pdca_ admin settingses.
	*
	* @return the number of pdca_ admin settingses
	*/
	public static int getpdca_AdminSettingsesCount() {
		return getService().getpdca_AdminSettingsesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.astra.anblicks.pdca.model.impl.pdca_AdminSettingsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.astra.anblicks.pdca.model.impl.pdca_AdminSettingsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the pdca_ admin settingses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.astra.anblicks.pdca.model.impl.pdca_AdminSettingsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pdca_ admin settingses
	* @param end the upper bound of the range of pdca_ admin settingses (not inclusive)
	* @return the range of pdca_ admin settingses
	*/
	public static java.util.List<com.astra.anblicks.pdca.model.pdca_AdminSettings> getpdca_AdminSettingses(
		int start, int end) {
		return getService().getpdca_AdminSettingses(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static pdca_AdminSettingsLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<pdca_AdminSettingsLocalService, pdca_AdminSettingsLocalService> _serviceTracker =
		ServiceTrackerFactory.open(pdca_AdminSettingsLocalService.class);
}