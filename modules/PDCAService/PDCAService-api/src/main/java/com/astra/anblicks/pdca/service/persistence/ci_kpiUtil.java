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

import com.astra.anblicks.pdca.model.ci_kpi;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the ci_kpi service. This utility wraps {@link com.astra.anblicks.pdca.service.persistence.impl.ci_kpiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ci_kpiPersistence
 * @see com.astra.anblicks.pdca.service.persistence.impl.ci_kpiPersistenceImpl
 * @generated
 */
@ProviderType
public class ci_kpiUtil {
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
	public static void clearCache(ci_kpi ci_kpi) {
		getPersistence().clearCache(ci_kpi);
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
	public static List<ci_kpi> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ci_kpi> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ci_kpi> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<ci_kpi> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ci_kpi update(ci_kpi ci_kpi) {
		return getPersistence().update(ci_kpi);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ci_kpi update(ci_kpi ci_kpi, ServiceContext serviceContext) {
		return getPersistence().update(ci_kpi, serviceContext);
	}

	/**
	* Returns all the ci_kpis where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching ci_kpis
	*/
	public static List<ci_kpi> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the ci_kpis where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ci_kpiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of ci_kpis
	* @param end the upper bound of the range of ci_kpis (not inclusive)
	* @return the range of matching ci_kpis
	*/
	public static List<ci_kpi> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the ci_kpis where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ci_kpiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of ci_kpis
	* @param end the upper bound of the range of ci_kpis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ci_kpis
	*/
	public static List<ci_kpi> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<ci_kpi> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ci_kpis where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ci_kpiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of ci_kpis
	* @param end the upper bound of the range of ci_kpis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ci_kpis
	*/
	public static List<ci_kpi> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<ci_kpi> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first ci_kpi in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ci_kpi
	* @throws NoSuchci_kpiException if a matching ci_kpi could not be found
	*/
	public static ci_kpi findByUuid_First(java.lang.String uuid,
		OrderByComparator<ci_kpi> orderByComparator)
		throws com.astra.anblicks.pdca.exception.NoSuchci_kpiException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first ci_kpi in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ci_kpi, or <code>null</code> if a matching ci_kpi could not be found
	*/
	public static ci_kpi fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<ci_kpi> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last ci_kpi in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ci_kpi
	* @throws NoSuchci_kpiException if a matching ci_kpi could not be found
	*/
	public static ci_kpi findByUuid_Last(java.lang.String uuid,
		OrderByComparator<ci_kpi> orderByComparator)
		throws com.astra.anblicks.pdca.exception.NoSuchci_kpiException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last ci_kpi in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ci_kpi, or <code>null</code> if a matching ci_kpi could not be found
	*/
	public static ci_kpi fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<ci_kpi> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the ci_kpis before and after the current ci_kpi in the ordered set where uuid = &#63;.
	*
	* @param ciKpiId the primary key of the current ci_kpi
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ci_kpi
	* @throws NoSuchci_kpiException if a ci_kpi with the primary key could not be found
	*/
	public static ci_kpi[] findByUuid_PrevAndNext(long ciKpiId,
		java.lang.String uuid, OrderByComparator<ci_kpi> orderByComparator)
		throws com.astra.anblicks.pdca.exception.NoSuchci_kpiException {
		return getPersistence()
				   .findByUuid_PrevAndNext(ciKpiId, uuid, orderByComparator);
	}

	/**
	* Removes all the ci_kpis where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of ci_kpis where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching ci_kpis
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Caches the ci_kpi in the entity cache if it is enabled.
	*
	* @param ci_kpi the ci_kpi
	*/
	public static void cacheResult(ci_kpi ci_kpi) {
		getPersistence().cacheResult(ci_kpi);
	}

	/**
	* Caches the ci_kpis in the entity cache if it is enabled.
	*
	* @param ci_kpis the ci_kpis
	*/
	public static void cacheResult(List<ci_kpi> ci_kpis) {
		getPersistence().cacheResult(ci_kpis);
	}

	/**
	* Creates a new ci_kpi with the primary key. Does not add the ci_kpi to the database.
	*
	* @param ciKpiId the primary key for the new ci_kpi
	* @return the new ci_kpi
	*/
	public static ci_kpi create(long ciKpiId) {
		return getPersistence().create(ciKpiId);
	}

	/**
	* Removes the ci_kpi with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ciKpiId the primary key of the ci_kpi
	* @return the ci_kpi that was removed
	* @throws NoSuchci_kpiException if a ci_kpi with the primary key could not be found
	*/
	public static ci_kpi remove(long ciKpiId)
		throws com.astra.anblicks.pdca.exception.NoSuchci_kpiException {
		return getPersistence().remove(ciKpiId);
	}

	public static ci_kpi updateImpl(ci_kpi ci_kpi) {
		return getPersistence().updateImpl(ci_kpi);
	}

	/**
	* Returns the ci_kpi with the primary key or throws a {@link NoSuchci_kpiException} if it could not be found.
	*
	* @param ciKpiId the primary key of the ci_kpi
	* @return the ci_kpi
	* @throws NoSuchci_kpiException if a ci_kpi with the primary key could not be found
	*/
	public static ci_kpi findByPrimaryKey(long ciKpiId)
		throws com.astra.anblicks.pdca.exception.NoSuchci_kpiException {
		return getPersistence().findByPrimaryKey(ciKpiId);
	}

	/**
	* Returns the ci_kpi with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ciKpiId the primary key of the ci_kpi
	* @return the ci_kpi, or <code>null</code> if a ci_kpi with the primary key could not be found
	*/
	public static ci_kpi fetchByPrimaryKey(long ciKpiId) {
		return getPersistence().fetchByPrimaryKey(ciKpiId);
	}

	public static java.util.Map<java.io.Serializable, ci_kpi> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ci_kpis.
	*
	* @return the ci_kpis
	*/
	public static List<ci_kpi> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ci_kpis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ci_kpiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ci_kpis
	* @param end the upper bound of the range of ci_kpis (not inclusive)
	* @return the range of ci_kpis
	*/
	public static List<ci_kpi> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ci_kpis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ci_kpiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ci_kpis
	* @param end the upper bound of the range of ci_kpis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ci_kpis
	*/
	public static List<ci_kpi> findAll(int start, int end,
		OrderByComparator<ci_kpi> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ci_kpis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ci_kpiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ci_kpis
	* @param end the upper bound of the range of ci_kpis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ci_kpis
	*/
	public static List<ci_kpi> findAll(int start, int end,
		OrderByComparator<ci_kpi> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ci_kpis from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ci_kpis.
	*
	* @return the number of ci_kpis
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ci_kpiPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ci_kpiPersistence, ci_kpiPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ci_kpiPersistence.class);
}