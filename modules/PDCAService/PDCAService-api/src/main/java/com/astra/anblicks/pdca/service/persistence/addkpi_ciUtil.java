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

import com.astra.anblicks.pdca.model.addkpi_ci;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the addkpi_ci service. This utility wraps {@link com.astra.anblicks.pdca.service.persistence.impl.addkpi_ciPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see addkpi_ciPersistence
 * @see com.astra.anblicks.pdca.service.persistence.impl.addkpi_ciPersistenceImpl
 * @generated
 */
@ProviderType
public class addkpi_ciUtil {
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
	public static void clearCache(addkpi_ci addkpi_ci) {
		getPersistence().clearCache(addkpi_ci);
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
	public static List<addkpi_ci> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<addkpi_ci> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<addkpi_ci> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<addkpi_ci> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static addkpi_ci update(addkpi_ci addkpi_ci) {
		return getPersistence().update(addkpi_ci);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static addkpi_ci update(addkpi_ci addkpi_ci,
		ServiceContext serviceContext) {
		return getPersistence().update(addkpi_ci, serviceContext);
	}

	/**
	* Returns all the addkpi_cis where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching addkpi_cis
	*/
	public static List<addkpi_ci> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the addkpi_cis where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link addkpi_ciModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of addkpi_cis
	* @param end the upper bound of the range of addkpi_cis (not inclusive)
	* @return the range of matching addkpi_cis
	*/
	public static List<addkpi_ci> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the addkpi_cis where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link addkpi_ciModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of addkpi_cis
	* @param end the upper bound of the range of addkpi_cis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching addkpi_cis
	*/
	public static List<addkpi_ci> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<addkpi_ci> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the addkpi_cis where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link addkpi_ciModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of addkpi_cis
	* @param end the upper bound of the range of addkpi_cis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching addkpi_cis
	*/
	public static List<addkpi_ci> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<addkpi_ci> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first addkpi_ci in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching addkpi_ci
	* @throws NoSuchaddkpi_ciException if a matching addkpi_ci could not be found
	*/
	public static addkpi_ci findByUuid_First(java.lang.String uuid,
		OrderByComparator<addkpi_ci> orderByComparator)
		throws com.astra.anblicks.pdca.exception.NoSuchaddkpi_ciException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first addkpi_ci in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching addkpi_ci, or <code>null</code> if a matching addkpi_ci could not be found
	*/
	public static addkpi_ci fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<addkpi_ci> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last addkpi_ci in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching addkpi_ci
	* @throws NoSuchaddkpi_ciException if a matching addkpi_ci could not be found
	*/
	public static addkpi_ci findByUuid_Last(java.lang.String uuid,
		OrderByComparator<addkpi_ci> orderByComparator)
		throws com.astra.anblicks.pdca.exception.NoSuchaddkpi_ciException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last addkpi_ci in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching addkpi_ci, or <code>null</code> if a matching addkpi_ci could not be found
	*/
	public static addkpi_ci fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<addkpi_ci> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the addkpi_cis before and after the current addkpi_ci in the ordered set where uuid = &#63;.
	*
	* @param addKpiId the primary key of the current addkpi_ci
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next addkpi_ci
	* @throws NoSuchaddkpi_ciException if a addkpi_ci with the primary key could not be found
	*/
	public static addkpi_ci[] findByUuid_PrevAndNext(long addKpiId,
		java.lang.String uuid, OrderByComparator<addkpi_ci> orderByComparator)
		throws com.astra.anblicks.pdca.exception.NoSuchaddkpi_ciException {
		return getPersistence()
				   .findByUuid_PrevAndNext(addKpiId, uuid, orderByComparator);
	}

	/**
	* Removes all the addkpi_cis where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of addkpi_cis where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching addkpi_cis
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns all the addkpi_cis where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching addkpi_cis
	*/
	public static List<addkpi_ci> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the addkpi_cis where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link addkpi_ciModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of addkpi_cis
	* @param end the upper bound of the range of addkpi_cis (not inclusive)
	* @return the range of matching addkpi_cis
	*/
	public static List<addkpi_ci> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the addkpi_cis where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link addkpi_ciModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of addkpi_cis
	* @param end the upper bound of the range of addkpi_cis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching addkpi_cis
	*/
	public static List<addkpi_ci> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<addkpi_ci> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the addkpi_cis where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link addkpi_ciModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of addkpi_cis
	* @param end the upper bound of the range of addkpi_cis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching addkpi_cis
	*/
	public static List<addkpi_ci> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<addkpi_ci> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first addkpi_ci in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching addkpi_ci
	* @throws NoSuchaddkpi_ciException if a matching addkpi_ci could not be found
	*/
	public static addkpi_ci findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<addkpi_ci> orderByComparator)
		throws com.astra.anblicks.pdca.exception.NoSuchaddkpi_ciException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first addkpi_ci in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching addkpi_ci, or <code>null</code> if a matching addkpi_ci could not be found
	*/
	public static addkpi_ci fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<addkpi_ci> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last addkpi_ci in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching addkpi_ci
	* @throws NoSuchaddkpi_ciException if a matching addkpi_ci could not be found
	*/
	public static addkpi_ci findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<addkpi_ci> orderByComparator)
		throws com.astra.anblicks.pdca.exception.NoSuchaddkpi_ciException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last addkpi_ci in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching addkpi_ci, or <code>null</code> if a matching addkpi_ci could not be found
	*/
	public static addkpi_ci fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<addkpi_ci> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the addkpi_cis before and after the current addkpi_ci in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param addKpiId the primary key of the current addkpi_ci
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next addkpi_ci
	* @throws NoSuchaddkpi_ciException if a addkpi_ci with the primary key could not be found
	*/
	public static addkpi_ci[] findByUuid_C_PrevAndNext(long addKpiId,
		java.lang.String uuid, long companyId,
		OrderByComparator<addkpi_ci> orderByComparator)
		throws com.astra.anblicks.pdca.exception.NoSuchaddkpi_ciException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(addKpiId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the addkpi_cis where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of addkpi_cis where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching addkpi_cis
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Caches the addkpi_ci in the entity cache if it is enabled.
	*
	* @param addkpi_ci the addkpi_ci
	*/
	public static void cacheResult(addkpi_ci addkpi_ci) {
		getPersistence().cacheResult(addkpi_ci);
	}

	/**
	* Caches the addkpi_cis in the entity cache if it is enabled.
	*
	* @param addkpi_cis the addkpi_cis
	*/
	public static void cacheResult(List<addkpi_ci> addkpi_cis) {
		getPersistence().cacheResult(addkpi_cis);
	}

	/**
	* Creates a new addkpi_ci with the primary key. Does not add the addkpi_ci to the database.
	*
	* @param addKpiId the primary key for the new addkpi_ci
	* @return the new addkpi_ci
	*/
	public static addkpi_ci create(long addKpiId) {
		return getPersistence().create(addKpiId);
	}

	/**
	* Removes the addkpi_ci with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param addKpiId the primary key of the addkpi_ci
	* @return the addkpi_ci that was removed
	* @throws NoSuchaddkpi_ciException if a addkpi_ci with the primary key could not be found
	*/
	public static addkpi_ci remove(long addKpiId)
		throws com.astra.anblicks.pdca.exception.NoSuchaddkpi_ciException {
		return getPersistence().remove(addKpiId);
	}

	public static addkpi_ci updateImpl(addkpi_ci addkpi_ci) {
		return getPersistence().updateImpl(addkpi_ci);
	}

	/**
	* Returns the addkpi_ci with the primary key or throws a {@link NoSuchaddkpi_ciException} if it could not be found.
	*
	* @param addKpiId the primary key of the addkpi_ci
	* @return the addkpi_ci
	* @throws NoSuchaddkpi_ciException if a addkpi_ci with the primary key could not be found
	*/
	public static addkpi_ci findByPrimaryKey(long addKpiId)
		throws com.astra.anblicks.pdca.exception.NoSuchaddkpi_ciException {
		return getPersistence().findByPrimaryKey(addKpiId);
	}

	/**
	* Returns the addkpi_ci with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param addKpiId the primary key of the addkpi_ci
	* @return the addkpi_ci, or <code>null</code> if a addkpi_ci with the primary key could not be found
	*/
	public static addkpi_ci fetchByPrimaryKey(long addKpiId) {
		return getPersistence().fetchByPrimaryKey(addKpiId);
	}

	public static java.util.Map<java.io.Serializable, addkpi_ci> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the addkpi_cis.
	*
	* @return the addkpi_cis
	*/
	public static List<addkpi_ci> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the addkpi_cis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link addkpi_ciModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of addkpi_cis
	* @param end the upper bound of the range of addkpi_cis (not inclusive)
	* @return the range of addkpi_cis
	*/
	public static List<addkpi_ci> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the addkpi_cis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link addkpi_ciModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of addkpi_cis
	* @param end the upper bound of the range of addkpi_cis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of addkpi_cis
	*/
	public static List<addkpi_ci> findAll(int start, int end,
		OrderByComparator<addkpi_ci> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the addkpi_cis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link addkpi_ciModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of addkpi_cis
	* @param end the upper bound of the range of addkpi_cis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of addkpi_cis
	*/
	public static List<addkpi_ci> findAll(int start, int end,
		OrderByComparator<addkpi_ci> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the addkpi_cis from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of addkpi_cis.
	*
	* @return the number of addkpi_cis
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static addkpi_ciPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<addkpi_ciPersistence, addkpi_ciPersistence> _serviceTracker =
		ServiceTrackerFactory.open(addkpi_ciPersistence.class);
}