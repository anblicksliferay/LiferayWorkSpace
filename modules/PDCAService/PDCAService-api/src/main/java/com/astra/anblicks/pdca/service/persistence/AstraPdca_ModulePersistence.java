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

import com.astra.anblicks.pdca.exception.NoSuchAstraPdca_ModuleException;
import com.astra.anblicks.pdca.model.AstraPdca_Module;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the astra pdca_ module service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.astra.anblicks.pdca.service.persistence.impl.AstraPdca_ModulePersistenceImpl
 * @see AstraPdca_ModuleUtil
 * @generated
 */
@ProviderType
public interface AstraPdca_ModulePersistence extends BasePersistence<AstraPdca_Module> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AstraPdca_ModuleUtil} to access the astra pdca_ module persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the astra pdca_ module in the entity cache if it is enabled.
	*
	* @param astraPdca_Module the astra pdca_ module
	*/
	public void cacheResult(AstraPdca_Module astraPdca_Module);

	/**
	* Caches the astra pdca_ modules in the entity cache if it is enabled.
	*
	* @param astraPdca_Modules the astra pdca_ modules
	*/
	public void cacheResult(java.util.List<AstraPdca_Module> astraPdca_Modules);

	/**
	* Creates a new astra pdca_ module with the primary key. Does not add the astra pdca_ module to the database.
	*
	* @param ModuleId the primary key for the new astra pdca_ module
	* @return the new astra pdca_ module
	*/
	public AstraPdca_Module create(long ModuleId);

	/**
	* Removes the astra pdca_ module with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ModuleId the primary key of the astra pdca_ module
	* @return the astra pdca_ module that was removed
	* @throws NoSuchAstraPdca_ModuleException if a astra pdca_ module with the primary key could not be found
	*/
	public AstraPdca_Module remove(long ModuleId)
		throws NoSuchAstraPdca_ModuleException;

	public AstraPdca_Module updateImpl(AstraPdca_Module astraPdca_Module);

	/**
	* Returns the astra pdca_ module with the primary key or throws a {@link NoSuchAstraPdca_ModuleException} if it could not be found.
	*
	* @param ModuleId the primary key of the astra pdca_ module
	* @return the astra pdca_ module
	* @throws NoSuchAstraPdca_ModuleException if a astra pdca_ module with the primary key could not be found
	*/
	public AstraPdca_Module findByPrimaryKey(long ModuleId)
		throws NoSuchAstraPdca_ModuleException;

	/**
	* Returns the astra pdca_ module with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ModuleId the primary key of the astra pdca_ module
	* @return the astra pdca_ module, or <code>null</code> if a astra pdca_ module with the primary key could not be found
	*/
	public AstraPdca_Module fetchByPrimaryKey(long ModuleId);

	@Override
	public java.util.Map<java.io.Serializable, AstraPdca_Module> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the astra pdca_ modules.
	*
	* @return the astra pdca_ modules
	*/
	public java.util.List<AstraPdca_Module> findAll();

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
	public java.util.List<AstraPdca_Module> findAll(int start, int end);

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
	public java.util.List<AstraPdca_Module> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AstraPdca_Module> orderByComparator);

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
	public java.util.List<AstraPdca_Module> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AstraPdca_Module> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the astra pdca_ modules from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of astra pdca_ modules.
	*
	* @return the number of astra pdca_ modules
	*/
	public int countAll();
}