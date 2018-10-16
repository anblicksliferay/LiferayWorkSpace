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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AstraPdca_CompanyDataLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AstraPdca_CompanyDataLocalService
 * @generated
 */
@ProviderType
public class AstraPdca_CompanyDataLocalServiceWrapper
	implements AstraPdca_CompanyDataLocalService,
		ServiceWrapper<AstraPdca_CompanyDataLocalService> {
	public AstraPdca_CompanyDataLocalServiceWrapper(
		AstraPdca_CompanyDataLocalService astraPdca_CompanyDataLocalService) {
		_astraPdca_CompanyDataLocalService = astraPdca_CompanyDataLocalService;
	}

	/**
	* Adds the astra pdca_ company data to the database. Also notifies the appropriate model listeners.
	*
	* @param astraPdca_CompanyData the astra pdca_ company data
	* @return the astra pdca_ company data that was added
	*/
	@Override
	public com.astra.anblicks.pdca.model.AstraPdca_CompanyData addAstraPdca_CompanyData(
		com.astra.anblicks.pdca.model.AstraPdca_CompanyData astraPdca_CompanyData) {
		return _astraPdca_CompanyDataLocalService.addAstraPdca_CompanyData(astraPdca_CompanyData);
	}

	/**
	* Creates a new astra pdca_ company data with the primary key. Does not add the astra pdca_ company data to the database.
	*
	* @param companyId the primary key for the new astra pdca_ company data
	* @return the new astra pdca_ company data
	*/
	@Override
	public com.astra.anblicks.pdca.model.AstraPdca_CompanyData createAstraPdca_CompanyData(
		long companyId) {
		return _astraPdca_CompanyDataLocalService.createAstraPdca_CompanyData(companyId);
	}

	/**
	* Deletes the astra pdca_ company data from the database. Also notifies the appropriate model listeners.
	*
	* @param astraPdca_CompanyData the astra pdca_ company data
	* @return the astra pdca_ company data that was removed
	*/
	@Override
	public com.astra.anblicks.pdca.model.AstraPdca_CompanyData deleteAstraPdca_CompanyData(
		com.astra.anblicks.pdca.model.AstraPdca_CompanyData astraPdca_CompanyData) {
		return _astraPdca_CompanyDataLocalService.deleteAstraPdca_CompanyData(astraPdca_CompanyData);
	}

	/**
	* Deletes the astra pdca_ company data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param companyId the primary key of the astra pdca_ company data
	* @return the astra pdca_ company data that was removed
	* @throws PortalException if a astra pdca_ company data with the primary key could not be found
	*/
	@Override
	public com.astra.anblicks.pdca.model.AstraPdca_CompanyData deleteAstraPdca_CompanyData(
		long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _astraPdca_CompanyDataLocalService.deleteAstraPdca_CompanyData(companyId);
	}

	@Override
	public com.astra.anblicks.pdca.model.AstraPdca_CompanyData fetchAstraPdca_CompanyData(
		long companyId) {
		return _astraPdca_CompanyDataLocalService.fetchAstraPdca_CompanyData(companyId);
	}

	/**
	* Returns the astra pdca_ company data with the primary key.
	*
	* @param companyId the primary key of the astra pdca_ company data
	* @return the astra pdca_ company data
	* @throws PortalException if a astra pdca_ company data with the primary key could not be found
	*/
	@Override
	public com.astra.anblicks.pdca.model.AstraPdca_CompanyData getAstraPdca_CompanyData(
		long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _astraPdca_CompanyDataLocalService.getAstraPdca_CompanyData(companyId);
	}

	/**
	* Updates the astra pdca_ company data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param astraPdca_CompanyData the astra pdca_ company data
	* @return the astra pdca_ company data that was updated
	*/
	@Override
	public com.astra.anblicks.pdca.model.AstraPdca_CompanyData updateAstraPdca_CompanyData(
		com.astra.anblicks.pdca.model.AstraPdca_CompanyData astraPdca_CompanyData) {
		return _astraPdca_CompanyDataLocalService.updateAstraPdca_CompanyData(astraPdca_CompanyData);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _astraPdca_CompanyDataLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _astraPdca_CompanyDataLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _astraPdca_CompanyDataLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _astraPdca_CompanyDataLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _astraPdca_CompanyDataLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of astra pdca_ company datas.
	*
	* @return the number of astra pdca_ company datas
	*/
	@Override
	public int getAstraPdca_CompanyDatasCount() {
		return _astraPdca_CompanyDataLocalService.getAstraPdca_CompanyDatasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _astraPdca_CompanyDataLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _astraPdca_CompanyDataLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.astra.anblicks.pdca.model.impl.AstraPdca_CompanyDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _astraPdca_CompanyDataLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.astra.anblicks.pdca.model.impl.AstraPdca_CompanyDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _astraPdca_CompanyDataLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the astra pdca_ company datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.astra.anblicks.pdca.model.impl.AstraPdca_CompanyDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of astra pdca_ company datas
	* @param end the upper bound of the range of astra pdca_ company datas (not inclusive)
	* @return the range of astra pdca_ company datas
	*/
	@Override
	public java.util.List<com.astra.anblicks.pdca.model.AstraPdca_CompanyData> getAstraPdca_CompanyDatas(
		int start, int end) {
		return _astraPdca_CompanyDataLocalService.getAstraPdca_CompanyDatas(start,
			end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _astraPdca_CompanyDataLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _astraPdca_CompanyDataLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public AstraPdca_CompanyDataLocalService getWrappedService() {
		return _astraPdca_CompanyDataLocalService;
	}

	@Override
	public void setWrappedService(
		AstraPdca_CompanyDataLocalService astraPdca_CompanyDataLocalService) {
		_astraPdca_CompanyDataLocalService = astraPdca_CompanyDataLocalService;
	}

	private AstraPdca_CompanyDataLocalService _astraPdca_CompanyDataLocalService;
}