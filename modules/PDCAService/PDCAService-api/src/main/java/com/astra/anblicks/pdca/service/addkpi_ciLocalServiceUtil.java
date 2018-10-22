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
 * Provides the local service utility for addkpi_ci. This utility wraps
 * {@link com.astra.anblicks.pdca.service.impl.addkpi_ciLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see addkpi_ciLocalService
 * @see com.astra.anblicks.pdca.service.base.addkpi_ciLocalServiceBaseImpl
 * @see com.astra.anblicks.pdca.service.impl.addkpi_ciLocalServiceImpl
 * @generated
 */
@ProviderType
public class addkpi_ciLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.astra.anblicks.pdca.service.impl.addkpi_ciLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the addkpi_ci to the database. Also notifies the appropriate model listeners.
	*
	* @param addkpi_ci the addkpi_ci
	* @return the addkpi_ci that was added
	*/
	public static com.astra.anblicks.pdca.model.addkpi_ci addaddkpi_ci(
		com.astra.anblicks.pdca.model.addkpi_ci addkpi_ci) {
		return getService().addaddkpi_ci(addkpi_ci);
	}

	/**
	* Creates a new addkpi_ci with the primary key. Does not add the addkpi_ci to the database.
	*
	* @param addKpiId the primary key for the new addkpi_ci
	* @return the new addkpi_ci
	*/
	public static com.astra.anblicks.pdca.model.addkpi_ci createaddkpi_ci(
		long addKpiId) {
		return getService().createaddkpi_ci(addKpiId);
	}

	/**
	* Deletes the addkpi_ci from the database. Also notifies the appropriate model listeners.
	*
	* @param addkpi_ci the addkpi_ci
	* @return the addkpi_ci that was removed
	*/
	public static com.astra.anblicks.pdca.model.addkpi_ci deleteaddkpi_ci(
		com.astra.anblicks.pdca.model.addkpi_ci addkpi_ci) {
		return getService().deleteaddkpi_ci(addkpi_ci);
	}

	/**
	* Deletes the addkpi_ci with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param addKpiId the primary key of the addkpi_ci
	* @return the addkpi_ci that was removed
	* @throws PortalException if a addkpi_ci with the primary key could not be found
	*/
	public static com.astra.anblicks.pdca.model.addkpi_ci deleteaddkpi_ci(
		long addKpiId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteaddkpi_ci(addKpiId);
	}

	public static com.astra.anblicks.pdca.model.addkpi_ci fetchaddkpi_ci(
		long addKpiId) {
		return getService().fetchaddkpi_ci(addKpiId);
	}

	/**
	* Returns the addkpi_ci with the matching UUID and company.
	*
	* @param uuid the addkpi_ci's UUID
	* @param companyId the primary key of the company
	* @return the matching addkpi_ci, or <code>null</code> if a matching addkpi_ci could not be found
	*/
	public static com.astra.anblicks.pdca.model.addkpi_ci fetchaddkpi_ciByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().fetchaddkpi_ciByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the addkpi_ci with the primary key.
	*
	* @param addKpiId the primary key of the addkpi_ci
	* @return the addkpi_ci
	* @throws PortalException if a addkpi_ci with the primary key could not be found
	*/
	public static com.astra.anblicks.pdca.model.addkpi_ci getaddkpi_ci(
		long addKpiId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getaddkpi_ci(addKpiId);
	}

	/**
	* Returns the addkpi_ci with the matching UUID and company.
	*
	* @param uuid the addkpi_ci's UUID
	* @param companyId the primary key of the company
	* @return the matching addkpi_ci
	* @throws PortalException if a matching addkpi_ci could not be found
	*/
	public static com.astra.anblicks.pdca.model.addkpi_ci getaddkpi_ciByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getaddkpi_ciByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Updates the addkpi_ci in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param addkpi_ci the addkpi_ci
	* @return the addkpi_ci that was updated
	*/
	public static com.astra.anblicks.pdca.model.addkpi_ci updateaddkpi_ci(
		com.astra.anblicks.pdca.model.addkpi_ci addkpi_ci) {
		return getService().updateaddkpi_ci(addkpi_ci);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
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
	* Returns the number of addkpi_cis.
	*
	* @return the number of addkpi_cis
	*/
	public static int getaddkpi_cisCount() {
		return getService().getaddkpi_cisCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.astra.anblicks.pdca.model.impl.addkpi_ciModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.astra.anblicks.pdca.model.impl.addkpi_ciModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the addkpi_cis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.astra.anblicks.pdca.model.impl.addkpi_ciModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of addkpi_cis
	* @param end the upper bound of the range of addkpi_cis (not inclusive)
	* @return the range of addkpi_cis
	*/
	public static java.util.List<com.astra.anblicks.pdca.model.addkpi_ci> getaddkpi_cis(
		int start, int end) {
		return getService().getaddkpi_cis(start, end);
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

	public static addkpi_ciLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<addkpi_ciLocalService, addkpi_ciLocalService> _serviceTracker =
		ServiceTrackerFactory.open(addkpi_ciLocalService.class);
}