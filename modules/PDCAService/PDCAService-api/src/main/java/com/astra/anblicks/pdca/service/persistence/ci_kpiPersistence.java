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

import com.astra.anblicks.pdca.exception.NoSuchci_kpiException;
import com.astra.anblicks.pdca.model.ci_kpi;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the ci_kpi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.astra.anblicks.pdca.service.persistence.impl.ci_kpiPersistenceImpl
 * @see ci_kpiUtil
 * @generated
 */
@ProviderType
public interface ci_kpiPersistence extends BasePersistence<ci_kpi> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ci_kpiUtil} to access the ci_kpi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the ci_kpis where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching ci_kpis
	*/
	public java.util.List<ci_kpi> findByUuid(java.lang.String uuid);

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
	public java.util.List<ci_kpi> findByUuid(java.lang.String uuid, int start,
		int end);

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
	public java.util.List<ci_kpi> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ci_kpi> orderByComparator);

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
	public java.util.List<ci_kpi> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ci_kpi> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first ci_kpi in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ci_kpi
	* @throws NoSuchci_kpiException if a matching ci_kpi could not be found
	*/
	public ci_kpi findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ci_kpi> orderByComparator)
		throws NoSuchci_kpiException;

	/**
	* Returns the first ci_kpi in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ci_kpi, or <code>null</code> if a matching ci_kpi could not be found
	*/
	public ci_kpi fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ci_kpi> orderByComparator);

	/**
	* Returns the last ci_kpi in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ci_kpi
	* @throws NoSuchci_kpiException if a matching ci_kpi could not be found
	*/
	public ci_kpi findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ci_kpi> orderByComparator)
		throws NoSuchci_kpiException;

	/**
	* Returns the last ci_kpi in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ci_kpi, or <code>null</code> if a matching ci_kpi could not be found
	*/
	public ci_kpi fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ci_kpi> orderByComparator);

	/**
	* Returns the ci_kpis before and after the current ci_kpi in the ordered set where uuid = &#63;.
	*
	* @param ciKpiId the primary key of the current ci_kpi
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ci_kpi
	* @throws NoSuchci_kpiException if a ci_kpi with the primary key could not be found
	*/
	public ci_kpi[] findByUuid_PrevAndNext(long ciKpiId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ci_kpi> orderByComparator)
		throws NoSuchci_kpiException;

	/**
	* Removes all the ci_kpis where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of ci_kpis where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching ci_kpis
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Caches the ci_kpi in the entity cache if it is enabled.
	*
	* @param ci_kpi the ci_kpi
	*/
	public void cacheResult(ci_kpi ci_kpi);

	/**
	* Caches the ci_kpis in the entity cache if it is enabled.
	*
	* @param ci_kpis the ci_kpis
	*/
	public void cacheResult(java.util.List<ci_kpi> ci_kpis);

	/**
	* Creates a new ci_kpi with the primary key. Does not add the ci_kpi to the database.
	*
	* @param ciKpiId the primary key for the new ci_kpi
	* @return the new ci_kpi
	*/
	public ci_kpi create(long ciKpiId);

	/**
	* Removes the ci_kpi with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ciKpiId the primary key of the ci_kpi
	* @return the ci_kpi that was removed
	* @throws NoSuchci_kpiException if a ci_kpi with the primary key could not be found
	*/
	public ci_kpi remove(long ciKpiId) throws NoSuchci_kpiException;

	public ci_kpi updateImpl(ci_kpi ci_kpi);

	/**
	* Returns the ci_kpi with the primary key or throws a {@link NoSuchci_kpiException} if it could not be found.
	*
	* @param ciKpiId the primary key of the ci_kpi
	* @return the ci_kpi
	* @throws NoSuchci_kpiException if a ci_kpi with the primary key could not be found
	*/
	public ci_kpi findByPrimaryKey(long ciKpiId) throws NoSuchci_kpiException;

	/**
	* Returns the ci_kpi with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ciKpiId the primary key of the ci_kpi
	* @return the ci_kpi, or <code>null</code> if a ci_kpi with the primary key could not be found
	*/
	public ci_kpi fetchByPrimaryKey(long ciKpiId);

	@Override
	public java.util.Map<java.io.Serializable, ci_kpi> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the ci_kpis.
	*
	* @return the ci_kpis
	*/
	public java.util.List<ci_kpi> findAll();

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
	public java.util.List<ci_kpi> findAll(int start, int end);

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
	public java.util.List<ci_kpi> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ci_kpi> orderByComparator);

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
	public java.util.List<ci_kpi> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ci_kpi> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the ci_kpis from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of ci_kpis.
	*
	* @return the number of ci_kpis
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}