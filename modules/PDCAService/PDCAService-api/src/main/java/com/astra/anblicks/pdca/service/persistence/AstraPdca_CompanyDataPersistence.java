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

import com.astra.anblicks.pdca.exception.NoSuchAstraPdca_CompanyDataException;
import com.astra.anblicks.pdca.model.AstraPdca_CompanyData;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the astra pdca_ company data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.astra.anblicks.pdca.service.persistence.impl.AstraPdca_CompanyDataPersistenceImpl
 * @see AstraPdca_CompanyDataUtil
 * @generated
 */
@ProviderType
public interface AstraPdca_CompanyDataPersistence extends BasePersistence<AstraPdca_CompanyData> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AstraPdca_CompanyDataUtil} to access the astra pdca_ company data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the astra pdca_ company data in the entity cache if it is enabled.
	*
	* @param astraPdca_CompanyData the astra pdca_ company data
	*/
	public void cacheResult(AstraPdca_CompanyData astraPdca_CompanyData);

	/**
	* Caches the astra pdca_ company datas in the entity cache if it is enabled.
	*
	* @param astraPdca_CompanyDatas the astra pdca_ company datas
	*/
	public void cacheResult(
		java.util.List<AstraPdca_CompanyData> astraPdca_CompanyDatas);

	/**
	* Creates a new astra pdca_ company data with the primary key. Does not add the astra pdca_ company data to the database.
	*
	* @param companyId the primary key for the new astra pdca_ company data
	* @return the new astra pdca_ company data
	*/
	public AstraPdca_CompanyData create(long companyId);

	/**
	* Removes the astra pdca_ company data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param companyId the primary key of the astra pdca_ company data
	* @return the astra pdca_ company data that was removed
	* @throws NoSuchAstraPdca_CompanyDataException if a astra pdca_ company data with the primary key could not be found
	*/
	public AstraPdca_CompanyData remove(long companyId)
		throws NoSuchAstraPdca_CompanyDataException;

	public AstraPdca_CompanyData updateImpl(
		AstraPdca_CompanyData astraPdca_CompanyData);

	/**
	* Returns the astra pdca_ company data with the primary key or throws a {@link NoSuchAstraPdca_CompanyDataException} if it could not be found.
	*
	* @param companyId the primary key of the astra pdca_ company data
	* @return the astra pdca_ company data
	* @throws NoSuchAstraPdca_CompanyDataException if a astra pdca_ company data with the primary key could not be found
	*/
	public AstraPdca_CompanyData findByPrimaryKey(long companyId)
		throws NoSuchAstraPdca_CompanyDataException;

	/**
	* Returns the astra pdca_ company data with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param companyId the primary key of the astra pdca_ company data
	* @return the astra pdca_ company data, or <code>null</code> if a astra pdca_ company data with the primary key could not be found
	*/
	public AstraPdca_CompanyData fetchByPrimaryKey(long companyId);

	@Override
	public java.util.Map<java.io.Serializable, AstraPdca_CompanyData> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the astra pdca_ company datas.
	*
	* @return the astra pdca_ company datas
	*/
	public java.util.List<AstraPdca_CompanyData> findAll();

	/**
	* Returns a range of all the astra pdca_ company datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AstraPdca_CompanyDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of astra pdca_ company datas
	* @param end the upper bound of the range of astra pdca_ company datas (not inclusive)
	* @return the range of astra pdca_ company datas
	*/
	public java.util.List<AstraPdca_CompanyData> findAll(int start, int end);

	/**
	* Returns an ordered range of all the astra pdca_ company datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AstraPdca_CompanyDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of astra pdca_ company datas
	* @param end the upper bound of the range of astra pdca_ company datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of astra pdca_ company datas
	*/
	public java.util.List<AstraPdca_CompanyData> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AstraPdca_CompanyData> orderByComparator);

	/**
	* Returns an ordered range of all the astra pdca_ company datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AstraPdca_CompanyDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of astra pdca_ company datas
	* @param end the upper bound of the range of astra pdca_ company datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of astra pdca_ company datas
	*/
	public java.util.List<AstraPdca_CompanyData> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AstraPdca_CompanyData> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the astra pdca_ company datas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of astra pdca_ company datas.
	*
	* @return the number of astra pdca_ company datas
	*/
	public int countAll();
}