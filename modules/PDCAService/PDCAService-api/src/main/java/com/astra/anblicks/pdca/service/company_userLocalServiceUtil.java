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
 * Provides the local service utility for company_user. This utility wraps
 * {@link com.astra.anblicks.pdca.service.impl.company_userLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see company_userLocalService
 * @see com.astra.anblicks.pdca.service.base.company_userLocalServiceBaseImpl
 * @see com.astra.anblicks.pdca.service.impl.company_userLocalServiceImpl
 * @generated
 */
@ProviderType
public class company_userLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.astra.anblicks.pdca.service.impl.company_userLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the company_user to the database. Also notifies the appropriate model listeners.
	*
	* @param company_user the company_user
	* @return the company_user that was added
	*/
	public static com.astra.anblicks.pdca.model.company_user addcompany_user(
		com.astra.anblicks.pdca.model.company_user company_user) {
		return getService().addcompany_user(company_user);
	}

	/**
	* Creates a new company_user with the primary key. Does not add the company_user to the database.
	*
	* @param company_user_Id the primary key for the new company_user
	* @return the new company_user
	*/
	public static com.astra.anblicks.pdca.model.company_user createcompany_user(
		long company_user_Id) {
		return getService().createcompany_user(company_user_Id);
	}

	/**
	* Deletes the company_user from the database. Also notifies the appropriate model listeners.
	*
	* @param company_user the company_user
	* @return the company_user that was removed
	*/
	public static com.astra.anblicks.pdca.model.company_user deletecompany_user(
		com.astra.anblicks.pdca.model.company_user company_user) {
		return getService().deletecompany_user(company_user);
	}

	/**
	* Deletes the company_user with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param company_user_Id the primary key of the company_user
	* @return the company_user that was removed
	* @throws PortalException if a company_user with the primary key could not be found
	*/
	public static com.astra.anblicks.pdca.model.company_user deletecompany_user(
		long company_user_Id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletecompany_user(company_user_Id);
	}

	public static com.astra.anblicks.pdca.model.company_user fetchcompany_user(
		long company_user_Id) {
		return getService().fetchcompany_user(company_user_Id);
	}

	/**
	* Returns the company_user with the primary key.
	*
	* @param company_user_Id the primary key of the company_user
	* @return the company_user
	* @throws PortalException if a company_user with the primary key could not be found
	*/
	public static com.astra.anblicks.pdca.model.company_user getcompany_user(
		long company_user_Id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getcompany_user(company_user_Id);
	}

	/**
	* Updates the company_user in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param company_user the company_user
	* @return the company_user that was updated
	*/
	public static com.astra.anblicks.pdca.model.company_user updatecompany_user(
		com.astra.anblicks.pdca.model.company_user company_user) {
		return getService().updatecompany_user(company_user);
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
	* Returns the number of company_users.
	*
	* @return the number of company_users
	*/
	public static int getcompany_usersCount() {
		return getService().getcompany_usersCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.astra.anblicks.pdca.model.impl.company_userModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.astra.anblicks.pdca.model.impl.company_userModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.astra.anblicks.pdca.model.company_user> getUserListByCompanyId(
		long companyId)
		throws com.astra.anblicks.pdca.exception.NoSuchcompany_userException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserListByCompanyId(companyId);
	}

	/**
	* Returns a range of all the company_users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.astra.anblicks.pdca.model.impl.company_userModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of company_users
	* @param end the upper bound of the range of company_users (not inclusive)
	* @return the range of company_users
	*/
	public static java.util.List<com.astra.anblicks.pdca.model.company_user> getcompany_users(
		int start, int end) {
		return getService().getcompany_users(start, end);
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

	public static company_userLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<company_userLocalService, company_userLocalService> _serviceTracker =
		ServiceTrackerFactory.open(company_userLocalService.class);
}