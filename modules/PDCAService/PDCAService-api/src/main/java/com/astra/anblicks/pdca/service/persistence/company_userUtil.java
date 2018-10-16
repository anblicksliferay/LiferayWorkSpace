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

import com.astra.anblicks.pdca.model.company_user;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the company_user service. This utility wraps {@link com.astra.anblicks.pdca.service.persistence.impl.company_userPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see company_userPersistence
 * @see com.astra.anblicks.pdca.service.persistence.impl.company_userPersistenceImpl
 * @generated
 */
@ProviderType
public class company_userUtil {
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
	public static void clearCache(company_user company_user) {
		getPersistence().clearCache(company_user);
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
	public static List<company_user> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<company_user> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<company_user> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<company_user> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static company_user update(company_user company_user) {
		return getPersistence().update(company_user);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static company_user update(company_user company_user,
		ServiceContext serviceContext) {
		return getPersistence().update(company_user, serviceContext);
	}

	/**
	* Returns the company_user where companyId = &#63; or throws a {@link NoSuchcompany_userException} if it could not be found.
	*
	* @param companyId the company ID
	* @return the matching company_user
	* @throws NoSuchcompany_userException if a matching company_user could not be found
	*/
	public static company_user findBygetByUserList(long companyId)
		throws com.astra.anblicks.pdca.exception.NoSuchcompany_userException {
		return getPersistence().findBygetByUserList(companyId);
	}

	/**
	* Returns the company_user where companyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company ID
	* @return the matching company_user, or <code>null</code> if a matching company_user could not be found
	*/
	public static company_user fetchBygetByUserList(long companyId) {
		return getPersistence().fetchBygetByUserList(companyId);
	}

	/**
	* Returns the company_user where companyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching company_user, or <code>null</code> if a matching company_user could not be found
	*/
	public static company_user fetchBygetByUserList(long companyId,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchBygetByUserList(companyId, retrieveFromCache);
	}

	/**
	* Removes the company_user where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @return the company_user that was removed
	*/
	public static company_user removeBygetByUserList(long companyId)
		throws com.astra.anblicks.pdca.exception.NoSuchcompany_userException {
		return getPersistence().removeBygetByUserList(companyId);
	}

	/**
	* Returns the number of company_users where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching company_users
	*/
	public static int countBygetByUserList(long companyId) {
		return getPersistence().countBygetByUserList(companyId);
	}

	/**
	* Returns the company_user where companyId = &#63; or throws a {@link NoSuchcompany_userException} if it could not be found.
	*
	* @param companyId the company ID
	* @return the matching company_user
	* @throws NoSuchcompany_userException if a matching company_user could not be found
	*/
	public static company_user findBygetByCompanyList(long companyId)
		throws com.astra.anblicks.pdca.exception.NoSuchcompany_userException {
		return getPersistence().findBygetByCompanyList(companyId);
	}

	/**
	* Returns the company_user where companyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company ID
	* @return the matching company_user, or <code>null</code> if a matching company_user could not be found
	*/
	public static company_user fetchBygetByCompanyList(long companyId) {
		return getPersistence().fetchBygetByCompanyList(companyId);
	}

	/**
	* Returns the company_user where companyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching company_user, or <code>null</code> if a matching company_user could not be found
	*/
	public static company_user fetchBygetByCompanyList(long companyId,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchBygetByCompanyList(companyId, retrieveFromCache);
	}

	/**
	* Removes the company_user where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @return the company_user that was removed
	*/
	public static company_user removeBygetByCompanyList(long companyId)
		throws com.astra.anblicks.pdca.exception.NoSuchcompany_userException {
		return getPersistence().removeBygetByCompanyList(companyId);
	}

	/**
	* Returns the number of company_users where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching company_users
	*/
	public static int countBygetByCompanyList(long companyId) {
		return getPersistence().countBygetByCompanyList(companyId);
	}

	/**
	* Caches the company_user in the entity cache if it is enabled.
	*
	* @param company_user the company_user
	*/
	public static void cacheResult(company_user company_user) {
		getPersistence().cacheResult(company_user);
	}

	/**
	* Caches the company_users in the entity cache if it is enabled.
	*
	* @param company_users the company_users
	*/
	public static void cacheResult(List<company_user> company_users) {
		getPersistence().cacheResult(company_users);
	}

	/**
	* Creates a new company_user with the primary key. Does not add the company_user to the database.
	*
	* @param company_user_Id the primary key for the new company_user
	* @return the new company_user
	*/
	public static company_user create(long company_user_Id) {
		return getPersistence().create(company_user_Id);
	}

	/**
	* Removes the company_user with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param company_user_Id the primary key of the company_user
	* @return the company_user that was removed
	* @throws NoSuchcompany_userException if a company_user with the primary key could not be found
	*/
	public static company_user remove(long company_user_Id)
		throws com.astra.anblicks.pdca.exception.NoSuchcompany_userException {
		return getPersistence().remove(company_user_Id);
	}

	public static company_user updateImpl(company_user company_user) {
		return getPersistence().updateImpl(company_user);
	}

	/**
	* Returns the company_user with the primary key or throws a {@link NoSuchcompany_userException} if it could not be found.
	*
	* @param company_user_Id the primary key of the company_user
	* @return the company_user
	* @throws NoSuchcompany_userException if a company_user with the primary key could not be found
	*/
	public static company_user findByPrimaryKey(long company_user_Id)
		throws com.astra.anblicks.pdca.exception.NoSuchcompany_userException {
		return getPersistence().findByPrimaryKey(company_user_Id);
	}

	/**
	* Returns the company_user with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param company_user_Id the primary key of the company_user
	* @return the company_user, or <code>null</code> if a company_user with the primary key could not be found
	*/
	public static company_user fetchByPrimaryKey(long company_user_Id) {
		return getPersistence().fetchByPrimaryKey(company_user_Id);
	}

	public static java.util.Map<java.io.Serializable, company_user> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the company_users.
	*
	* @return the company_users
	*/
	public static List<company_user> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the company_users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link company_userModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of company_users
	* @param end the upper bound of the range of company_users (not inclusive)
	* @return the range of company_users
	*/
	public static List<company_user> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the company_users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link company_userModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of company_users
	* @param end the upper bound of the range of company_users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of company_users
	*/
	public static List<company_user> findAll(int start, int end,
		OrderByComparator<company_user> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the company_users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link company_userModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of company_users
	* @param end the upper bound of the range of company_users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of company_users
	*/
	public static List<company_user> findAll(int start, int end,
		OrderByComparator<company_user> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the company_users from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of company_users.
	*
	* @return the number of company_users
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static company_userPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<company_userPersistence, company_userPersistence> _serviceTracker =
		ServiceTrackerFactory.open(company_userPersistence.class);
}