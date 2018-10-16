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

import com.astra.anblicks.pdca.exception.NoSuch_AdminSettingsException;
import com.astra.anblicks.pdca.model.pdca_AdminSettings;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the pdca_ admin settings service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.astra.anblicks.pdca.service.persistence.impl.pdca_AdminSettingsPersistenceImpl
 * @see pdca_AdminSettingsUtil
 * @generated
 */
@ProviderType
public interface pdca_AdminSettingsPersistence extends BasePersistence<pdca_AdminSettings> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link pdca_AdminSettingsUtil} to access the pdca_ admin settings persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the pdca_ admin settings in the entity cache if it is enabled.
	*
	* @param pdca_AdminSettings the pdca_ admin settings
	*/
	public void cacheResult(pdca_AdminSettings pdca_AdminSettings);

	/**
	* Caches the pdca_ admin settingses in the entity cache if it is enabled.
	*
	* @param pdca_AdminSettingses the pdca_ admin settingses
	*/
	public void cacheResult(
		java.util.List<pdca_AdminSettings> pdca_AdminSettingses);

	/**
	* Creates a new pdca_ admin settings with the primary key. Does not add the pdca_ admin settings to the database.
	*
	* @param settings_Id the primary key for the new pdca_ admin settings
	* @return the new pdca_ admin settings
	*/
	public pdca_AdminSettings create(long settings_Id);

	/**
	* Removes the pdca_ admin settings with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param settings_Id the primary key of the pdca_ admin settings
	* @return the pdca_ admin settings that was removed
	* @throws NoSuch_AdminSettingsException if a pdca_ admin settings with the primary key could not be found
	*/
	public pdca_AdminSettings remove(long settings_Id)
		throws NoSuch_AdminSettingsException;

	public pdca_AdminSettings updateImpl(pdca_AdminSettings pdca_AdminSettings);

	/**
	* Returns the pdca_ admin settings with the primary key or throws a {@link NoSuch_AdminSettingsException} if it could not be found.
	*
	* @param settings_Id the primary key of the pdca_ admin settings
	* @return the pdca_ admin settings
	* @throws NoSuch_AdminSettingsException if a pdca_ admin settings with the primary key could not be found
	*/
	public pdca_AdminSettings findByPrimaryKey(long settings_Id)
		throws NoSuch_AdminSettingsException;

	/**
	* Returns the pdca_ admin settings with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param settings_Id the primary key of the pdca_ admin settings
	* @return the pdca_ admin settings, or <code>null</code> if a pdca_ admin settings with the primary key could not be found
	*/
	public pdca_AdminSettings fetchByPrimaryKey(long settings_Id);

	@Override
	public java.util.Map<java.io.Serializable, pdca_AdminSettings> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the pdca_ admin settingses.
	*
	* @return the pdca_ admin settingses
	*/
	public java.util.List<pdca_AdminSettings> findAll();

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
	public java.util.List<pdca_AdminSettings> findAll(int start, int end);

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
	public java.util.List<pdca_AdminSettings> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<pdca_AdminSettings> orderByComparator);

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
	public java.util.List<pdca_AdminSettings> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<pdca_AdminSettings> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the pdca_ admin settingses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of pdca_ admin settingses.
	*
	* @return the number of pdca_ admin settingses
	*/
	public int countAll();
}